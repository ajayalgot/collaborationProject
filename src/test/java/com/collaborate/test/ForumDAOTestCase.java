package com.collaborate.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.dao.ForumDAO;
import com.collaborate.model.Forum;



public class ForumDAOTestCase {

	
	static ForumDAO forumDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		forumDao=(ForumDAO)annotationConfigAppContext.getBean("forumDao");
	}
	
	@Test
	
	public void createForumTest()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("Sai Mahesh");
	forum.setForumContent("Sai Is Thop");
	
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in forum Creation",forumDao.createForum(forum));
	}
	
	
	@Ignore
    @Test
	public void approveForumTest()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("Sai Mahesh");
	forum.setForumContent("Sai Is Thop");
	
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in Approving forum",forumDao.approveForum(forum));
	}
	
	
	
}