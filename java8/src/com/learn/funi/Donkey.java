package com.learn.funi;

public class Donkey implements Animal,Ihorse{

	@Override
	public void eat() {
		
	}

	@Override
	public void run() {
		Animal.super.run();
	}

}
