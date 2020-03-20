package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘  2439번 문제
//3단계 : For문 - 별 찍기 - 2
//https://www.acmicpc.net/problem/2439
//혼자 못풀었음 ㅠ_ㅠ
public class Back_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=line; i++) {
			for(int j=line; j>i; j--) {
				sb.append(" ");
			}
			for(int k=1; k<=i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
