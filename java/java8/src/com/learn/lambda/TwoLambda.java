package com.learn.lambda;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class TwoLambda {
	static int[] arr = new int[] { 1, 4, 5, 2, 4, 5 };

	public static void main(String[] args) {
		IntConsumer out = System.out::println;
		IntConsumer err = System.err::println;

		// Arrays.stream(arr).forEach(out.andThen(err));

		Arrays.asList(stringToInt("454857")).forEach(System.out::println);
	}

	public static int[] stringToInt(String numbers) {
		return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
	}
}
