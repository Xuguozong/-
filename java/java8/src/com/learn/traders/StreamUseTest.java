package com.learn.traders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamUseTest {
	public static void main(String[] args) {
		Trader jack = new Trader("jack", "beijing");
		Trader debi = new Trader("debi", "hangzhou");
		Trader dai = new Trader("dai", "shenzhen");
		Trader xu = new Trader("xu", "hangzhou");

		List<Transaction> transactions = Arrays.asList(new Transaction(jack, 2011, 100),
				new Transaction(xu, 2018, 10000), new Transaction(debi, 2013, 300), new Transaction(xu, 2017, 20000000),
				new Transaction(jack, 2011, 100), new Transaction(dai, 2016, 150), new Transaction(xu, 2014, 100001));
		// 找出2011年发生的所有交易并按交易额从低到高排序
		transactions.stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		// 交易员都在哪些不同的城市工作过
		// 1.
		transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		// 2.
		transactions.stream().map(transaction -> transaction.getTrader().getCity()).collect(Collectors.toSet());

		// 查找所有来自hangzhou的交易员，并按姓名排序
		transactions.stream().map(transaction -> transaction.getTrader())
				.filter(trader -> trader.getCity().equals("hangzhou")).distinct()
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());

		// 返回所有交易员的姓名字符串并按字母排序
		String string = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted()
				// .collect(Collectors.toList());
				// .reduce("", (n1, n2) -> n1 + n2);
				.collect(Collectors.joining());
		System.out.println(string);

		// 有没有交易员是在北京工作的
		boolean match = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("beijing"));
		System.out.println(match);

		// 打印发生在杭州的所有交易额
		transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("hangzhou"))
				.map(transaction -> transaction.getValue()).forEach(System.out::println);

		// 打印所有交易的最高交易额
		Optional<Integer> max = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		System.out.println(max.get());

		// 打印所有交易的最小交易额
		transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
		transactions.stream().min(Comparator.comparing(Transaction::getValue));
	}
}
