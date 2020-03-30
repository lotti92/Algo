package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/source/6665015 [참고]
//조금 변형함
//[알게된 것] 
//1. 배열없이 charAt을 사용하여 배열처럼 쓸 수 있다.
//2. count 전처리 
public class Back_8958_refer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < test_case; i++) {
			String score = br.readLine();	
			
			int count = 0, result = 0;
			for (int j = 0; j < score.length(); j++) {
				if (score.charAt(j) == 'O') result += (++count);
				else count = 0;
			}
			sb.append(result + "\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
