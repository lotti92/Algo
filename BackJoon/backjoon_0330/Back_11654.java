package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//백준 알고리즘 11654번 문제 
//8단계 - 문자열 : 아스키 코드
//https://www.acmicpc.net/problem/11654
//2020.03.30
public class Back_11654 {
	//Scanner 사용
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char c = sc.nextLine().charAt(0);
//		System.out.println((int)c);
//	}
	
	//Buffer사용
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = br.read();
		System.out.println(c);
	}
}