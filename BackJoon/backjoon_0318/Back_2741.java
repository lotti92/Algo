package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//���� �˰���  2741�� ����
//3�ܰ� : For�� - N ���
//https://www.acmicpc.net/problem/2741
public class Back_2741 {

	public static void main(String[] args) throws Throwable, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
}
