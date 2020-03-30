package com.study.algo.backjoon_0324;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/source/18434112 [참고]
//와우.. 똑똑쓰..
public class Back_10996_refer {
	public static void main(String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(bf.readLine());
		int copyNum=num;
		String first="";
		String second=" ";
		for(;num>0;num--) {
			if(num%2==0) {
				second+="* ";
			}
			else {
				first+="* ";
			}
		}
		for(int i=0;i<copyNum;i++) {
			bw.write(first+"\n");
			bw.write(second+"\n");
		}
		bw.flush();
	}
}
