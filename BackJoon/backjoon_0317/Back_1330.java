package com.study.algo.backjoon_0317;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1330번 문제
//2단계 : IF문 - 두 수 비교하기
// https://www.acmicpc.net/problem/1330
public class Back_1330 {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(compareNumber(a,b));
	}
	
	private static String compareNumber(int num1, int num2) {
		if(num1 > num2) return ">";
		else if (num1 < num2) return "<";
		else return "==";
	}
}
