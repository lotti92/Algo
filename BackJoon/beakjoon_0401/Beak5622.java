package com.study.algo.beakjoon_0401;

import java.io.IOException;

//백준 알고리즘 5622번 문제 
//8단계 - 문자열 : 다이얼
//https://www.acmicpc.net/problem/5622
//2020.04.01
public class Beak5622 {
	public static void main(String[] args) throws IOException {
		
		int time = 0;
		while(true) {
			int alpha = System.in.read();
			if(alpha>='A' && alpha<='C') time += 3;
			else if(alpha>='D' && alpha<='F') time += 4;
			else if(alpha>='G' && alpha<='I') time += 5;
			else if(alpha>='J' && alpha<='L') time += 6;
			else if(alpha>='M' && alpha<='O') time += 7;
			else if(alpha>='P' && alpha<='S') time += 8;
			else if(alpha>='T' && alpha<='V') time += 9;
			else if(alpha>='W' && alpha<='Z') time+=10;
			else break;
		}
		System.out.println(time);		
	}
}
