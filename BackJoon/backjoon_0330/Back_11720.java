package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 11720번 문제 
//8단계 - 문자열 : 숫자의 합
//https://www.acmicpc.net/problem/11720
//2020.03.30
public class Back_11720 {
	// 메모리 : 13060KB / 시간 72ms
	//배열 사용하는 방법
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int test_case = Integer.parseInt(br.readLine());
//		String[] n = br.readLine().split("");
//		int sum = 0;
//		for(int i=0; i<test_case; i++) {
//			sum += Integer.parseInt(n[i]);
//		}
//		System.out.println(sum);
//	}
	
	// 메모리 덜차지 (12904KB) / 시간 76ms
	//charAt 사용하는 방법 (얘가 효율성 제일 좋은데..???)
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		int sum = 0;
		String num = br.readLine();
		for(int i=0; i<test_case; i++) {
			sum += num.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
