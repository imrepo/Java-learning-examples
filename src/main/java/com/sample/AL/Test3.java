package com.sample.AL;

public class Test3 {

	public static void main(String[] args) {
		int [] arr = {5, 6, 1, 2, 3, 4};
		int max1=arr[0];
		int max2=arr[0];
		for(int i=0; i <arr.length; i++) {
			if(arr[i]>max1){
				max1 =max2;

			}else if(arr[i]<max2){
				max2=i;
			}
		}

	}
}
