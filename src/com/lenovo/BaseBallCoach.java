package com.lenovo;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice BaseBall fro 30 Minutes";
    }
}
