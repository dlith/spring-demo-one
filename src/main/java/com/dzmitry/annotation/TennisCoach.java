package com.dzmitry.annotation;

import com.dzmitry.springdemo.Coach;
import org.springframework.stereotype.Component;

@Component("theBeanNameTennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "";
    }
}
