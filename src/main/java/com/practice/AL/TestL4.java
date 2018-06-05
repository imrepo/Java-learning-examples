package com.practice.AL;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestL4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public void getF(int arr[]) {
		int count=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==arr[i+1]){
				count++;
			}
		}
	}
	public void getFF(String [] names){
		Map<String, Integer> nameCount = new HashMap<String, Integer>();
		for(String name: names){
			Integer count = nameCount.get(name);
			if(count == null){
				nameCount.put(name, 1);
			}else {
				nameCount.put(name, ++count);
			}
		}
		Set<Entry<String, Integer>> entyset = nameCount.entrySet();
		for(Entry<String, Integer> entry : entyset) {
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		}
	}
}
