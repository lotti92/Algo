package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 8958번 문제 
//6단계 : 1차원배열 - OX퀴즈
//https://www.acmicpc.net/problem/8958
//2020.03.30
//문자열 자르는 것 참고 사이트 : https://ponyozzang.tistory.com/392
public class Back_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test_case = Integer.parseInt(br.readLine());
		for (int i = 0; i < test_case; i++) {
			String[] score = br.readLine().split("");	
			
			int count = 0, result = 0;
			for (int j = 0; j < score.length; j++) {
				if (score[j].equals("O")) {
					count++;
					result += count;
				} else {
					count = 0;
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
