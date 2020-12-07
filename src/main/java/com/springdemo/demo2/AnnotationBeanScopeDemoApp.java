package com.springdemo.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean check = (tCoach == alphaCoach);
        System.out.println(check);

        System.out.println(tCoach);

        System.out.println(alphaCoach);

        context.close();
    }
}
