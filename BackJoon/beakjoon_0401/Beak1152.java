package com.study.algo.beakjoon_0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1152번 문제 
//8단계 - 문자열 : 단어의 개수
//https://www.acmicpc.net/problem/1152
//2020.04.01
public class Beak1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().trim();

		int count = 0;
		if(!word.isEmpty()) {
			count = word.split(" ").length;
		}
		
		System.out.println(count);
	}

}
