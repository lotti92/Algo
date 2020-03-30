package com.study.algo.backjoon_0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 10996번 문제 
//5단계 : 실습 1 - 별 찍기-21
//https://www.acmicpc.net/problem/10996
//2020.03.24
public class Back_10996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		br.close();
		for(int i=0; i<num; i++) {
			if(num==1) {
				sb.append("*");
				break;
			}			
			for(int j=0; j<num; j++) {
				String even = (j%2==1)?" ":"*";
				sb.append(even);
			}
			sb.append("\n");
			for(int j=0; j<num; j++) {
				String odd = (j%2==1)?"*":" ";
				sb.append(odd);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
