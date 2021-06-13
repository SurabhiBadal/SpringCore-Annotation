package com.lenovo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortuneMessage() {
        return "Today is you unlucky day Don't go out";
    }
}
