import java.util.Scanner;
/* SW Expert Academy ���� �׽�Ʈ
 * 2072. Ȧ���� ���ϱ�
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QSEhaA5sDFAUq&categoryId=AV5QSEhaA5sDFAUq&categoryType=CODE
 */

public class SWEA_2072 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			int array[] = new int [10];
			
			for(int num=0; num<10; num++) {
				array[num] = sc.nextInt();
				
				if(array[num]%2 == 1) {
					result += array[num];
				}
			}
			
			System.out.println("#" + test_case +" " + result);
		}
						
	}

}
