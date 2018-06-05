package com.practice.AL;

public class TestL13 {

	public static void main(String[] args) {

		Integer [] arr = new Integer[]{1, 2, 2, 3, 4};
		int n = arr.length;
		int res = getEle(arr, n);
		System.out.println(res);
	}

	public static int getEle(Integer [] arr, int n){
		n = arr.length;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i!=j &&  arr[i]==arr[j])
					break;
				 if(j==n)
					return arr[i];
				}
			}
		return -1;
		}
	}
