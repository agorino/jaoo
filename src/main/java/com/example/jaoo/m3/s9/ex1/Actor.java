/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
	/**
	 * Canonical constructor
	 * 
	 * @param name the actor name
	 */
	private String name;
	private int power;

	protected Actor(String name, int power) {
		// TODO
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	/**
	 * Fight against an enemy
	 * 
	 * @param enemy another actor
	 * @return true if the current actor wins
	 */
	public abstract boolean fight(Actor enemy);

	@Override
	public String toString() {
		return "Actor [name=" + name + ", power=" + power + "]";
	}

}


