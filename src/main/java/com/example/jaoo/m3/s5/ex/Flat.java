/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Flat is-a Conditioning
 */
public class Flat implements Conditioning{
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public Flat() {
		log.info("Flat created");
	}

	

	public String temp(int temp) {
		// TODO Auto-generated method stub
		return "La temperatura dell'appartamento ora è a " + temp + " gradi.";
	};
}
