package com.study.algo.beakjoon_0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2908번 문제 
//8단계 - 문자열 : 상수
//https://www.acmicpc.net/problem/2908
//2020.04.01
public class Beak2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] numbers = br.readLine().toCharArray();
		int num1 = 0, num2 = 0;
		for(int i=0; i<numbers.length; i++) {
			int num = Character.getNumericValue(numbers[i]);
			
			if(i == 3) continue;
			switch(i%4) {
			case 0:
				if(i<3) num1 += num;
				else num2 += num;
				break;
			case 1:
				if(i<3) num1 += num*10;
				else num2 += num*10;
				break;
			case 2:
				if(i<3) num1 += num*100;
				else num2 += num*100;
			default:
				break;
			}
		}		
		num1 = num1>num2?num1:num2;
		System.out.println(num1);		
	}
}
