package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 3052번 문제 
//6단계 : 1차원배열 - 나머지
//https://www.acmicpc.net/problem/3052
//2020.03.25
public class Back_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//숫자 입력받고 나머지 계산
		int[] arr = new int [10];
		for(int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		//개수 계산
		int count = 10;
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				if(arr[i] == arr[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
