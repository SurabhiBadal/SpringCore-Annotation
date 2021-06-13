package com.lenovo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortuneMessage() {
        return "Today is your Lucky Day";
    }
}
