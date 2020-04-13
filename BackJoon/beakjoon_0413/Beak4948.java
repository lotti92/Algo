package com.study.algo.beakjoon_0413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 4948번 문제 
//10단계 - 수학2 : 베르트랑 공준
//https://www.acmicpc.net/problem/4948
//2020.04.13
//이전 소수 구하기를 참고하여 풀이
public class Beak4948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			int cnt = findPrimeCNT(num);
			System.out.println(cnt);
		}
	}
	
	private static int findPrimeCNT(int num) {
		int cnt = 0;
		if(num==1) return 1;
		boolean[] isNotPrime = new boolean [2*num];
		for(int i=2; i<num; i++) {
			for(int j=2; i*j<2*num; j++) {
				isNotPrime[i*j] = true;
			}
		}
		
		for(int i=num+1; i<2*num; i++) {
			if(!isNotPrime[i]) {
				//System.out.println("isPrime: " + i);
				cnt++;
			}
		}
		
		return cnt;
	}
}
