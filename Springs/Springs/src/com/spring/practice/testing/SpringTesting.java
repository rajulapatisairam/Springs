package com.spring.practice.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.HelloSpring;
import com.spring.practice.Restarunt;

public class SpringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
       ((AbstractApplicationContext)applicationContext).registerShutdownHook();
      Restarunt restarunt= (Restarunt) applicationContext.getBean("restarent");
       Restarunt restarunt1= (Restarunt) applicationContext.getBean("restarent");
       System.out.println("\n Value is: "+restarunt.value);
       restarunt.value=2;
       System.out.println("\n Value is: "+restarunt1.value);
       restarunt.coffiePreparation();
       restarunt.teaPreparation();
       System.out.println("\n\n Waiters are : "+restarunt.getWaiters());
       
	}

}
