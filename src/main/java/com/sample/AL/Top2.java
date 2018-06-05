package com.sample.AL;

import java.util.Scanner;

public class Top2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		top(arr);
	}
	
	public static void top(int []arr){
		
		int m1;
		int m2;
		
		for(int i=0; i<=arr.length-1; i++){
			m1 = arr[0];
			
			if (m1>i+1){
				System.out.println(m1);
			}
		}
	}
}
