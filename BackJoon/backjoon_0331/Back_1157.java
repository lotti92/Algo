package com.study.algo.backjoon_0331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1157번 문제 
//8단계 - 문자열 : 단어공부
//https://www.acmicpc.net/problem/1157
//2020.03.31
// 내 방법은 시간 및 메모리 초과 ㅠㅠㅠㅠㅠㅠㅠㅠㅠ 
public class Back_1157 {
	public static void main(String[] args) throws IOException {
		// 단어 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] a = br.readLine().toUpperCase().split("");
		String str = br.readLine().toUpperCase();

		// 출력
		System.out.println(findMaxIndex(str));
	}

//	private static String findMaxIndex(String[] arr) {
//		int[] numbers = new int [arr.length];
//		int max = 0;
//		
//		//가장 많이 사용된 횟수 구하기
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i; j<arr.length; j++) {
//				if(arr[i].toUpperCase().equals(arr[j].toUpperCase())) numbers[i]++;
//			}
//			max = (max>numbers[i])?max:numbers[i];
//		}
//		
//		//여러개 존재하는지, 몇번째인지 조사
//		int count = 0, index = 0;
//		for(int i=0; i<numbers.length; i++) {
//			if(max == numbers[i]) {
//				count++;
//				index = i;
//			}
//		}
//		
//		if(count>1) return "?";
//		else return arr[index].toUpperCase();
//	}

//	private static char findMaxIndex(String arr) {
//		int[] numbers = new int[arr.length()];
//		int max = 0, index = 0;
//
//		// 가장 많이 사용된 횟수 구하기
//		for (int i = 0; i < arr.length(); i++) {
//			for (int j = i; j < arr.length(); j++) {
//				if(arr.charAt(i) == arr.charAt(j))
//					numbers[i]++;
//			}
//			if(max<numbers[i]) {
//				max = numbers[i];
//				index = i;
//			}
//		}
//
//		// 여러개 존재하는지, 몇번째인지 조사
//		for (int i = index+1; i < numbers.length; i++) {
//			if (max == numbers[i]) return '?';
//		}
//		
//		return arr.charAt(index);
//	}

	private static char findMaxIndex(String arr) {
		int[] numbers = new int[arr.length()];
		int max = 0;
		char result = ' ';

		// 가장 많이 사용된 횟수 구하기
		for (int i = 0; i < arr.length(); i++) {
			for (int j = i; j < arr.length(); j++) {
				if (arr.charAt(i) == arr.charAt(j))
					numbers[i]++;
			}
			if (max < numbers[i]) {
				max = numbers[i];
				result = arr.charAt(i);
			} else if(max == numbers[i]) result = '?';
		}
		
		return result;
	}

}
