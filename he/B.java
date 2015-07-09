package com.hehe.he;

public class B extends A{

	String str = "B";
	void hello(){
		System.out.println("B.......");
	}

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.str);
		a.hello();
	}

}