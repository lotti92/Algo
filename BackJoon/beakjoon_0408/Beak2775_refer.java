package com.study.algo.beakjoon_0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2775번 문제 
//[참고] https://www.acmicpc.net/source/7134302
//[참고] https://www.acmicpc.net/source/9775892
public class Beak2775_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] apt = new int [15][15];
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<15; i++) {
			apt[i][1] = 1;	//N층 1호는 1명
			apt[0][i] = i;	//0층 N호는 N명
		}
		
		for(int floor=1; floor<15; floor++) {
			for(int ho=2; ho<15; ho++) {
				apt[floor][ho] = apt[floor-1][ho] + apt[floor][ho-1];
				
			}
		}
		
		while(testCase-- > 0) {
			int floor = Integer.parseInt(br.readLine());
			int ho = Integer.parseInt(br.readLine());
			sb.append(apt[floor][ho] + "\n");
		}
		System.out.println(sb);
	}
}
