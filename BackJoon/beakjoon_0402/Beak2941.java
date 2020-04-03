package com.study.algo.beakjoon_0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2941번 문제 
//8단계 - 문자열 : 크로아티아 알파벳
//https://www.acmicpc.net/problem/2941
//2020.04.01 ~ 02
//[참고] https://blog.naver.com/stella817/221790069130
public class Beak2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine().trim();
		
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			count++;
			if(text.charAt(i) =='=') {
				if(i>1 && text.charAt(i-1) == 'z' && text.charAt(i-2) == 'd') count -= 2;
				else count--;
			} else if (text.charAt(i) == '-') count --;
			else if(text.charAt(i) == 'j') {
				if(i !=0 && (text.charAt(i-1) =='l' || text.charAt(i-1)=='n')) count --;
			}
		}

		System.out.println(count);
		
	}
}
