package com.hehe.he;

public class StaticEmmo {
    int age;
    void hello(){
		System.out.println("Hello......");
	}
	
	static void hi(){
		System.out.println("Hi.....");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEmmo s = new StaticEmmo();
		s.hello();
		StaticEmmo.hi();
		
		StaticEmmo.hi();
	}

	}


