package com.study.algo.backjoon_0331;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 알고리즘 2675번 문제 
//8단계 - 문자열 : 문자열 반복
//https://www.acmicpc.net/problem/2675
//2020.03.31
public class Back_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			String[] s = (br.readLine().replace(" ","")).split("");
			int n = Integer.parseInt(s[0]);
			for(int j=1; j<s.length; j++) {
				for(int k=0; k<n; k++) {
					bw.write(s[j]);
				}				
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();		
	}
}
