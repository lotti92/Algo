package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1065번 문제 
//7단계 : 함수 - 한수
//https://www.acmicpc.net/problem/1065
//2020.03.30
public class Back_1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		if(num<=99) count = num;
		else {
			count = 99;
			for(int i=100; i<=num; i++) {
				if(isHanNumber(i)) count++;
			}
		}
		System.out.println(count);
	}
	
	private static boolean isHanNumber(int num) {
		
		String s = num + "";
		String[] numbers = s.split("");
		int num1 = Integer.parseInt(numbers[2]) - Integer.parseInt(numbers[1]);
		int num2 = Integer.parseInt(numbers[1]) - Integer.parseInt(numbers[0]);

		if(num1 == num2) return true;
		else return false;
	}

}
