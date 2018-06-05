package com.practice.JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		List<Thread> threads = Arrays.asList(new Thread("Some"), new Thread("Intell"), new Thread("Eclipse"));

		System.out.println(threads);

		threads.sort(Comparator.comparing(Thread::getName));

		System.out.println(threads);
	}
}
