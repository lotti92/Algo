package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//���� �˰���  11021�� ����
//3�ܰ� : For�� - A+B - 7
//https://www.acmicpc.net/problem/11021
public class Back_11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. ���� ����� ���
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		StringTokenizer st;
//		for(int i=0; i<num; i++) {
//			st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			bw.write("Case #" + (i+1) + ": " + (a+b) + "\n");
//		}
//		bw.flush();
//		bw.close();
		
		//2. �޸� �� ���� ��� ��� >> ȿ������ �̰� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String number = br.readLine();
			String[] arr = number.split(" ");
			
			sb.append("Case #" + (i+1) + ": ");
			sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
		}
		System.out.println(sb.toString());
		
		//3. ���ο� ���
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		for(int i=0; i<num; i++) {
//			String[] arr = br.readLine().split(" ");
//			bw.write("Case #" + (i+1) + ": " + (Integer.parseInt(arr[0])+Integer.parseInt(arr[1]))+"\n");
//		}
//		bw.flush();
//		bw.close();
	}
}
