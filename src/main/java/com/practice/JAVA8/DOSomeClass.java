package com.practice.JAVA8;

public class DOSomeClass implements Sample{

	@Override
	public void doSomething(){
		System.out.println("inside going");
	}

	public static void main(String[] args) {
		new DOSomeClass().doSomething();
	}
}
interface Sample{

	default void doSomething(){
		System.out.println("Do Some thing");
	}
}
