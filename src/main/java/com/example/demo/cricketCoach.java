package com.example.demo;

import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class cricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 30mins";  // behaviour
    }
}
