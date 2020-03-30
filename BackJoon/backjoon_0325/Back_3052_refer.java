package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/source/6016614 [참고]
//이게 메모리 덜 소모하넹 이중 포문이 아니라서 인가
public class Back_3052_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean [42];
		
		for(int i=0; i<10; i++) {
			int num = Integer.parseInt(br.readLine());
			check[num%42] = true;
		}
		
		int count = 0;
		for(int i=0; i<42; i++) {
			if(check[i]) count++;
		}
		
		System.out.println(count);
	}

}
