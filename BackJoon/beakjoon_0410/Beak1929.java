package com.study.algo.beakjoon_0410;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 알고리즘 1929번 문제 
//10단계 - 수학2 : 소수 구하기
//https://www.acmicpc.net/problem/1929
//2020.04.10
//시간 초과....
public class Beak1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M; i<=N; i++) {
			if(i==1) continue;
			boolean check = true;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}			
			if(check) {
				bw.write(i + "\n");
			}			
		}
		bw.flush();
		bw.close();
		bw.close();
	}
}
