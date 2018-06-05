package com.sample.AL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LOT {

	public void lot(Pair startPair){
		
		Queue<Pair> queue = new LinkedList<>();
		queue.add(startPair);
		
		while(!queue.isEmpty()){
			Pair temp = queue.poll();
			
			System.out.println(temp.data);
			
			if(temp.left!=null){
				queue.add(temp.left);
			}if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}
	
	public void revLot(Pair startPair){
		Queue<Pair> queue = new LinkedList<>();
		Stack<Pair> stack = new Stack<>();
		
		queue.add(startPair);
		while(!queue.isEmpty()){
			Pair temp = queue.poll();
			System.out.println(temp.data);
			if(temp.right!=null){
				queue.add(temp.right);
			}if(temp.left!=null){
				queue.add(temp.left);
			}
			stack.push(temp);
			
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		
	}
}
