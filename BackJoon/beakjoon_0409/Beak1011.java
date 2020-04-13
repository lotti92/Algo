package com.study.algo.beakjoon_0409;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 알고리즘 1011번 문제 
//9단계 - 수학1 : Fly me to the Alpha Centauri
//https://www.acmicpc.net/problem/1011
//2020.04.09
//[참고] https://blog.naver.com/ksseo63/221617511669
public class Beak1011 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- >0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int distance = y-x;
			bw.write(findMinOperate(distance) + "\n");			
		}
		bw.flush();
		br.close();
		bw.close();
	}
	
	/* distance가 0일 때 최솟값 0		distance가 1일 때 최솟값 1			distance가 2일 때 최솟값 2
	 * distance가 3일 때 최솟값 3		distance가 4일 때 최솟값 3
	 * distance가 5~6일 때 최솟값 4	distance가 7~9일 때 최솟값 5
	 * distance가 10~12일 때 최솟값 6	distance가 13~16일 때 최솟값 7
	 * 최솟값 기준으로 마지막 distance 증가율이 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 --> 해당 수열이 (n+1)/2
	 */
	private static int findMinOperate(int distance) {		
		int cnt;
		long lastDistance=0;
		
		for(cnt=1; lastDistance<distance; cnt++) {
			lastDistance += (cnt+1)/2;
		}
		
		return cnt-1;
	}
}
