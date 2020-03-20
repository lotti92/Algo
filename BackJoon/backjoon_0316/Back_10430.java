package com.study.algo.backjoon_0316;

import java.util.Scanner;

//백준 알고리즘 10430번 문제
//나머지 출력
//https://www.acmicpc.net/problem/10430
public class Back_10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<1||b<1||c<1||a>10001||b>10001||c>10001) {
			System.exit(0);
		} else {
			System.out.println((a+b)%c);
			System.out.println((a%c + b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c * b%c)%c);
		}
	}
}
