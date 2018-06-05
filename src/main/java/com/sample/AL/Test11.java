package com.sample.AL;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	public boolean findsome(int [] arr) {
		int count =0;
      for(int i=0; i<arr.length; i++){
    	  if(arr[i]==arr[i+1]){
    		  return true;
    	  }
      }
	return false;
	}
}
