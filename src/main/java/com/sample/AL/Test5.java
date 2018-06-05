package com.sample.AL;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int value = sc.nextInt();
		int result = getValue(arr, value);
		System.out.println(result);
	}
	public static int getValue(int []arr, int value) {

		int k=0;
		int x = k+arr.length-1/2;

		while (value>-1){
			if(value==x)
				return value;

			else if(value > x)
				value=x+1;

			else if(value < x)
				value = x-1;
		}
		return -1;
	}
}
