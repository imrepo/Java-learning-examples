package com.sample.AL;

import java.util.Scanner;

public class Test2S {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		getDoneS(arr);
	}
	public static void getDoneS(int [] arr){
		for(int i=0; i<arr.length-1; i++){
			int superVal = i;
			for(int j=i+1; j<arr.length; j++){

				if(arr[i]<arr[superVal]){
					superVal=i;

				}
				int temp = arr[superVal];
				arr[superVal] = arr[i];
				arr[i] =temp;
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
