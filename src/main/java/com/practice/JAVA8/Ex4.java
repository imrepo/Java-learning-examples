package com.practice.JAVA8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ex4 {

	public static void main(String[] args) {

		Map<String, Integer> iqMap =
				new ConcurrentHashMap<String, Integer>() {
			{
				put("Some", 100);
				put("Intell", 90);
				put("Eclipse", 110);
			}
		};

		System.out.println(iqMap);

		// Replace all values of all keys using a Java 8 BiFunction
		// lambda.
		iqMap.replaceAll((k, v) -> v - 50);

		System.out.println(iqMap);

		// Replace all values of all keys using a Java 7 foreach loop.
		for (Map.Entry<String, Integer> entry : iqMap.entrySet())
			entry.setValue(entry.getValue() - 50);

		System.out.println(iqMap);
	}
}
