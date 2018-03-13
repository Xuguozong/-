package com.learn.lambda;

import java.util.Arrays;

/**
 * lambda改进形式3
 * 
 * @author xuguozong
 *
 */
public class Lambda4 {
	static int[] arr = new int[] { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		Arrays.stream(arr).forEach(System.out::println);
	}
}
