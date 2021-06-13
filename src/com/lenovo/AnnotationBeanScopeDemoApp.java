package com.lenovo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // load the config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        Coach theCoach=context.getBean("baseBallCoach",Coach.class);

        Coach alphaCoach=context.getBean("baseBallCoach",Coach.class);

        boolean result=theCoach==alphaCoach;
        System.out.println("Pointing to same object :"+result);
        System.out.println("\n Memory location of theCoach  :"+theCoach);
        System.out.println("\n Memory location of alphaCoach  :"+alphaCoach);

        context.close();
    }
}
