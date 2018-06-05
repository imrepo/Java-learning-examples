package com.sample.AL;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		int msum = 0;
		int lsum = 0;
		//Scanner sc = new Scanner(System.in);
		int arr [] = new int []{1,2,3,4,5};
		for(int i=0; i<arr.length; i++){
            msum = arr[0]+arr[1]+arr[2]+arr[3];
           lsum = arr[1]+ arr[2]+ arr[3]+ arr[4];
		}
		System.out.println(msum + ", " + lsum);
		
	}
}
