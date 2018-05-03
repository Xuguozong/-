package com.learn.lambda;

import java.util.Arrays;

/**
 * lambda改进形式2
 * 
 * @author xuguozong
 *
 */
public class Lambda3 {
	static int[] arr = new int[] { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		Arrays.stream(arr).forEach((x) -> {
			System.out.println(x);
		});
	}
}
