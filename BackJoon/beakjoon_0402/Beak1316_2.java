package com.study.algo.beakjoon_0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1316번 문제 
//8단계 - 문자열 : 그룹 단어 체커
//https://www.acmicpc.net/problem/1316
//2020.04.02
//방법2 : boolean형 배열쓰는 방법 if/else if문이 있어서인지 메모리 조금 더 먹음
public class Beak1316_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(num-- >0) {
			boolean[] check = new boolean [26];
			String s = br.readLine();
			count++;
			for(int i=0; i<s.length(); i++) {
				if(!check[s.charAt(i)-'a']) check[s.charAt(i)-'a'] = true;
				else if(s.charAt(i) != s.charAt(i-1)) {
						count--;
						break;
					}
			}
		}
		System.out.println(count);
	}
}
