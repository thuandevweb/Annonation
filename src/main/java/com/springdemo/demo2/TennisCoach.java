package com.springdemo.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;

    @PostConstruct
    public void doMyHello() {
        System.out.println("Hello");
    }

    @PreDestroy
    public void doMyJob() {
        System.out.println("Bye");
    }

    public TennisCoach() {
        System.out.println("Default constructor");
    }

    /*
     * @Autowired public void setFortuneService(FortuneService fortuneService) {
     * System.out.println("Setter method"); this.fortuneService = fortuneService; }
     */
    /*
     * @Autowired public TennisCoach(FortuneService theFortuneService) {
     * fortuneService = theFortuneService; }
     */

    @Override
    public String getDailyWorkOut() {
        return "Do racket 50 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
