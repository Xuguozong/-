package com.learn.utilfunc;

public class Student {
	public String name;
	public double grade;
	public double discount = 0.0;
	private double baseFee = 2000.0;

	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}

	public void printFee() {
		double fee = baseFee - (baseFee * (discount / 100));
		System.out.println(name + "'s fee after discount: " + fee);
	}
}
