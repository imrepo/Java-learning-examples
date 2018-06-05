package com.sample.AL;

import java.util.Scanner;

public class Segreg {

	public void seg(int arr[]){
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==1)
				count++;
			int temp = arr[i];
			arr[i+1] = arr[i];
			arr[i] = temp;
			System.out.println(count);
		}
		for(int k =0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			int testcases = sc.nextInt();
			int size = sc.nextInt();
			int [] scarr = new int [size];

			for(int i=0; i<scarr.length; i++){
				scarr[i] = sc.nextInt();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			sc.close();
		}
	}

}
