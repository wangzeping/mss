package com.ping.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ConfigurableApplicationContext context;  
	  
    
    public static void main(String[] args) throws Exception{
    	
    	RedisTest service;
    	context = new ClassPathXmlApplicationContext(
                "classpath:spring/*.xml");  
        service = (RedisTest) context.getBean("redisTest");
//        int i = 1;  
//        while (true) {
//            Thread.sleep(1);  
//            try {  
//                service.mulitThreadSaveAndFind("" + i);  
//            } catch (Exception e) { 
//                e.printStackTrace();  
//            }  
//            i++;  
//        }
        
        String key = "name";
        
        String value = "‘Û∆Ωab";
        
        service.set(key,value); 
        System.out.println(service.get(key)); 
    	
	}

}
