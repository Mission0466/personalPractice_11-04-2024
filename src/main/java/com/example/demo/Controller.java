package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // how to connect with Coach or cricket coach files ?
    // ans: using DI we can connect to our coach

    // define a private field variable for the dependency
    private Coach myCoach;    // object variable

    @Autowired
    public Controller(@Qualifier("cricketCoach") Coach theCoach){   // Private Coach myCoach = new Coach() we are saying to constructor go and create the object on Coach file and set the object to myCoach on the line num: 13
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}


// behind the scenes

//public class Coach {
//    String coach;
//}
//
//// main
//main{
//    Private Coach myCoach = new Coach();
//}