package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//백준 알고리즘 10039번 문제 
//5단계 : 실습 1 - 평균 점수
//https://www.acmicpc.net/problem/10039
//2020.03.23
public class Back_10039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] score = new int [5];
		int avg = 0;
		for(int i=0; i<5; i++) {
			score[i] = Integer.parseInt(br.readLine());
			if(score[i] < 40) score[i] = 40;
			avg = avg + score[i];
		}
		System.out.println(avg/5);
	}	

}
