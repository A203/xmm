package com.hehe.he;

public class Person2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person(90);
		System.out.println(person.age);
	}

}
class Person{
	public Person(int age) {
		this.age = age;
	}
	
	{
		age = 18;
	}
	{
		age = 8;
	}
	int age;
}