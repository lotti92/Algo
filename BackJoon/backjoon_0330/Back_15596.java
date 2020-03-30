package com.study.algo.backjoon_0330;

public class Back_15596 {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		long result = sum(A);
		
		System.out.println(result);
	}
	
	private static long sum(int[] a) {
		long result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
