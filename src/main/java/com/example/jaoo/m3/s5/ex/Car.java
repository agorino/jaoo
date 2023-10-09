/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public Car() {
		log.info("Car created");
	}

	public void turn_left() {
	}

	public void turn_right() {
	}

	public void brake() {
	}

	public String temp(int temp) {
		return "La temperatura della macchina ora è a " + temp + " gradi.";
	};
}
