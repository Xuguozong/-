package com.learn.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 构造方法的方法引用
 * 
 * @author xuguozong
 *
 */
public class ConstructorMethodRef {

	@FunctionalInterface
	interface UserFactory<U extends User> {
		U create(String name, int id);
	}

	static UserFactory<User> uFactory = User::new;

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			users.add(uFactory.create("jack" + i, 10 + i));
		}

		users.stream().map(User::getName).forEach(System.out::println);

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		Arrays.stream(arr).forEach((x) -> System.out.println(x));
	}

}
