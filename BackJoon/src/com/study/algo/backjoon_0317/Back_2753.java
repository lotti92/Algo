package com.study.algo.backjoon_0317;

import java.util.Scanner;

//���� �˰����� 2753�� ����
//2�ܰ� : IF�� - ����
//https://www.acmicpc.net/problem/2753
public class Back_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}