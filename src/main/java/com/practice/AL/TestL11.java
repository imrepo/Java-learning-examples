package com.practice.AL;

import java.util.Arrays;

public class TestL11 {

	public static void main(String[] args) {

		System.out.println();
		getMchar();
	}

	public static void getMchar() {

		String str = "zasxcDD".toLowerCase();

		int [] arr = new int[str.length()];

		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			arr[i] = (int)c;
		}
		Arrays.sort(arr);

		for(int i:arr){
			System.out.println(i);
		}

		int count =0;

		while(count<str.length()){
			int first = arr[0];

			if(str.indexOf(first+count)>0){
				count++;
				continue;
			} else {
				System.out.println(String.valueOf(Character.toChars(first+count)));
			}
		}
	}
}
