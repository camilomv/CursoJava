package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		Animal cat = new Animal();		
		cat.weight = 10;
		cat.happiness = 100;//0 to 100, 0 means sad and 100 is happy.
		cat.health = 100;//0 to 100, 0 is death and 100 is healthy.
		cat.hungry = 0;//0 to 100, 0 means full and 100 means starving.
		cat.sleep = 0; //0 to 100, 0 awake y 100 sleepy
		cat.awake = true; //false is sleepy and true is awake
		
		Food apple = new Food();
		apple.calories = 5;
		Veterinary veterinary = new Veterinary();
		Medicine m = veterinary.prescribeMedicine(cat);
		cat.eat(apple);
		System.out.println("The Medicine is: " + m.name);
		
		System.out.println("cat큦 weight: " + cat.weight);
		System.out.println("cat큦 happiness: " + cat.happiness);
		System.out.println("cat큦 hungry: " + cat.hungry);
		System.out.println("cat큦 health: " + cat.health);

	}

}
