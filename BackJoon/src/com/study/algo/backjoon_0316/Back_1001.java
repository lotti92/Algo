package com.study.algo.backjoon_0316;

import java.util.Scanner;

//���� �˰��� 1001�� ����
//A-B ���
//https://www.acmicpc.net/problem/1001
public class Back_1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < 0 || b < 0 || a > 10 || b > 10) {
			System.err.println("���ǿ� ���� ����");
			System.exit(0);
		}
		System.out.println(a - b);
	}
}
