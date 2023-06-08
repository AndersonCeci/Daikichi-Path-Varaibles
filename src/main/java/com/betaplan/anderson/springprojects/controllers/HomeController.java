package com.betaplan.anderson.springprojects.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/daikichi/travel/{city}")
    public String today(@PathVariable("city")String city){
        return "Congratulations! You will soon travel to " + city;
    }
    @RequestMapping("/daikichi/lotto/{lottoNumber}")
    public String tomorow(@PathVariable("lottoNumber") Integer lottoNumber){
        if (lottoNumber % 2 == 0){
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        }else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
        }

    }

