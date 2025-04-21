package study.practice;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// 입력값이 10이면 종료 아니면 값 출력
		
		Scanner scanner = new Scanner(System.in);
		
		int data = 0;
		
		while (data != 10) {
			System.out.print("숫자를 입력해주세요(10을 입력하면 종료됩니다) : ");
			data = scanner.nextInt();
			if(data != 10) {
				System.out.println("입력하신 숫자는 "+data+"입니다.");
			}
		}
			System.out.println("시스템이 종료됩니다.");
			scanner.close();
		
	}

}
