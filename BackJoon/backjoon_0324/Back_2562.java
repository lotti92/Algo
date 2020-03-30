package com.study.algo.backjoon_0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2562번 문제 
//6단계 : 1차원배열 - 최댓값
//https://www.acmicpc.net/problem/2562
//2020.03.24
public class Back_2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int [9];
		int max = 0;
		int lineNum = 0;
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if(max<numbers[i]) {
				max = numbers[i];
				lineNum = i+1;
			}
		}
		System.out.println(max);
		System.out.println(lineNum);
	}
}
