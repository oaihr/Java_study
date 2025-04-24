package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
//		prac1();
//		prac2v1();
//		prac2v2();
//		prac3v1();
//		prac3v2();
		prac4();
	}
	public static void prac1() {
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		System.out.print("주사위 두 눈의 합이 6이 되는 경우 : ");
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {				
				if(i+j == 6) {
					System.out.printf("(%d, %d) ", i, j);
				}
			}
		}
	}
	public static void prac2v1() {
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
		
		//랜덤 값 생성 
		
		//Random random = new Random();
		//System.out.println(random.nextInt(5));  // 0 1 2 3 4
		//System.out.println(random.nextInt(1, 5)); // 1<=랜덤값<5  jdk17~
		
		
//		 (int)(Math.random() * 숫자의 개수) + 시작숫자		
//		int lottery = (int)(Math.random()*6)+1;
//		System.out.println(lottery);
				
		//시작
		int[] lotto = new int[6];	// 로또 6개 값 저장용 배열변수
		
		int num; // 뽑은 숫자 임시 저장
		int index = 0; // 배열의 위치를 나타내는 인덱스
		
		// 6개의 번호를 뽑는 과정
		while(true) {
			
			//랜덤값 뽑기
			num = (int)( (Math.random()*45) +1);
			
			boolean isDuplicated = false; // 중복여부 사전 false로 초기화
			
			for(int i=0; i<index; i++) {
				if(lotto[i] == num) { // 내가 뽑은 값이랑 중복된 값이 있나?			
										
					// 중복을 기록
					isDuplicated = true;
					break;
				}
			}
			
//			if(isDuplicated) { //중복이면 pass
//				
//			}else { //종복 아니면? lotto 배열에 저장하면서 계속 진행
//				
//			}
			if(isDuplicated)
				continue;
			
			//중복 아닐 때 실행할 코드
			lotto[index] = num;			
			index++; // 다음 칸으로 이동
			
			//6개 다 채웠으면? 끝
			if(index >= lotto.length)
				break;
		}
		for(int i=0; i<lotto.length; i++) {
		System.out.println( (i+1)+"번 번호 : "+lotto[i]);
		}		
		

	}
	public static void prac2v2() {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)( (Math.random()*45) +1);
			
			for(int j=0;j<i;j++) {					
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}												
			}			
		}
		
		for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i]+" ");
		}
	}
	public static void prac3v1() {
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20
		
		// 1차원 배열
		int[] class1 = new int[5];
		int[] class2 = new int[5];
		int[] class3 = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1반: ");
		for(int i=0; i<class1.length; i++) {
			class1[i] = scanner.nextInt();
		}
		System.out.print("2반: ");
		for(int i=0; i<class2.length; i++) {
			class2[i] = scanner.nextInt();
		}		
		System.out.print("3반: ");
		for(int i=0; i<class3.length; i++) {
			class3[i] = scanner.nextInt();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		System.out.print("1반 평균 : ");
		for(int i=0; i<class1.length; i++) {
			sum1 = sum1 + class1[i];			
		}
		System.out.println(sum1/5.0);
		
		System.out.print("2반 평균 : ");
		for(int i=0; i<class1.length; i++) {
			sum2 = sum2 + class2[i];			
		}
		System.out.println(sum2/5.0);
		
		System.out.print("3반 평균 : ");
		for(int i=0; i<class3.length; i++) {
			sum3 = sum3 + class3[i];			
		}
		System.out.println(sum3/5.0);
		
		System.out.print("전체 평균 : ");
		double total = ( (sum1/5.0) + (sum2/5.0) + (sum3/5.0) ) / 3.0;
		System.out.println(total);
		
		scanner.close();
	}
	public static void prac3v2() {
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20
		
		// 2차원 배열
		int[][] score = new int[3][5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {  // 점수 저장
			System.out.print((i+1)+"반 : ");
			for(int j=0; j<score[i].length; j++) {				
				score[i][j] = scanner.nextInt();
			}
		}
		
		double totalSum = 0;
		
		for(int i=0; i<score.length; i++) {		// 반 평균 출력 + 전체 합 구하기
			System.out.print((i+1)+"반 평균 : ");
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {				
				sum = sum + score[i][j];
			}
			System.out.println(sum/5.0);
			totalSum = totalSum + sum/5.0;
		}
		
		System.out.println("전체 평균 : "+(totalSum/3.0));
		
		scanner.close();
	}
	public static void prac4() {
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270
		
		int[][] arr ={
					  {10, 20, 30},
					  {20, 30, 40},
				      {30, 40, 50}
					 };
						
		int[][] result = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				result[i][j] = arr[i][j];  // 같은 인덱스 위치에 복사
						
				result[i][3] = result[i][3] + arr[i][j];//행의 마지막 열에 더하기
				result[3][j] = result[3][j] + arr[i][j]; //열의 마지막 행에 더하기
				result[3][3] = result[3][3] + arr[i][j]; //마지막 행 마지막 열에 더하기
			}
		}

		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}
