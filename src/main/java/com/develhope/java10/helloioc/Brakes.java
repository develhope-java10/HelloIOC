package com.develhope.java10.helloioc;

import org.springframework.stereotype.Component;

@Component
public class Brakes {
    public float decelerationSpeed(float currentSpeed, float carWeight) {
        return currentSpeed * 0.01f + carWeight * 0.2f;
    }
}
