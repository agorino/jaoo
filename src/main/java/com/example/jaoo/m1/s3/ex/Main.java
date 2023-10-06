/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

import java.util.Arrays;

/**
 * Exercise: create a few cats and let them meow accordingly to requests
 */
public class Main {
	/**
	 * Follow the instructions in the "to do" comments.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
		String[] colors = { "blue", "green", "yellow", "black", "blue" };

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(colors));

		Cat[] cats = new Cat[names.length];
		System.out.printf("The array of cats has %d length%n", cats.length);

		// TODO: (2) initialize the cats array
		// each cat should have name and color from the arrays above

		for (int i = 0; i < names.length; i++) {
			cats[i] = new Cat(names[i], colors[i]);
		}
		System.out.printf("Currently there are %d cats in the program%n", Cat.getCount());

		System.out.println("TODO 3");

		// TODO: (3) each cat should meow

		for (int i = 0; i < names.length; i++) {
			cats[i].meow();
			;
		}

		System.out.println("TODO 4");
		// TODO: (4) each cat named Kit should meow

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kit")) {
				cats[i].meow();
			}
		}

		System.out.println("TODO 5");
		// TODO: (5) only the first cat named Kit should meow
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kit")) {
				cats[i].meow();
				break;
			}
		}

		System.out.println("TODO 6");
		// TODO: (6) only the cats in even position should meow
		for (int i = 0; i < names.length; i += 2) {

			cats[i].meow();

		}
	}
}
