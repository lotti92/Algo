package com.study.algo.beakjoon_0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1712번 문제 
//[참고] https://www.acmicpc.net/source/9408310
public class Beak1712_refer {
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
		int profit = numbers[2] - numbers[1];
		if(profit <= 0) return -1;
		
		else return (numbers[0]/profit+1);		
	}
	
}
