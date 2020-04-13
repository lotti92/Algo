package com.study.algo.beakjoon_0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2775번 문제 
//9단계 - 수학1 : 부녀회장이 될테야
//https://www.acmicpc.net/problem/2775
//2020.04.08
//함수 내 함수 호출하는 방법(재귀함수)으로 풀었음 [단점 : 시간 복잡도가 어마어마함]
public class Beak2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			int floor = Integer.parseInt(br.readLine());
			int number = Integer.parseInt(br.readLine());

			sb.append(fibo(floor, number) + "\n");
		}
		System.out.println(sb);
	}

	private static int fibo(int a, int b) {
		
		if(a==0) return b;
		else {
			int sum = 0;
			for(int i=1; i<=b; i++) {
				sum += fibo(a-1, i);
			}
			return sum;
		}
	}
}
