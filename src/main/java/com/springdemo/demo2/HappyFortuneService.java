package com.springdemo.demo2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortuneService() {
        return "Today is your lucky day";
    }
}
