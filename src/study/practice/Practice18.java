package study.practice;

import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		prac1();
//		prac2();
//		prac3();
	}
	
	public static void prac1() {		
		
		String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};		
		
		for(int i=0; i<menuArr.length; i++) {
			System.out.println((i+1)+". "+menuArr[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 메뉴 번호를 입력하세요 : ");
		int menu = scanner.nextInt();
		
		if(menu >=1 && menu <= 4) {
			System.out.println(menuArr[menu-1]+" 메뉴입니다.");
		}else if(menu ==5) {
			System.out.println(" 프로그램이 종료됩니다.");
		}else {
			System.out.println(" 잘못 입력하셨습니다.");
		}
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("5. 종료");
//		System.out.print(" 메뉴 번호를 입력하세요 : ");
//		int num = scanner.nextInt();
//		
//		switch(num) {
//		case 1:
//			System.out.println(" 입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println(" 수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println(" 조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println(" 삭제 메뉴입니다.");
//			break;
//		case 5: 
//			System.out.println(" 프로그램이 종료됩니다.");
//			break;
//		default:
//			System.out.println(" 잘못 입력하셨습니다.");
//		}
//		
		scanner.close();
	}
	
	public static void prac2() {
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.
//		0 1 2 3 4
//	0	1 2 2 2 2
//	1	3 1 2 2 2
//	2	3 3 1 2 2
//	3	3 3 3 1 2
//	4	3 3 3 3 1
		
		int[][] arr1 = new int[5][5];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(i == j) {
					arr1[i][j] = 1; 
				}else if(i < j) {
					arr1[i][j] = 2; 
				}else if(i > j) {
					arr1[i][j] = 3;
				}
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	public static void prac3() {

//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
		
//		for (int i = 1; i <= 10; i++) {
//
//			for (int j = 1; j <= 10; j++) {
//
//				int formula = (2 * i) + (4 * j);
//
//				if (formula == 10) {
//					System.out.println(i + ", " + j);
//				}
//			}
//		}
		
//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수 2개를 입력 하시오: ");
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		
//		if(num1 > num2) {
//			System.out.println("계산결과: "+(num1 - num2));
//		}else if(num1 < num2) {
//			System.out.println("계산결과: "+(num2 - num1));
//		}else {
//			System.out.println("계산결과: 0");
//		}
		
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("4개의 윷을 입력해주세요(0:안뒤집어짐, 1:뒤집어짐) : ");
//		
//		int yut1 = scanner.nextInt();
//		int yut2 = scanner.nextInt();
//		int yut3 = scanner.nextInt();
//		int yut4 = scanner.nextInt();	
//		
//		int result = yut1 + yut2 + yut3 + yut4;
//		
//		switch(result) {
//		case 0 :
//			System.out.println("결과 모");
//			break;
//		case 1 :
//			System.out.println("결과 도");
//			break;
//		case 2 :
//			System.out.println("결과 개");
//			break;
//		case 3 :
//			System.out.println("결과 걸");
//			break;
//		case 4 :
//			System.out.println("결과 윷");
//			break;
//		default:
//			System.out.println("낙입니다");
//		}
//		scanner.close();
		
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("수를 입력하세요: ");
//		int num = scanner.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			System.out.print("*");
//		}
//		
	}
}
