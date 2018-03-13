package com.learn.lambda;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * lambda原始形式
 * 
 * @author xuguozong
 *
 */
public class Lambda1 {
	static int[] arr = new int[] { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		Arrays.stream(arr).forEach(new IntConsumer() {

			@Override
			public void accept(int x) {
				System.out.println(x);
			}
		});
	}
}
