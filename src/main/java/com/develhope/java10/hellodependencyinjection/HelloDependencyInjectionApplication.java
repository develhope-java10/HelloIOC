package com.develhope.java10.hellodependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDependencyInjectionApplication {

	public static void main(String[] args) {
		System.out.println("### Testing with 50cc engine...");
		benchmarkComponents(new Car(new FiftyCCEngine(), new DangerousBrakes(), 100.0f));
		System.out.println("### Testing with fast engine...");
		benchmarkComponents(new Car(new FastEngine(), new DangerousBrakes(), 100.0f));

		// SpringApplication.run(HelloDependencyInjectionApplication.class, args);
	}

	private static void benchmarkComponents(Car car) {
		System.out.println("Accelerating...");
		for(int i = 0; i < 10; ++i) {
			car.accelerate();
			System.out.println("Speed: " + car.getCurrentSpeed());
		}

		System.out.println("Decelerating...");
		for(int i = 0; i < 5; ++i) {
			car.decelerate();
			System.out.println("Speed: " + car.getCurrentSpeed());
		}
	}

}
