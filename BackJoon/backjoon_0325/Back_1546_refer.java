package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/source/8543432 [참고]
//코드 길이는 적으나, 내가 푼 방법보다 메모리 및 시간이 더 좋지는 않음
public class Back_1546_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		float score=0, sum=0, max=0;
		for(int i=0; i<num; i++) {
			score = Float.parseFloat(arr[i]);
			sum += score;
			max = score > max ? score : max;
		}
		sum = sum/max * 100;
		System.out.println(sum/num);
	}
}
