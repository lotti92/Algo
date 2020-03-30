package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 10817번 문제 
//5단계 : 실습 1 - 세 수 
//https://www.acmicpc.net/problem/10817
//2020.03.23
public class Back_10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers = br.readLine();
		String[] arr = numbers.split(" ");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[1]);
	}
}
