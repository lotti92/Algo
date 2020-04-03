package com.study.algo.beakjoon_0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2839번 문제 
//[참고] https://www.acmicpc.net/source/6451515
public class Beak2839_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int input = Integer.parseInt(br.readLine());
			int num = 0;
			while(input%5!=0){
				input -= 3;
				num++;
			}
			if(input < 0) System.out.println(-1);
			else{
				num += input/5;				
				System.out.println(num);
			}
        br.close();
	}
}
