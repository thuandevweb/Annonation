package com.springdemo.demo2;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

    Random rand = new Random();

    String[] list = { "Hello i am service 1", "Hello i am service 2", "Hello i am service 3" };

    int index = rand.nextInt(list.length);

    @Override
    public String getFortuneService() {
        return list[index];
    }
}
