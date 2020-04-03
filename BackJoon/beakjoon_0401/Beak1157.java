package com.study.algo.beakjoon_0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1157번 문제 
//8단계 - 문자열 : 단어 공부
//https://www.acmicpc.net/problem/1157
//2020.04.01 
//다시 풀기!
public class Beak1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		
		int[] numbers = new int [26];
		int max = 0;
		char result = '?';
		for(int i=0; i<word.length(); i++) {
			int j = word.charAt(i)-'A';
			numbers[j]++;
			if(max<numbers[j]) {
				max = numbers[j];
				result = word.charAt(i);
			} else if(max == numbers[j]) {
				result = '?';
			}
		}
		
		br.close();
		System.out.println(result);
	}
}
