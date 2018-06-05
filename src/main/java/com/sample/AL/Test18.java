package com.sample.AL;

import java.util.Scanner;

public class Test18 {

	public static boolean rev(int num) {
		int rev=0; 
		int rem=0;
		while(num!=0){
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		if(num == rev){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = 424;
     rev(num);
     sc.close();
	}
	
}
