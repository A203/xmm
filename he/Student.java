package com.hehe.he;

public class Student {
int num;
String name;
String add;
void Intro() {
	System.out.println("��Һã��ҽ�"+name+",�ҵ�ѧ����"+num+",������"+add+"!");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ʵ����һ��ѧ��
		Student S=new Student();
		S.num=2012214287;
		S.name="MiaoMin";
		S.add="Hefei";
		
		
		S.Intro();
	}

}
