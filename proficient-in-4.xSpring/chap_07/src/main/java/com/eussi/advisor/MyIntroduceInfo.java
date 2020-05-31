package com.eussi.advisor;

import org.springframework.aop.support.IntroductionInfoSupport;

import com.eussi.introduce.Monitorable;

public class MyIntroduceInfo extends IntroductionInfoSupport{
   public MyIntroduceInfo(){
	   super();
	   super.publishedInterfaces.add(Monitorable.class);
   }
}
