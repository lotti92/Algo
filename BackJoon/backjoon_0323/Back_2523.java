package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2523번 문제 
//5단계 : 실습 1 - 별 찍기-13
//https://www.acmicpc.net/problem/2523
//2020.03.23
public class Back_2523 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < 2 * num - 1; i++) {
			if (i < num) {
				for (int j = 0; j <= i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			} else {
				for (int j = i; j < 2 * num - 1; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
