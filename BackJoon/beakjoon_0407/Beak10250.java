package com.study.algo.beakjoon_0407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 10250번 문제 
//9단계 - 수학1 : ACM 호텔
//https://www.acmicpc.net/problem/10250
//2020.04.07 ~ 08
public class Beak10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int floor = N%H==0?H:N%H;
//			sb.append(floor);
			int number = N%H==0?N/H:N/H+1;
				
//			if(number<10) sb.append("0"+number);
//			else sb.append(number);
			sb.append(floor*100 + number); // if-else 안쓰고 floor*100 하면 더 빠르게 계산될줄 알았는데 이게 약간 더 메모리 차지하네;;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
