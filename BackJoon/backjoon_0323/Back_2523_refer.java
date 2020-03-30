package com.study.algo.backjoon_0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/source/3502707 [참고]
// 복잡하지 않음!
public class Back_2523_refer {
	public static void main(String[] args) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int start = 1;
        
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<start; j++){
                sb.append("*");
            }
            sb.append("\n");
            if(i<n-1) start++;
            else start--;
        }
        System.out.println(sb);
    }
}
