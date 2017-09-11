package com.collaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.collaborate.dao.BlogDAO;
import com.collaborate.dao.BlogDAOImpl;

@Configuration
@ComponentScan("com.collaborate")
@EnableTransactionManagement
public class HbConfig {
	
	// create a datasource object which is used for localSessionFactor
	
	public DataSource getOracleDataSourceObject()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		driverManagerDataSource.setUsername("hr");
		driverManagerDataSource.setPassword("hr");
		System.out.println("Datasource");
		return driverManagerDataSource;
	}
	
	//2. create a hb properties which is used for localsessionfactor
	public Properties getHibernateProperties()
	{
		
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		
		properties.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		return properties;
	}
	
	//3.creating session factoryBean using LocalSessionFactory
	@Bean
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(getOracleDataSourceObject());
		localSessionFactoryBuilder.addProperties(getHibernateProperties());
		localSessionFactoryBuilder.scanPackages("com.collaborate");
		System.out.println("SessionFactory Bean Created");
		
		return localSessionFactoryBuilder.buildSessionFactory();
		
	}
	
    @Bean
    public HibernateTransactionManager getTransaction(SessionFactory sessionFactory)
    {
  	 	System.out.println("Transaction");
		    return new HibernateTransactionManager(sessionFactory);
    }

   @Bean
   public BlogDAO getBlogDAO(SessionFactory sessionFactory)
   {
  	 return new BlogDAOImpl(sessionFactory);
   }
	
}
