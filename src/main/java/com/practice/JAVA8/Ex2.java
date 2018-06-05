package com.practice.JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		System.out.println(list);
		
		list.removeIf(i -> i%2 ==0);
		
		System.out.println(list);
		
		
	}
}
