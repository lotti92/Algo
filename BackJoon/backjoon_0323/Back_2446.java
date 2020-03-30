package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2446번 문제 
//5단계 : 실습 1 - 별 찍기-9 
//https://www.acmicpc.net/problem/2446
//2020.03.23
public class Back_2446 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int start = 0;
		int end = 2*num-1;
		for(int i=0; i<2*num-1; i++) {
			for(int j=0; j<start; j++) sb.append(" ");
			for(int j=0; j<end; j++) sb.append("*");
			
			sb.append("\n");
			if(i < num-1) {
				start++;
				end = end -2;
			}
			else {
				start--;
				end = end+2;
			}
		}
		System.out.println(sb);
	}
}
