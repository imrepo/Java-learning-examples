package com.sample.AL;

public class Test20 {
	public static int getNValue(int n){
		int res;
		res = (n*(n+1))/2;
		return res;
	}
	public static int getAValue(int arr[]){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {};
		int get = getNValue(5);
		int getA = getAValue(arr);
		int res = get - getA;
		System.out.println(res);
	}

}
