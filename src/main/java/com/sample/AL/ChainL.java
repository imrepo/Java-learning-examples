package com.sample.AL;

public class ChainL {

	Pair1 top;
	public Pair1 getL(Pair1 head){
		
		Pair1 st =top;
		Pair1 ft = top;
		
		while(st.next!=null){
			st = top.next;
			ft = top.next.next;
		}
		return ft;
	}
	
	public boolean DetL() {
		Pair1 st =top;
		Pair1 ft = top;
		
		while(st.next!=null){
			st = top.next;
			ft = top.next.next;
			if(st==ft){
				return true;
				
			}
			else 
				return false;
		}
		return false;
	}
	
	public void PAL(){
		
	}
}
