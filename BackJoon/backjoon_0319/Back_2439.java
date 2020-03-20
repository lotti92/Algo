package com.study.algo.backjoon_0319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 알고리즘  2439번 문제
//3단계 : For문 - 별 찍기 - 2
//https://www.acmicpc.net/problem/2439
//2020.03.19
public class Back_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		br.close();
		for(int i=1; i<=num; i++) {
			for(int space=num; space>i; space--) {
				bw.write(" ");
			}
			for(int star=1; star<=i; star++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
