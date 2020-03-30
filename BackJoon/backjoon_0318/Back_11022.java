package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 11022번 문제 
//3단계 : For문 - A+B - 8
//https://www.acmicpc.net/problem/11022
public class Back_11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String number = br.readLine();
			String[] arr = number.split(" ");
			
			sb.append("Case #" + (i+1) + ": ");
			sb.append(arr[0] + " + " + arr[1] + " = ");
			sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
		}
		System.out.println(sb.toString());		
	}
}
