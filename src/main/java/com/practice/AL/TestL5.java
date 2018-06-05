package com.practice.AL;

import java.util.Scanner;

public class TestL5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
	}
	
	public static String getIt(String str){
		
		StringBuilder builder = new StringBuilder();
		char [] ch = str.toCharArray();
		for(int i=ch.length-1; i>0; i--) {
			builder.append(ch[i]);
		}
		return builder.toString();
	}
	
	public static String getRecur(String str) {
		if(str == null || str.length()<=1){
			System.out.println(str);
		}else{
		System.out.println(str.charAt(str.length()-1));
		return getRecur(str.substring(0, str.length()-1));
	}
		return str;
	}
}
