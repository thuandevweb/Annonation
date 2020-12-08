package com.springdemo.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo.class);

        SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(myCoach.getDailyWorkOut());

        System.out.println(myCoach.getDailyFortune());

        System.out.println(myCoach.getEmail());

        System.out.println(myCoach.getTeam());

        context.close();
    }

}
