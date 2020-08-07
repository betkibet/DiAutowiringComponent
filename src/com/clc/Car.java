package com.clc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Engine engine;
	
	public void printCarDetails() {
		System.out.println("Engine from Car class: " + engine.getModelYear());
	}
}
