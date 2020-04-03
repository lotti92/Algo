package com.study.algo.backjoon_0331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2675번 문제 
// https://www.acmicpc.net/source/13483660 [참고]
// for문대신 while문 쓰기 (변수 선언 한개 줄어드니까)
public class Back_2675_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		while(num-- > 0) {
			String[] s = (br.readLine().replace(" ","")).split("");
			int n = Integer.parseInt(s[0]);
			for(int j=1; j<s.length; j++) {
				for(int k=0; k<n; k++) {
					sb.append(s[j]);
				}				
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
