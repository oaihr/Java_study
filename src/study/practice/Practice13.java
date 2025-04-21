package study.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
        	
//		prac1();
//		prac2();
//		prac3();
//		prac4();
//		prac5();
//		prac6();
		prac7();
		
	}
		
		public static void prac1() {
//			1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("정수 입력: ");
			int num = scanner.nextInt();
			
			if((num%2) == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			scanner.close();	
		}

		public static void prac2() {
//			2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("정수 입력: ");
			int num = scanner.nextInt();
			
			if ((num % 7) == 0) {
				System.out.println("7의 배수입니다");
			} else {
				System.out.println("아닙니다");
			}
			scanner.close();	
		}

		public static void prac3() {			
//			3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
			int sum = 0;
	        for(int i=1; i<=1000; i++) {     	       	
	        	if(i%5 == 0) {
	        		sum = sum + i;
	        	}    		
	        }
	        System.out.println(sum);
		}

		public static void prac4() {
//			4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//			ex) 입력 : 10
//			결과 : **********
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("수 입력: ");
			int number = scanner.nextInt();
		
		if(number>=1 && number <=50) {
			for(int i=1; i<=number; i++) {
				System.out.print("*");			
			}
		}	
			scanner.close();	
		}

		public static void prac5() {
//			5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//			ex) 1 - 2 + 3 - 4 .....
			
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
	
				if (i % 2 == 0) {
					sum = sum - i;
				}else {
					sum = sum + i;
				}						
			}
			System.out.println(sum);
		}

		public static void prac6() {
//			6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//			1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
			
			int sum = 0;
			int i = 1;
			while(sum<=1000) {
				sum = sum + i;
				i++;
			}
			System.out.println(sum);
		}

		public static void prac7() {
//			7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//			ex) 입력 3
//			3 * 1 = 3
//			3 * 2 = 6
//			3 * 3 = 9
//			...
//			3 * 9 = 27
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("구구단 단수: ");
			int num = scanner.nextInt();
			
			if (num>=1 && num<=9) {
				for(int i=1; i<=9; i++) {
					System.out.println(num+" * "+i+" = "+(num*i)  );			
				}
			}
			scanner.close();
		}
		

}
