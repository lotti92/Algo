package com.study.algo.backjoon_0317;

import java.util.Scanner;

//���� �˰����� 9498�� ����
//2�ܰ� : IF�� - ���� ����
//https://www.acmicpc.net/problem/9498
public class Back_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score<0 || score>100) {
			System.exit(0);
		} else if (score>=90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}