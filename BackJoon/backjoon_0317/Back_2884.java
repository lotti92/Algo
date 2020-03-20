package com.study.algo.backjoon_0317;

import java.util.Scanner;

//백준 알고리즘 2884번 문제
//2단계 : IF문 - 알람 시계
//https://www.acmicpc.net/problem/2884
public class Back_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(hour<0 || hour>24 ||min<0 ||min>60) {
			System.err.println("시간 잘못 입력");
			System.exit(0);
		}
		
		if(min<45) {
			hour--;
			min += 15;
			if(hour == -1) hour = 23;
		} else { min -= 45; }
		
		System.out.println(hour + " " + min);
	}
}
