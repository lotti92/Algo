package com.study.algo.backjoon_0331;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 알고리즘 10809번 문제 
//8단계 - 문자열 : 알파벳 찾기
//https://www.acmicpc.net/problem/10809
//2020.03.31
public class Back_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] s = br.readLine().toCharArray();
		br.close();
		int[] arr = new int [26];
		
		//arr -1로 초기화
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		
		//알파벳 처음 등장하는 위치 찍기
		for(int i=0; i<s.length; i++) {
			//if문 많이 타서 변경하려했는데.. 메모리는 얘가 더 빠르네 메모리 : 12996KB / 시간: 76ms
			if(arr[s[i] - 'a'] == -1) arr[s[i] -'a'] = i;
			// 얘가 더 메모리 많이 먹네.. 메모리 : 13012KB / 시간 : 68ms
//			if(arr[s[i] - 'a'] != -1) continue;
//			arr[s[i] -'a'] = i;
		}
		
		//출력
		for(int i=0; i<26; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		bw.close();
	
	}
}
