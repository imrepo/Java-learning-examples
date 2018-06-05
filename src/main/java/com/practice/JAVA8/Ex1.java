package com.practice.JAVA8;

public class Ex1 implements Element1, Element2 {
	@Override
	public void doSomeThing() {
		Element2.super.doSomeThing();
	}

	public static void main(String[] args) {
		new Ex1().doSomeThing();
	}
} 


interface Element1 {
	default void doSomeThing() {
		System.out.println("inside Element1");
	}
}

interface Element2 {
	default void doSomeThing() {
		System.out.println("inside Element2");
	}
}
