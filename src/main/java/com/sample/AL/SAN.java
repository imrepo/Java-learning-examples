package com.sample.AL;

public class SAN {

	public boolean checkValidity(String s1, String s2){
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		for(int i=0; i<ch1.length; i++){
			for(int j=0; j<ch2.length; j++){
				if(ch1.equals(ch2)){
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		
	}
}
