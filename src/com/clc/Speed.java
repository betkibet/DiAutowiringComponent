package com.clc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Speed {
	@Autowired
	Engine engine;
	
	public void printEngineDetails() {
		System.out.println("Engine from Speed Class: " + engine.getModelYear());
	}
	
}
