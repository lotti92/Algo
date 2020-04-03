package com.study.algo.beakjoon_0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2839번 문제 
//9단계 - 수학1 : 설탕 배달
//https://www.acmicpc.net/problem/2839
//2020.04.03
//현성이 코드 참조 훨씬 깔끔함 
public class Beak2839_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		
		//int heavy = 5, light = 3;
		int hvc = sugar/ 5, ltc = 0;
		int count = -1;
		
		for(int i=hvc; i>-1; i--) {
			ltc = (sugar - 5*i);
			if(ltc%3 == 0) {
				count =ltc/3 + i;
				break;
			}
		}
		
		System.out.println(count);		
	}
}
