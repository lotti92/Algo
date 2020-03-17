import java.util.Scanner;

public class SWEA_2071 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			float result = 0;
//			int array[] = new int [10];
			int abc = 0;
			for(int num=0; num<10; num++) {
				abc = sc.nextInt();
				result += abc;
//				array[num] = sc.nextInt();
//				result += array[num];
			}
			result = result/10;
//			result = result/array.length;
			System.out.println("#" + test_case + " " + Math.round(result));
		}
		
		
		
	}

}
