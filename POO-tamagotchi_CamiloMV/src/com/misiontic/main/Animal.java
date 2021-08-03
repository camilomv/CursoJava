package com.misiontic.main;

import java.awt.Color;

public class Animal {
	
	float weight;
	int happiness;//0 to 100, 0 means sad and 100 is happy
	int health;//0 to 100, 0 is death and 100 is healthy.
	int hungry;//0 to 100, 0 means full and 100 means starving.
	int sleep; //0 to 100, 0 awake y 100 sleepy
	boolean awake; //0 is sleeping and 1 is awake
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	public void eat(Food food) {
		weight = weight + 2;
		if(hungry <= food.calories) {
			hungry = 0;
			System.out.println("I´m Full, if I eat more could get sick");
			health = health - 2;
		}else {
			hungry = hungry - food.calories;
		}
	}
	
	private void eat() {
		sleep = 100;
		health = health + 1;
	}
	
	private void sleep() {
		
	}

	private void makeExercise() {
		happiness = happiness + 1;
		hungry = hungry - 10;
		health = health + 5;
		weight = weight - 2;
		sleep = sleep + 5;		
	}
	
	private void play() {
		happiness = happiness + 2;
		hungry = hungry - 10;
		health = health + 3;
		weight = weight - 1;
		sleep = sleep + 5;	
	}
	
	
	
	private void goToVeterinary() {
		
	}

}
