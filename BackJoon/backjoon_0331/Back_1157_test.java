package com.study.algo.backjoon_0331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://developer-mac.tistory.com/48 [참고]
public class Back_1157_test {
	public static void main(String[] args) throws IOException {
		// 단어 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		System.out.println(findMaxIndex(str));	
	}

	private static char findMaxIndex(String str) {
		int[] cnt = new int [26];
		
		int max = 0;
		char ch = ' ';
		for(int i=0; i<str.length(); i++) {
			cnt[(str.charAt(i)-'A')]++;
			if(max<cnt[(str.charAt(i) - 'A')]) {
				max = cnt[(str.charAt(i)-'A')];
				ch = str.charAt(i);
			} else if(max == cnt[str.charAt(i)-'A']) ch = '?';
		}		
		return ch;
	}

}
