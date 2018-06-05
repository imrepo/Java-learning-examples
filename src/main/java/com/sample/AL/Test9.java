package com.sample.AL;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}

	public void getRotWithSor(int [] arr) {

		int l=0, n=arr.length-1;
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			int p = l+(l-n)/2;
			if(arr[i]<p){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i] = temp;

			}
		}
		}

	}
