package com.haha.ha;

import java.util.Scanner;

public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	    int process=scanner.nextInt();
	    String processString="";
	    switch(process)
	    {
	    case 1:processString="����1��ѧ��" ;break;
	    case 2:processString="��ʾ����ѧ��";break;
	    case 3:processString="�˳�����";break;
	    default: processString="�������";
	    }
	    System.out.println(processString);
	}

}
