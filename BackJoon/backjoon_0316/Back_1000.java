package com.study.algo.backjoon_0316;

import java.util.Scanner;

//백준 알고리즘 1000번 문제 
//1단계 - A+B
//https://www.acmicpc.net/problem/1000
public class Back_1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a < 0 || b <0 || a > 10 || b > 10) {
			System.err.println("잘못 입력");
			System.exit(0);
		}
		System.out.println(a+b);
	}
}
