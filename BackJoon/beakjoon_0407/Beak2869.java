package com.study.algo.beakjoon_0407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 2869번 문제 
//9단계 - 수학1 : 달팽이는 올라가고 싶다
//https://www.acmicpc.net/problem/2869
//2020.04.07
//방법 1[StringTokenizer], 2[배열], 3[dayCnt나눠서 그때부터] 모두 시간 초과 (반복문은 시간 초과)
public class Beak2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int dayCnt=0, total=0;
		while(true) {
			dayCnt++;
			total += up;
			if(total>=height) break;
			total -= down;
		}
		System.out.println(dayCnt);
	}
}
