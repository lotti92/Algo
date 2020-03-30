package com.study.algo.backjoon_0316;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1008번 문제 
//1단계 - A/B
//https://www.acmicpc.net/problem/1008
public class Back_1008 {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(a < 0 || b < 0 || a > 10 || b > 10) {
			System.err.println("잘못입력");
			System.exit(0);
		}		
		System.out.println((double)a/b);
	}
}
