package com.develhope.java10.hellodependencyinjection;

public class FastEngine implements IEngine {
    @Override
    public float accelerationSpeed(float currentSpeed) {
        return currentSpeed * 0.03f + 15.0f; 
    }
}
