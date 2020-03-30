package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/source/8913105 [참고]
//와우.. 똑똑쓰........ 
//알게된 점 -> 배열 초기화 안해줘도 됨 (배열안에 값 말하는 거임)
public class Back_2577_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 1;
		// 숫자 입력받기
		for(int i=0; i<3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		
		// 배열에 넣기
		int[] arr = new int [10];
		while(result != 0) {
			arr[result%10]++;
			result /= 10;
		}
		
		//출력
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}		
	}

}
