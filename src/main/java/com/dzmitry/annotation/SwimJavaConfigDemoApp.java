package com.dzmitry.annotation;

import com.dzmitry.annotation.configuration.SportConfig;
import com.dzmitry.springdemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
