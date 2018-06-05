package com.practice.DS;

public class SLL {

	N h;
	
	public void add(int data){
		N n = new N(data);
		n.ne =h;
		n =h;
	}
	
	public void g(){
		while(h.ne!=null){
			System.out.println(h.data);
		}
	}
	public void de(N n){
		n =h;
		N p=h;
		while(n.ne!=null){
			p.ne=null;
		}
	}
	public void d(N n, int da){
		N t = h;
		N p = h;
		//while(t.ne){
		//}
	}
	public void df(N n){
		n = h;
		n.ne=h;
	}
	
	public void dk(int k){
		N t = h, p=null;
		if(t!=null && t.data==k){
			t.ne=h;
		}
		
		while(t==null && t.data!=k){
			p =t;
			t = t.ne;
		}
		if(t==null){
			System.out.println("Null");
		}
		t.ne=p.ne;
		
	}
	
	public static void main(String[] args) {
		
	}
}
