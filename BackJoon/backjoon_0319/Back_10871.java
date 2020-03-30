package com.study.algo.backjoon_0319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
//백준 알고리즘 10871번 문제 
//3단계 : For문 - X보다 작은 수 
//https://www.acmicpc.net/problem/10871
//2020.03.19
public class Back_10871 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int line = sc.nextInt();
//		int max = sc.nextInt();
//		
//		for(int i=0; i<line; i++) {
//			int num = sc.nextInt();
//			if(num <max) bw.write(num + " ");
//		}
//		bw.flush();
//		bw.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int line = Integer.parseInt(st1.nextToken());
		int max = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<line; i++) {
			int num = Integer.parseInt(st2.nextToken());
			if(num < max) bw.write(num+ " ");
		}
		bw.flush();
		bw.close();
	}
}
