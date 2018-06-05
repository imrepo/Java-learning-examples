package com.sample.AL;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	public int part(int low, int high, int arr[]){
		int pi = arr[high];
		int i = low-1;
		for(int j=low; j<high; j++){
			if(arr[j]<=pi){
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1]= arr[high];
		arr[high]= temp;
		
		return i+1;
	}
	public void finalcal(int low, int high, int arr[]){
		if(low<high){
			int pi = part(low, high, arr);
			finalcal(pi+1, high, arr);
			finalcal(pi-1, high, arr);
		}
		
	}

}
