package com.practice.AL;

import java.util.Scanner;

public class TestI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		teestI(arr);
	}

	public static void teestI(int [] arr) {

		for(int i=0; i<arr.length-2; i++){

			int min=i;

			for(int j = i+1; j<arr.length-1; j++) {

				if(arr[j]<arr[min])
					min =j;

				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}

			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k] + ", ");
			}
		}
	}
}
