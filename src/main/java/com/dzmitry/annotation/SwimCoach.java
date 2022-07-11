package com.dzmitry.annotation;

import com.dzmitry.springdemo.Coach;
import com.dzmitry.springdemo.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public SwimCoach() {
        System.out.println(">> inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
