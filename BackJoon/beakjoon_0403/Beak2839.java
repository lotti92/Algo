package com.study.algo.beakjoon_0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2839번 문제 
//9단계 - 수학1 : 설탕 배달
//https://www.acmicpc.net/problem/2839
//2020.04.03
//코드가 너무 지저분함..
public class Beak2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		
		int heavy = 0, light = 0, count = -1;
		for(light=0; 5*heavy+3*light<=sugar; light++) {
			for(heavy=0; 5*heavy+3*light<=sugar; heavy++) {
				if(sugar-3*light-5*heavy<5) break;
			}
			if(5*heavy+3*light == sugar) {
				count = count<heavy+light?heavy+light:count;
			} else heavy = 0;		
			System.out.println("heavy: "+heavy+" light: "+light+" 5heavy+3light: "+(5*heavy+3*light));
		}
		System.out.println(count);
	}
}
