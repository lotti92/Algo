package com.study.algo.beakjoon_0413;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 알고리즘 9020번 문제 
//10단계 - 수학2 : 골드바흐의 추측
//https://www.acmicpc.net/problem/9020
//2020.04.13
public class Beak9020 {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tt = Integer.parseInt(br.readLine());
		while(tt-- >0) {
			int num = Integer.parseInt(br.readLine());
			int halfNum = num/2;
			if(isPrimeCheck(halfNum)) bw.write(halfNum + " " + halfNum);
			else {
				for(int i=1;; i++) {
					if(isPrimeCheck(halfNum-i) && isPrimeCheck(halfNum+i)) {
						bw.write((halfNum-i) + " " + (halfNum+i));
						break;
					}
				}
			}
			bw.write('\n');
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean isPrimeCheck(int n) {
		boolean check = true;
		if(n == 2) return true;
		for(int i=2; i<Math.sqrt(n)+1; i++) {
			if(n%i == 0) {
				check = false;
				break;
			}
		}		
		return check;
	}

}
