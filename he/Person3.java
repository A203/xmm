package com.hehe.he;

public class Person3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person4();
		new Person4();
	}

}
class Person4{
	static{
		System.out.println(12);
	}
	{
		System.out.println(20);
	}
	Person4(){
		System.out.println("Person4");
	}
}