package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 5543번 문제 
//5단계 : 실습 1 - 상근날드
//https://www.acmicpc.net/problem/5543
//2020.03.23
public class Back_5543 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int [5];
		
		//가격 입력
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//저렴한 햄버거 찾기
		int setPrice = findMin(arr[0], arr[1]);
		setPrice = findMin(setPrice, arr[2]);
//		if(arr[0] < arr[1] && arr[0] < arr[2])	 setPrice += arr[0];
//		else if (arr[1] < arr[0] && arr[1] < arr[2]) setPrice += arr[1];
//		else setPrice += arr[2];
//		System.out.println(setPrice);
		
		//저렴한 음료 찾기
		setPrice += findMin(arr[3], arr[4]);
//		if(arr[3] < arr[4]) setPrice += arr[3];
//		else setPrice += arr[4];
		
		System.out.println(setPrice-50);
		
	}
	
	private static int findMin(int a, int b) {
		if(a>b) return b;
		else return a;
	}
}
