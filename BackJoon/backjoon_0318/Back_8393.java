package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;


//���� �˰���  8393�� ����
//3�ܰ� : For�� - ��
//https://www.acmicpc.net/problem/8393
public class Back_8393 {
	public static void main(String[] args) throws Throwable{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
//		//for�� ���
//		int result = 0;
//		for(int i=0; i<=n; i++) {
//			result += i;
//		}
//		System.out.println(result);
		
		//for�� ��� ���� 
		System.out.println(n*(n+1)/2);
	}
}
