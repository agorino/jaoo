/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning {
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public Bus() {
		log.info("Bus created");
	}

	public void turn_left() {

	}

	public void turn_right() {
	}

	public void brake() {
	}

	public String temp(int temp) {
		return "La temperatura del bus ora è a " + temp + " gradi.";
	};
}
