package com.springdemo.demo2;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public SwimCoach(FortuneService tFortuneService) {
        fortuneService = tFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
