package com.study.algo.backjoon_0318;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//���� �˰���  2742�� ����
//3�ܰ� : For�� - ���� N
//https://www.acmicpc.net/problem/2742
public class Back_2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(; num>0; num--) {
			bw.write(num + "\n");
		}
		bw.flush();
		bw.close();		
	}
}
