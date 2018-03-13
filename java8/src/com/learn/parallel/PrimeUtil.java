package com.learn.parallel;

/**
 * @desc 判断是否是质数
 * @author xuguozong
 *
 */
public class PrimeUtil {
	public static boolean isPrime(int n) {
		int tem = n;

		if (n < 2) {
			return false;
		}

		for (int i = 2; Math.sqrt(tem) >= i; i++) {
			if (tem % i == 0) {
				return false;
			}
		}

		return true;
	}
}
