package com.study.algo.backjoon_0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� �˰��� 10951�� ����
//4�ܰ� : while�� - A+B - 4
//https://www.acmicpc.net/problem/10951
//2020.03.20
public class Back_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		while((input=br.readLine()) != null && (input.length())!= 0) {
			String[] arr = input.split(" ");
			sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
		}
		System.out.println(sb.toString());
	}
}
