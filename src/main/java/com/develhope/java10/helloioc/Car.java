package com.develhope.java10.helloioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine engine;

    @Autowired
    private Brakes brakes;

    private float currentSpeed;

    private final float carWeight;

    public Car() {
        this.currentSpeed = 0.0f;
        this.carWeight = 100.0f;
    }

    public void accelerate() {
        float accelerationSpeed = this.engine.accelerationSpeed(this.currentSpeed);
        this.currentSpeed += accelerationSpeed;
    }

    public void decelerate() {
        float deceleration = this.brakes.decelerationSpeed(this.currentSpeed, this.carWeight);
        this.currentSpeed -= deceleration;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

}
