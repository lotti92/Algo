package com.study.algo.beakjoon_0407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1193번 문제 
//9단계 - 수학1 : 분수찾기
//https://www.acmicpc.net/problem/1193
//2020.04.07
public class Beak1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int i=1, j =1;
		while(num>j) {
			i++;
			j = i*(i+1)/2;
		}
		int cnt = 0;
		for(cnt=0; cnt<i; cnt++) {
			if(num-cnt == i*(i-1)/2) break;
		}
		
		if(i%2 == 1) {
			System.out.println((i+1-cnt) + "/" + cnt);
		} else {
			System.out.println(cnt + "/" + (i-cnt+1));
		}

	}
}
