package com.sample.AL;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer size = sc.nextInt();
		Integer [] arr = new Integer[size];
		for(Integer i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(getDist(arr));
	}

	public static int getDist(Integer arr[]){
		
		for(Integer i=0; i<arr.length; i++) {
		if(arr[i].equals(arr[i+1])){
			continue;
		}else{
			return arr[i];
		}
		}
		return -1;
	}

}
