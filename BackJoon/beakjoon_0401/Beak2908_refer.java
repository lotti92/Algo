package com.study.algo.beakjoon_0401;

import java.io.IOException;

//백준 알고리즘 2908번 문제 
//https://www.acmicpc.net/source/7581463 [참고]
public class Beak2908_refer {
	public static void main(String[] args) throws IOException {
		int[] A = new int [3];
		for(int i=0; i<3; i++) {
			A[i] = System.in.read()-'0';
		}
		System.in.read();
		
		int[] B = new int [3];
		for(int i=0; i<3; i++) {
			B[i] = System.in.read()-'0';
		}
		
		int num1 = A[0] + A[1]*10 + A[2]*100;
		int num2 = B[0] + B[1]*10 + B[2]*100;
		
		System.out.println(num1>num2?num1:num2);
	}
}
