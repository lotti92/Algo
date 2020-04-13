package com.study.algo.beakjoon_0409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1978번 문제 
//10단계 - 수학2 : 소수 찾기
//https://www.acmicpc.net/problem/1978
//2020.04.09
public class Beak1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력 받을 개수
		int T = Integer.parseInt(br.readLine());
		//입력 받은 숫자 배열에 넣기 
		String[] numbers = br.readLine().split(" ");
		
		int primeN = 0;
		//소수 구하는 식
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(numbers[i]);
			int cnt = 0;
			for(int j=1; j<=n; j++) {
				if(cnt>3) break;
				else if(n%j==0) cnt++;
			}
			if(cnt == 2) primeN++;	
		}
		System.out.println(primeN);		
	}

}
