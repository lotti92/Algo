package com.study.algo.beakjoon_0410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1929번 문제 
//10단계 - 수학2 : 소수 구하기
//https://www.acmicpc.net/problem/1929
//2020.04.10~13
//7번의 시도 끝에 겨우 성공 ㅠ_ㅠ
public class Beak1929_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb;
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] isNotPrime = new boolean [N+1];
		isNotPrime[0] = isNotPrime[1] = true;
		
		for(int i=2; i*i<=N; i++) {
			for(int j=i+1; j<=N; j++) {
				if(j%i == 0) {
					isNotPrime[j] = true;
				}
			}
		}
		
//		for(int i=2; i<=N; i++) {
//			for(int j=i+1; j<=N; j++) {
//				if(j%i == 0) {
//					isNotPrime[j] = true;
//				}
//			}
//		}
		
		sb = new StringBuilder();
		
		for(int i=M; i<=N; i++) {
			if(!isNotPrime[i])
				sb.append(i).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
