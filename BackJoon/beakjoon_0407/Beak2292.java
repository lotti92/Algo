package com.study.algo.beakjoon_0407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2292번 문제 
//9단계 - 수학1 : 벌집
//https://www.acmicpc.net/problem/2292
//2020.04.07
// [참고] https://blog.naver.com/stella817/221807481671 
public class Beak2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int minBang = 0;
		
		for(int i=0;; minBang++) {
			i += minBang;
			if(num<=6*i+1) break;
		}//for문대신 while문 써도 될듯

		System.out.println(minBang+1);
	}
}