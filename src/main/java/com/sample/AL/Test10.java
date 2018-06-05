package com.sample.AL;

import java.util.Scanner;

public class Test10 {
	static char rev;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		findPld(str);
	}

	private static void findPld(String str) {
		for (int i = str.length() - 1; i > 0; i--) {
			rev = str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
