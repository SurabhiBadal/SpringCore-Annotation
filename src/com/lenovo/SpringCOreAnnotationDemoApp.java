package com.lenovo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCOreAnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach=context.getBean("baseBallCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
