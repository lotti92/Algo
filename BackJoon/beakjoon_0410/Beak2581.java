package com.study.algo.beakjoon_0410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2581번 문제 
//10단계 - 수학2 : 소수
//https://www.acmicpc.net/problem/2581
//2020.04.10
public class Beak2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int minPrime = N+1; //소수중 최솟값
		int sum = 0; //소수의 합
		
		if(M==1) M = M+1;
		
		for(int i=M; i<=N; i++) {
			boolean check = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					check=false;
					break;
				}
			}
			if(check) {
				sum += i;
				minPrime = minPrime>i?i:minPrime;
			}
		}
		
		if(sum==0) System.out.println(-1);
		else System.out.println(sum +"\n" + minPrime);
	}

}