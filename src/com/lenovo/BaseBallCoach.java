package com.lenovo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseBallCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${email}")
    private String emailAddress;
    @Value("${team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Practice BaseBall fro 30 Minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneMessage();
    }
}
