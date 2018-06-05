package com.sample.AL;

public class Test13 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}*/
		printPol();
	}
	
	public static void printPol(){
		for(int i=0; i<=5; i++){
			for(int j=i; j<=5; j+=2){
				System.out.print("*");
				System.out.println(" ");
			}
		}
		for(int k=5; k>=0; k--){
			for(int m=k; m>=0; m--){
				System.out.println("*");
			}
		}
	}
}
