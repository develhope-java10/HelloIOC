package com.develhope.java10.hellodependencyinjection;

public class FiftyCCEngine implements IEngine {
    @Override
    public float accelerationSpeed(float currentSpeed) {
        return currentSpeed * 0.01f + 3.0f; 
    }
}
