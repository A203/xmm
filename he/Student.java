package com.hehe.he;

public class Student {
int num;
String name;
String add;
void Intro() {
	System.out.println("大家好！我叫"+name+",我的学号是"+num+",我来自"+add+"!");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//实例化一个学生
		Student S=new Student();
		S.num=2012214287;
		S.name="MiaoMin";
		S.add="Hefei";
		
		
		S.Intro();
	}

}
