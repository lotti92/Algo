package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 알고리즘 2438번 문제 
//3단계 : For문 - 별 찍기 - 1
//https://www.acmicpc.net/problem/2438
public class Back_2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int line = Integer.parseInt(br.readLine());
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}

//다른 방법
//public class Back_2438 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());	
//		StringBuilder sb1 = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder();
//		for(int i = 0; i < n; i++){
//			sb1.append("*");
//			sb2.append(sb1+"\n");
//		}
//		System.out.println(sb2);
//	}
//}
