package com.study.algo.backjoon_0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1110번 문제 
//4단계 : while문 - 더하기 사이클
//https://www.acmicpc.net/problem/1110
//2020.03.20
public class Back_1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int temp = number/10;
		int newInput = number%10;
		int cycle=0;
		while(true) {
			int sum = temp + newInput;
			cycle++;
//			System.out.println("cycle: " + cycle + " sum: " + sum + " newInput: " + newInput + " temp: " + temp);
			temp = newInput;
			newInput = sum%10;
			if(number == (temp*10+newInput)) break;
		}
		System.out.println(cycle);
	}	
}
