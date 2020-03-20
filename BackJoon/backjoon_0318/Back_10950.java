package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 10950번 문제
//3단계 : For문 - A+B - 3
//https://www.acmicpc.net/problem/10950
public class Back_10950 {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case=0; test_case < T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			System.out.println(plusNumber(num1,num2));
		}
	}
	
	private static int plusNumber(int a, int b) {
		return a+b;
	}

}
