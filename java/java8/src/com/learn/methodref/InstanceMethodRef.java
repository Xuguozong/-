package com.learn.methodref;

import java.util.ArrayList;
import java.util.List;
/**
 * @desc 类的实例方法的方法引用
 * @author xuguozong
 *
 */
public class InstanceMethodRef {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		for(int i =0;i<10;i++){
			users.add(new User("jack"+i, 10+i));
		}
		
		users.stream().map(User::getName).forEach(System.out::println);
	}
}
