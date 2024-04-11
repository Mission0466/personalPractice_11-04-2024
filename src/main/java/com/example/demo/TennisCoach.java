package com.example.demo;

import org.springframework.stereotype.Component;

@Component("TennisCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for 2hrs";
    }
}
