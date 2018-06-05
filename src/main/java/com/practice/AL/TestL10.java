package com.practice.AL;

public class TestL10 {

	public static void main(String[] args) {
		
	}
	
	public static int getS(int arr[], int k){
		
		int s=0;
		
		for(int i=0; i< arr.length; i++){
			
			s = arr[i]+arr[i+1];
			
			if(s==k){
				return s;
			}
			else 
				return -1;
		}
		return -1;
	}
	
}
