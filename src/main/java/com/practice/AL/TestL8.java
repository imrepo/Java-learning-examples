package com.practice.AL;

public class TestL8 {

	public static void main(String[] args) {
		
	}
	
	public static void getN(String str){
		
		int count =0;
		char [] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			if(ch[i]!=ch[i+1]){
				count ++;
				System.out.println(count);
				break;
			}
			
		}
	}
}
