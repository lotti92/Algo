package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//HashSet 사용하여 배열 안에 중복된 정수 개수 구하기
//https://www.acmicpc.net/source/9441663 [참고]
//HashSet은 순서는 중요하지 않으며, 중복값을 허용하지 않음

public class Back_3052_refer2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			int num = Integer.parseInt(br.readLine());
			hash.add(num%42); //같은 값이 있으면 추가되지 않음
		}
		System.out.println(hash.size());
	}
}
