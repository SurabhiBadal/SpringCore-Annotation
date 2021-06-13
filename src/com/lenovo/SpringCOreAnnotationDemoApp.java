package com.lenovo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCOreAnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach=context.getBean("baseBallCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}
