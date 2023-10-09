/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: MotorBike is-a Vehicle
 */
public class MotorBike extends Vehicle implements Conditioning {
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public MotorBike() {
		log.info("MotorBike created");
	}

	public void turn_left() {
	}

	public void turn_right() {
	}

	public void brake() {
	}

	public String temp(int temp) {
		return "La temperatura della moto ora è a " + temp + " gradi.";
	};

}
