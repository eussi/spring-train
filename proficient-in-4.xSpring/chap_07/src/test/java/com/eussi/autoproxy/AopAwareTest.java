package com.eussi.autoproxy;

import com.eussi.advisor.Seller;
import com.eussi.advisor.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AopAwareTest {
	@Test
	public void autoProxy() {
		String configPath = "com/eussi/autoproxy/beans-aware.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter) ctx.getBean("waiter");
		waiter.serveTo("John");
		//waiter.greetTo("John");
	}
}
