package com.study.algo.backjoon_0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1065번 문제 
//https://www.acmicpc.net/source/12885620 [참고]
//훨씬 단축됨 (배열 안써서 인듯!)
public class Back_1065_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		if(num<=99) count = num;
		else {
			count = 99;
			for(int i=100; i<=num; i++) {
				if(isHanNumber(i)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	private static boolean isHanNumber(int num) {
		
		int n1 = num%10;
		num = num/10;
		int n2 = num%10;
		
		while(num>=10) {
			int n3 = num%10;
			num = num/10;
			int n4 = num%10;
			
			if((n2-n1) != (n4-n3)) return false; 
		}
		
		return true;
	}

}
