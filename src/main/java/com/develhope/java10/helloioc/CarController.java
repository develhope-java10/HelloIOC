package com.develhope.java10.helloioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("car")
public class CarController {
    @Autowired
    private Car car;

    @GetMapping("/state")
    @ResponseBody
    public float getCarState() {
        return car.getCurrentSpeed();
    }
    
}
