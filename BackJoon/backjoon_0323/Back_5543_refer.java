package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 5543번 문제 
//5단계 : 실습 1 - 상근날드
//https://www.acmicpc.net/problem/5543
//2020.03.23 [참고용_ 내가 푼것아님] 
public class Back_5543_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int hMin = Integer.MAX_VALUE;
		int dMin = Integer.MAX_VALUE;
		
		//저렴한 햄버거 찾기 
		for(int i=0; i<3; i++) {
			hMin = Math.min(hMin, Integer.parseInt(br.readLine()));
		}
		
		//저렴한 음료 찾기 
		for(int i=0; i<2; i++) {
			dMin = Math.min(dMin, Integer.parseInt(br.readLine()));
		}
		
		System.out.println(hMin + dMin -50);
		
	}
}
