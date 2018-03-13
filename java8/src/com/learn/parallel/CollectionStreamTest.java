package com.learn.parallel;

import java.util.ArrayList;
import java.util.List;

import com.learn.methodref.User;

/**
 * 从集合得到并行流
 * 
 * @author xuguozong
 *
 */
public class CollectionStreamTest {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();

		for (int i = 0; i < 10; i++) {
			users.add(new User("jack", i * 2 + 10));
		}

		double d = users.parallelStream().mapToInt(s -> s.getAge()).average().getAsDouble();
		System.out.println(d);
	}
}
