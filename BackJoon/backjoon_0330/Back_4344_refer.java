package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 알고리즘 4344번 문제 
//https://www.acmicpc.net/source/12832472 [참고]
//메모리나 시간이 많이 줄어들지는 않는듯..
public class Back_4344_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		for(int i=0; i<test_case; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken());
			int[] score = new int [student];
			
			//평균 구하기 
			float avg = 0;
			for(int j=0; j<student; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				avg += score[j];
			}			
			avg = avg/student;
			
			//평균 넘는 학생 비율 구하기
			int count = 0;
			for(int k=0; k<student; k++) {
				if(score[k] > avg) count++;
			}
			bw.write(String.format("%.3f", count*100.000/student)+"%\n");			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
