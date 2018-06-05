package com.sample.AL;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	static int size =0;
	static int test =0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		test = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		getOne(arr);
	}

	public static void getOne(int[] arr) {
		LinkedList<Integer> list = new LinkedList();
	
		for (int i = 0; i < arr.length-1; i++) {
			list.add(arr[i]);
		}
			for(int j=0; j<test; j++) {
				list.remove(0);
			list.addFirst(0);
			System.out.println(arr[j]);
			}

	}
}
