package com.sample.AL;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	public int getp(int arr[], int pi, int n){
		
		int in = arr[0];
		int out = arr.length-1;
		pi = in + out-in/2;

		int index = 0;
		for(int i=0; i<out; i++){
		    if(arr[i]<pi){
		    	index++;
		    	int temp = arr[i];
		    	arr[i] = arr[index+1];
		    	arr[i] = temp;
		    }
		    
		    int temp = arr[index+1];
		    arr[index+1] = arr[i];
		    temp = arr[index+1];
		}
		return index;
	}
	
	public void dod(int[] arr, int pi, int n){
		if(pi>0){
			dod(arr, n, pi+1);
		} else{
			dod(arr, pi-1, n);
		}
	}
}
