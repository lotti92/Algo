package com.study.algo.beakjoon_0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2908번 문제 
//8단계 - 문자열 : 상수
//https://www.acmicpc.net/problem/2908
//2020.04.01
public class Beak2908_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = br.readLine().split(" ");
		
		int num1 =0, num2=0;
		for(int i=0; i<3; i++) {
			int temp1 = Character.getNumericValue(numbers[0].charAt(i));
			int temp2 = (numbers[1].charAt(i)-'0');
			if(i==0) {
				num1 += temp1;
				num2 += temp2;
			} else if(i==1) {
				num1 += temp1*10;
				num2 += temp2*10;
			} else {
				num1 += temp1*100;
				num2 += temp2*100;
			}
		}
		num1 = num1>num2?num1:num2;
		System.out.println(num1);
	}
}
