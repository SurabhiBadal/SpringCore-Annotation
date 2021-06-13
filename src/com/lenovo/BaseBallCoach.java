package com.lenovo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseBallCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice BaseBall fro 30 Minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneMessage();
    }

    //define init and destroy methods
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("\n Inside of BaseBallCoach --> doMyStartupStuff");
    }
    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("\n Inside of BaseBallCoach --> dodoCleanUpStuff");
    }

}
