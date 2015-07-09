package com.hehe.he;

public class Fruit {
	String name;
	int singlePrice;
	String place;
	
	Fruit() {}
	Fruit(String str1,int i,String Str2){
		name=str1;
		singlePrice = i;
		place = Str2;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f1 = new Fruit("banana",5,"fujian");
		/*f1.name = "Banana";
		f1.place = "FuJian";
		*/
		System.out.println("水果名字："+f1.name+"，水果价格："+f1.singlePrice+"，水果产地："+f1.place);
//		System.out.println(f1.place);
	}

}
