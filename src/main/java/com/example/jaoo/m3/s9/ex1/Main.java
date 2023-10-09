/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
	/**
	 * Create a bunch of actors
	 * <p>
	 * Let them fight against each others
	 * <p>
	 * Peer-to-peer fight, the most skilled one wins
	 * <p>
	 * Wizards always beat warriors
	 * <p>
	 * In the end, let the user knows who survived
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO: create actors, both warriors and wizards
		Actor[] actors = { new Wizard("Luca", 54), new Wizard("Marco", 37), new Warrior("Antonio", 40),
				new Wizard("Chiara", 85) };

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		System.out.println("Let's fight ...");
		for (int i=0;i<actors.length;i+=2) {
			if(actors[i].fight(actors[i+1])) {
				System.out.println(actors[i].getName()+" vince il duello");
			}else {System.out.println(actors[i+1].getName()+" vince il duello");};
		}
	}
}
