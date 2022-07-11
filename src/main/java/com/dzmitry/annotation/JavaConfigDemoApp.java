package com.dzmitry.annotation;

import com.dzmitry.annotation.configuration.SportConfig;
import com.dzmitry.springdemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("theBeanNameTennisCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
