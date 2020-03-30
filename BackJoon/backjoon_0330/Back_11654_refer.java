package com.study.algo.backjoon_0330;

import java.io.IOException;

//백준 알고리즘 11654번 문제 
// https://www.acmicpc.net/source/2183297 [참고]
//버퍼없이 이렇게 받을수도 있구나.. int형일때만 가능하긴 함
// System.in.read(); --> 아스키 타입으로 문자하나 입력하는 방식 (한 바이트씩 읽어옴)
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//--> 메모리 공간을 잡아서 문자열로 입력받는 방식 (메모리 효율성 좋아짐), but String으로만 가져옴
// Scanner sc = new Scanner(System.in); 
//--> 가장 기본적인 방식  (입력된 내용을 버퍼에 저장했다가 엔터키 누르는 순간 버퍼 내용이 코드로 넘어감), 데이터 파싱해서 원하는 type으로 가져올 수 있음
// 참고 : https://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040201&docId=336316992&qb=U3lzdGVtLmluLnJlYWQoKTs=&enc=utf8§ion=kin&rank=2&search_sort=0&spq=0
// 참고 : https://shs2810.tistory.com/19 
public class Back_11654_refer {
	public static void main(String[] args) throws IOException {
		int c = System.in.read();
		System.out.println(c);
	}
}
