package com.learn.funi;

public interface Ihorse {
	default void run() {
		System.out.println("horse run");
	}
}
