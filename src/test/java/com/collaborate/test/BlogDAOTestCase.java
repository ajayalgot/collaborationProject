package com.collaborate.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.dao.BlogDAO;

public class BlogDAOTestCase{
	static BlogDAO blogDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationConfig =new AnnotationConfigApplicationContext();
		
		annotationConfigApplicationConfig.scan("com.collaborate");
		annotationConfigApplicationConfig.refresh();
	}
	@Test
	public void test()
	{
		fail("not yet implemented");
	}

}
