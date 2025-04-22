package study.practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
//		prac1();
//		prac2();
		prac3();
	}
		public static void prac1() {
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
		
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[5];
		System.out.print("5개의 자연수를 차례대로 입력하세요(공백 구분) : ");
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
//		numArr[0] = scanner.nextInt();
//		numArr[1] = scanner.nextInt();
//		numArr[2] = scanner.nextInt();
//		numArr[3] = scanner.nextInt();
//		numArr[4] = scanner.nextInt();	

		System.out.print("몇번 째 수인가요? ");
		int num = scanner.nextInt();
		System.out.print("결과 : "+ numArr[num-1]);	
		
		scanner.close();
		}
		
		public static void prac2() {
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[5];
		System.out.print("5개의 자연수를 차례대로 입력하세요(공백 구분) : ");
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
		
		System.out.print("결과 : ");
		for(int i=0;i<5;i++) {
			System.out.print(numArr[4-i]+" ");			
			}
		
		scanner.close();
		}
		
		public static void prac3() {
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
			
			int [][] arr1 = new int[4][4];
			
			// 내가 만든 로직 
			
//			for(int i=0; i<arr1.length; i++) {
//				for(int j=0; j<arr1[i].length; j++) {
//				arr1[i][j] = (4*i)+1+j;  = 인덱스마다 값을 입력하는 식이 num을 이용할 때 보다 복잡
//				System.out.printf("%3d", arr1[i][j]);
//				}
//				System.out.println("");
//			}
			
			int num = 1;
			for(int i=0;i<arr1.length; i++) {
				for(int j=0; j<arr1[i].length; j++) {
					arr1[i][j] = num;
					System.out.printf("%3d", arr1[i][j]);
					num++;					
				}
				System.out.println("");
			}
						
			
			
		}

		

}
