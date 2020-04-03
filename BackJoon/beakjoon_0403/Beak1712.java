package com.study.algo.beakjoon_0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1712번 문제 
//9단계 - 수학1 : 손익분기점
//https://www.acmicpc.net/problem/1712
//2020.04.03
//문제점 : long 배열을 써버려서 비효율적임
public class Beak1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = new int [3];
		for(int i=0; i<3; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(findBreakPoint(numbers));
	}	
	
	private static int findBreakPoint(int[] numbers) {
		int bp=0;
		if(numbers[1] >= numbers[2]) return -1;
		
		while((numbers[0]+numbers[1]*bp) >= (numbers[2]*bp)) {
			bp++;
		}
		return bp;		
	}
	
}
