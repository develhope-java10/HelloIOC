package com.develhope.java10.hellodependencyinjection;

public class DangerousBrakes implements IBrakes {
    @Override
    public float decelerationSpeed(float currentSpeed, float carWeight) {
        return currentSpeed * 0.1f + carWeight * 0.001f;
    }
}
