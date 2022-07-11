package com.dzmitry.annotation.configuration;

import com.dzmitry.annotation.SwimCoach;
import com.dzmitry.springdemo.Coach;
import com.dzmitry.springdemo.service.FortuneService;
import com.dzmitry.springdemo.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.dzmitry")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
