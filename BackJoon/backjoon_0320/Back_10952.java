package com.study.algo.backjoon_0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 10952번 문제
//4단계 : while문 - A+B - 5
//https://www.acmicpc.net/problem/10952
//2020.03.20
public class Back_10952 {
	// 내가 푼 방식
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		while(true) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int num1 = Integer.parseInt(st.nextToken());
//			int num2 = Integer.parseInt(st.nextToken());
//			if(num1==0 && num2==0) break;
//			sb.append(num1+num2).append("\n");
//		}
//		System.out.println(sb.toString());
//	}
	
	//StringTokenizer 안쓰고 StringBuilder로만 처리하는 방법
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			if(line.equals("0 0")) break;
			String[] arr = line.split(" ");
			sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
		}
		System.out.println(sb.toString());
	}
}
