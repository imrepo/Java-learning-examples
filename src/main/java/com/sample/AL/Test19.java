package com.sample.AL;

import java.util.PriorityQueue;

public class Test19 {

	public static void main(String[] args) {
		
	}
	
	public static int fks(int arr[]){
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i=0; i<arr.length; i++){
			queue.offer(arr[i]);
		}
		
		int small = 0;
		while(queue.size()>0){
			small = queue.poll();
		}
		return small;
	}
}
