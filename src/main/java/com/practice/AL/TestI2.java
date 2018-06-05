package com.practice.AL;

import java.util.Scanner;

public class TestI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	public static void getDone(int [] arr) {
		
	    int x=0;
		for(int i=0; i<arr.length; i++){
			int k = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>k){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] =k;
			
		}
	}
}
