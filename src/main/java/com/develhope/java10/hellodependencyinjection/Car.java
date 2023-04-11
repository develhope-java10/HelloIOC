package com.develhope.java10.hellodependencyinjection;

public class Car {
    private IEngine engine;
    private IBrakes brakes;

    private float currentSpeed;

    private final float carWeight;

    public Car(IEngine engine, IBrakes brakes, float carWeight) {
        this.currentSpeed = 0.0f;
        this.carWeight = carWeight;

        this.engine = engine;
        this.brakes = brakes;
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
