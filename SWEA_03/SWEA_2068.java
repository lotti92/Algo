package com.study.algo.swea;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2068 {
	
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int [10];
		//�Է¹ޱ�
		for(int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(findMax(arr));
	}
	
	private static int findMax(int arr[]) {
		int max = 0;
		
		for(int i=0; i<10; i++) {
			if(arr[i]> max) max = arr[i];
		}
		
		return max;
	}

}
