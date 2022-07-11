package com.dzmitry.annotation;

import com.dzmitry.springdemo.Coach;
import com.dzmitry.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("theBeanNameTennisCoach")
public class TennisCoach implements Coach {

    //@Autowired
    //@Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    @PostConstruct
    public void doSomePostConstruct(){
        System.out.println(">> doSomePostConstruct TennisCoach");
    }

    @PreDestroy
    public void doSomePreDestroy(){
        System.out.println(">> doSomePreDestroy TennisCoach");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    //@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> inside setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
