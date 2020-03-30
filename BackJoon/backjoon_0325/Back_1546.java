package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 알고리즘 1546번 문제 
//6단계 : 1차원배열 - 평균
//https://www.acmicpc.net/problem/1546
//2020.03.25
public class Back_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int [num];
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);		
		double result = 0;
		for(int i=0; i<num; i++) {
			result += (arr[i]/(double)arr[num-1])*100;
		}
		System.out.println(result/num);
	}
}
