package com.study.algo.backjoon_0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� �˰��� 10952�� ����
//4�ܰ� : while�� - A+B - 5
//https://www.acmicpc.net/problem/10952
//2020.03.20
public class Back_10952 {
	// ���� Ǭ ���
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		while(true) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int num1 = Integer.parseInt(st.nextToken());
//			int num2 = Integer.parseInt(st.nextToken());
//			if(num1==0 && num2==0) break;
//			sb.append(num1+num2).append("\n");
//		}
//		System.out.println(sb.toString());
//	}
	
	//StringTokenizer �Ⱦ��� StringBuilder�θ� ó���ϴ� ���
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			if(line.equals("0 0")) break;
			String[] arr = line.split(" ");
			sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
		}
		System.out.println(sb.toString());
	}
}
