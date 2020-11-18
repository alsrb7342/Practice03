package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		x = sc.nextInt();
		
		for(int y=1; y<=x; y++) {
			for(int z=0; z<y; z++) {
				System.out.print(y);
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
