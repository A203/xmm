package com.hehe.he;

public class Tiger extends Animal {
	
	public Tiger(String name, int age) {
		super(name, age);
		System.out.println("���Ǽ̳�ʱ���ϻ��ĵ���");
	}
	
	//�̳���Animal���󣬷���������д
	void sleep(){
		System.out.println("�ϻ�������˯����........");
	}
	//�̳���Animal���󣬷���������д
	void eat(){
		System.out.println("�ϻ��������Զ�����......");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tiger tiger= new Tiger("guguo", 4);
		tiger.sleep();
		tiger.eat();
		
		//������ϻ��������ֺ�����Ĵ�ӡ
		System.out.println(tiger.name);
		System.out.println(tiger.age);
		tiger.name = "baobao";
		tiger.age = 5;
		
		//�޸Ĺ�������ϻ��µ����ֺ�����Ĵ�ӡ�����
		System.out.println(tiger.name);
		System.out.println(tiger.age);
		System.out.println("hehe");
		
		//ʵ�ֶ���Ķ�̬��
		Animal animal2 = new Tiger("wao", 56);
		System.out.println(animal2.name);
		System.out.println(animal2.age);
		
	}

}