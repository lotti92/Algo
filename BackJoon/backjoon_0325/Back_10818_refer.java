package com.study.algo.backjoon_0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//간단한 코드(메모리는 적게, 시간은 많이 소요) -> Arrays.sort 이용하기
//Arrays.sort -> 오름차순 또는 내림차순으로 설정할 수 있음
//Arrays.sort(arr) : 오름차순
//Arrays.sort(arr,Collections.reverseOrder()) : 내림차순
public class Back_10818_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numArr = new int [number];
		for(int i=0; i<number; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numArr);
		br.close();
		System.out.println(numArr[0] + " " + numArr[number-1]);
	}
}
