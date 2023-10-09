package com.example.jaoo.m3.s9.ex1;

public class Warrior extends Actor {

	protected Warrior(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Wizard) {
			return false;
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
		return "Warrior: Name=" + getName() + ", Power=" + getPower() + ".";
	}

}
