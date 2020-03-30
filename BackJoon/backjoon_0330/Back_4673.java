package com.study.algo.backjoon_0330;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//백준 알고리즘 4673번 문제 
//7단계 : 함수 - 셀프 넘버
//https://www.acmicpc.net/problem/4673
//2020.03.30
public class Back_4673 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] arr = new boolean [10001];
		for(int i=1; i<=10000; i++) {
			int result = d(i);
			if(result < arr.length) arr[result] = true;
		}
		
		for(int i=1; i<=10000; i++) {
			if(!arr[i]) bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	private static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}		
		return sum;
	}

}
