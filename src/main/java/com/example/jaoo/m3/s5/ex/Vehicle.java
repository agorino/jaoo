/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * Base of a class hierarchy
 * <P>
 * TODO: it should steer left/right, it should brake
 */
public class Vehicle {
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public Vehicle() {
		log.info("Vehicle created");
	}

	public void turn_left() {
		System.out.println(getClass().getSimpleName() + " is turning left");
	}

	public void turn_right() {
		System.out.println(getClass().getSimpleName() + " is turning right");
	}

	public void brake() {
		System.out.println(getClass().getSimpleName() + " is breaking");
	}
}
