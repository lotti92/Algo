package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� �˰��� 2739�� ����
//3�ܰ� : For�� - ������
//https://www.acmicpc.net/problem/2739
public class Back_2739 {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		if(num<0 || num >10) System.exit(0);
		
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
}
