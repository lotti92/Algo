package com.study.algo.backjoon_0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 10818번 문제 
//6단계 : 1차원 배열 - 최소, 최대
//https://www.acmicpc.net/problem/10818
//2020.03.24
public class Back_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nCase = Integer.parseInt(br.readLine());
		String[] arr = new String [nCase];
		String numbers = br.readLine();
		br.close();
		arr = numbers.split(" ");
		
		int findMin = Integer.MAX_VALUE;
		int findMax = Integer.MIN_VALUE;
		for(int i=0; i<nCase; i++) {
			findMin = Math.min(findMin, Integer.parseInt(arr[i]));
			findMax = Math.max(findMax, Integer.parseInt(arr[i]));
		}
		System.out.println(findMin + " " + findMax);
	}
}
