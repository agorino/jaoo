package com.example.jaoo.m3.s9.ex1;

public class Wizard extends Actor {

	protected Wizard(String name, int power) {
		super(name, power);
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior) {
			return true;
		} else {
			if (this.getPower() > enemy.getPower()) {
				return true;
			} else {
				return false;
			}
		}

	}

	@Override
	public String toString() {
		return "Wizard: Name=" + getName() + ", Power=" + getPower() + ".";
	}
	
	

}
