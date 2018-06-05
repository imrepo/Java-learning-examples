package com.practice.AL;

public class TestL9 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,5,7};
		getRR(arr, 2);
	}
	
	public static void getRR(int []arr, int k){
		
		int temp[] = new int[10];
		for(int j =2; j<arr.length; j++){
			 temp[j] = arr[j];
		}
		
		for(int i=0; i<k; i++){
			temp[i] = arr[i];
		}
			
		for(int l =0; l<temp.length; l++){
			System.out.println(temp[l]);
		}
		
	}
}
