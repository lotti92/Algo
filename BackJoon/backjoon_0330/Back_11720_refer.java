package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 11720번 문제 
//https://www.acmicpc.net/source/9436583 [참고]
//배운것 : toCharArray() - char배열로 변환해주는 String 클래스 메소드 >> [참고] https://blog.naver.com/rhkrehduq/221411889236
//배운것 : String.valueOf(char) - char > String으로 변환해주는 메소드 >> [참고] https://blog.naver.com/casio2978/221354780817
//복습 : char -> int로 변환해주는 메소드 >> Character.getNumbericValue(char) >> [참고] https://blog.naver.com/aver2933/221742073973
public class Back_11720_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		int sum = 0;
		char[] num = br.readLine().toCharArray();
		for(int i=0; i<test_case; i++) {
			sum += Integer.parseInt(String.valueOf(num[i])); //메모리 12928KB / 시간 72ms
			//sum += Character.getNumericValue(num[i]); //메모리 12944KB / 시간 76ms
		}
		System.out.println(sum);
	}
}
