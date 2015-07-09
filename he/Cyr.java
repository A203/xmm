package com.hehe.he;

public class Cyr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer j=new Juicer();	
	    Fruit01 fruit01=new Mango(); 
	    j.juice(fruit01);
	    System.out.println("hi");
	}

}
class Fruit01 {
	public String toString(){
		return "fruit";
	}
}

class Apple extends Fruit01{
	public String toString(){
		return "apple";
	}
}

class Mango extends Fruit01{
	public String toString(){
		return "mango";
	}
}
class  Juicer{
	public void juice(Fruit01 fruit01){
		System.out.println(fruit01);
		}
}