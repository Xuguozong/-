package com.learn.funi;
@FunctionalInterface
public interface Animal {
	void eat();
	default void run(){
		System.out.println("animal run");
	}
}
