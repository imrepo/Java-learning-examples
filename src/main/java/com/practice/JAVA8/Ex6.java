package com.practice.JAVA8;

import java.util.HashMap;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {

	}

	public static void getR(String str){
		HashMap<Character, Integer> con = new HashMap<Character, Integer>();
		for(Character c : str.toCharArray()){
			con.put(c, con.containsKey(c)?con.get(c)+1 : 1);
		}
		Set<java.util.Map.Entry<Character, Integer>> map = con.entrySet();	
		for(java.util.Map.Entry<Character, Integer> s : map){
			System.out.println(s.getKey() + " " + s.getValue());
		}
	}
}
