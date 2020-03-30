package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 4344번 문제 
//7단계 : 함수 - 정수 N개의 합
//https://www.acmicpc.net/problem/4344
//2020.03.30
//소수점 N번째 자리까지 출력하는 함수 : String.format("%.3f", 숫자) <<- 소수점 3번째 자리까지 출력
//참고 : https://cafe.naver.com/teameverywhere/508
public class Back_4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		for(int i=0; i<test_case; i++) {
			String[] line = br.readLine().split(" ");
			
			//평균 구하기
			float result = 0;
			for(int j=1; j<line.length; j++) {
				result += Integer.parseInt(line[j]);
			}
			result = result/Float.parseFloat(line[0]);
			
			//평균 넘는 학생 비율 구하기
			int count = 0;
			for(int k=1; k<line.length; k++) {
				if(Integer.parseInt(line[k]) > result) count++;
			}
			sb.append(String.format("%.3f", (count/Float.parseFloat(line[0]))*100)+"%\n");			
		}
		System.out.println(sb);
	}
}
