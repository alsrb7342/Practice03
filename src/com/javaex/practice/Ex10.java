package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, a = 0;
		System.out.println("���ڸ� �Է��ϼ���");
		
		for(int i=0; i<5; i++) {
			System.out.print("����: ");
			num = sc.nextInt();
			if(a<num) {
				a = num;
			}
		}
		System.out.print("�ִ밪�� " + a + "�Դϴ�.");
		
		sc.close();
	}

}
