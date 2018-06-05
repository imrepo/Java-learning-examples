package com.practice.AL;

import java.util.LinkedList;
import java.util.Queue;

public class TestL14 {

	TestL14 k;
	static class N1{
		N1 l;
		int left, right;

		N1(N1 n){
			this.l = n;
		}
	}

	public void lo(N1 n){

		Queue<N1> q = new LinkedList<>();

		q.add(n.l);

		while(!q.isEmpty()){

			N1 t = n;
			System.out.println(t.l);
			if(t.l!=null){
				System.out.println(t.left);
			}if(t.l!=null){
				System.out.println(t.right);
			}
		}
	}
}
