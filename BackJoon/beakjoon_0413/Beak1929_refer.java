package com.study.algo.beakjoon_0413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1929번 문제 
//[참고]https://www.acmicpc.net/source/5415501
//합성수로 풀이
public class Beak1929_refer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		boolean[] isNotPrime = new boolean [end+1];
		isNotPrime[0] = isNotPrime[1] = true;
		
		int N = (int)Math.sqrt(end);		
		for(int i=2; i<=N; i++) {
			if(isNotPrime[i]) continue;
			for(int j=2; i*j<=end; j++) {
				isNotPrime[i*j] = true;
			}
		}
		
		for(int i=start; i<=end; i++) {
			if(!isNotPrime[i])
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
