package com.learn.utilfunc;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("jack", 8.7);
		s1 = PredicateConsumerDemo.updateStudentFee(s1, student -> student.grade > 8.5,
				student -> student.discount = 30.0);
		s1.printFee();

		Student s2 = new Student("rose", 8.0);
		s2 = PredicateConsumerDemo.updateStudentFee(s2, student -> student.grade >= 8.0,
				student -> student.discount = 20.0);
		s2.printFee();
	}
}
