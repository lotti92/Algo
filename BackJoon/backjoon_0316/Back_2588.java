package com.study.algo.backjoon_0316;

import java.util.Scanner;

//���� �˰����� 2588�� ����
//���� ���
//https://www.acmicpc.net/problem/2588
public class Back_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = b;
		
		//���1
		System.out.println(a*(b%10));
		result = modTen(result);
		System.out.println(a*(result%10));
		result = modTen(result);
		System.out.println(a*(result%10));
		System.out.println(a*b);
		
		// ���2
//		int result2 = a*(b%10);
//		System.out.println(result2);
//		b = modTen(b);
//		result2 = result2 + a*(b%10)*10;
//		System.out.println(a*(b%10));
//		b = modTen(b);
//		result2 = result2 + a*(b%10)*100;
//		System.out.println(a*(b%10));
//		System.out.println(result2);
	}
	
	public static int modTen(int num) {
		num = (num - num%10)/10;		
		return num;
	}
}