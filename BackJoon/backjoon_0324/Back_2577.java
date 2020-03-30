package com.study.algo.backjoon_0324;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//백준 알고리즘 2577번 문제 
//6단계 : 1차원배열 - 숫자의 개수
//https://www.acmicpc.net/problem/2577
//2020.03.24 ~ 25
//참고한 자료 : https://blog.naver.com/aver2933/221742073973
//int -> char 변환 : Integer.toString(int).charAt(0)
//char -> int 변환 : Character.getNumericValue(char) 
public class Back_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		String result = (num1 * num2 * num3) + "";
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			//arr[i] = 0; //배열 값 초기화 안해도 됨
			for (int j = 0; j < result.length(); j++) {
				if (Integer.toString(i).charAt(0) == result.charAt(j)) {
					arr[i] = arr[i] + 1;
				}
					
			}
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
