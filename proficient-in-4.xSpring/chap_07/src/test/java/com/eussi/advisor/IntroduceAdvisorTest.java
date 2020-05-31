package com.eussi.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eussi.introduce.ForumService;
import com.eussi.introduce.Monitorable;
import static org.testng.Assert.*;
import org.testng.annotations.*;
public class IntroduceAdvisorTest {

    @Test
	public void introduce() {
		String configPath = "com/eussi/advisor/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService)ctx.getBean("forumService");
        forumService.removeForum(10);
        Monitorable moniterable = (Monitorable)forumService;
        moniterable.setMonitorActive(true);
        forumService.removeForum(10);
	}
}
