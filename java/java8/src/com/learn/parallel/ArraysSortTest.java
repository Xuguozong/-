package com.learn.parallel;

import java.util.Arrays;
import java.util.Random;

/**
 * Arrays的并行排序和并行复制方法
 * 
 * @author xuguozong
 *
 */
public class ArraysSortTest {
	public static void main(String[] args) {
		int[] arr = new int[10000];
		Random random = new Random();
		// 并行赋值
		Arrays.parallelSetAll(arr, (x) -> random.nextInt(10000));
		// 并行排序
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}
}
