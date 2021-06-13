package com.lenovo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice BaseBall fro 30 Minutes";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortuneMessage();
    }
}
