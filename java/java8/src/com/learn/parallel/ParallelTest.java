package com.learn.parallel;

import java.util.stream.IntStream;

/**
 * 计算1到10000间的质数个数
 * 
 * @author xuguozong
 *
 */
public class ParallelTest {
	public static void main(String[] args) {
		// 串行版
		long count = IntStream.range(1, 10000).filter(PrimeUtil::isPrime).count();
		System.out.println(count);

		// 并行版
		long count2 = IntStream.range(1, 120000000).parallel().filter(PrimeUtil::isPrime).count();
		System.out.println(count2);
	}
}
