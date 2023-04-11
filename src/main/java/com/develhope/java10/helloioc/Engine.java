package com.develhope.java10.helloioc;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public float accelerationSpeed(float currentSpeed) {
        return currentSpeed * 0.01f + 5.0f;
    }
}
