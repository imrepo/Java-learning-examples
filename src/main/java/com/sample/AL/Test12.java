package com.sample.AL;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] result = comp(str);
		String b = new String(result);
		//String s = b.trim();
		System.out.println(b.trim());
	}
	
	public static char[] comp(String str){
		
		char[] ch = str.toCharArray();
		char[] nech = new char[256];
		String s = null;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=0 && ch[i]<=128){
				//System.out.println("Wow");
			}else{
				ch[i]= ' ';
			}
			//s = new StringBuilder().append("").append(ch[i]).toString();
			nech[i] = ch[i];
		}
		return nech;
	}
}
