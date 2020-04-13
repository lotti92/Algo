package com.study.algo.beakjoon_0407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 2869번 문제 
//9단계 - 수학1 : 달팽이는 올라가고 싶다
//https://www.acmicpc.net/problem/2869
//2020.04.07
//수열로 계산해서 풀었음.. 
public class Beak2869_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int dayCnt = (v-b)/(a-b)+1;
		if((v-b)%(a-b) == 0) dayCnt--;
		
		System.out.println(dayCnt);
	}
} 
