package com.study.algo.backjoon_0317;

import java.util.Scanner;

//백준 알고리즘 14681번 문제 
//2단계 : IF문 - 사분면 고르기
//https://www.acmicpc.net/problem/14681
public class Back_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int quadrant = 0;
		
		if(x>0) {
			quadrant = y>0 ? 1:4;
		} else {
			quadrant = y>0 ? 2:3;
		}
		
		System.out.println(quadrant);
	}
}
