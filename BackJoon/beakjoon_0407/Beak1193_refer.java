package com.study.algo.beakjoon_0407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1193번 문제 
//9단계 - 수학1 : 분수찾기
//https://www.acmicpc.net/problem/1193
//2020.04.07
//[참고] https://blog.naver.com/pkts2616/221869363733
//와우.. 굳이 for문 안돌렸어도 되는것.... 이것때매 얼마나 오래걸렸는데 ㅠㅠ 
public class Beak1193_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int i=1, j =1;
		while(num>j) {
			i++;
			j = i*(i+1)/2;
		}

		int a=0, b =0;
		if(i%2 == 1) {
			a = i - (j - num);
			b = 1 + (j - num);
		} else {
			a = 1 + (j - num);
			b = i - (j - num);
		}
		System.out.println(b + "/" + a);

	}
}
