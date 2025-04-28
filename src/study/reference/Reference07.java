package study.reference;

import java.util.Scanner;

public class Reference07 {

	public static void main(String[] args) {
		// 열거 타입 Enum
		
		String day1 = "MONDAY";
		String day2 = "FRIDAY";
				
		String today = "FRIDAY";	// 사용자가 입력한 값
						//Friday
						//FRODAY
		
		
		if(today.equals(day1)) {
			System.out.println("출근");
		}
		if(today.equals(day2)) {
			System.out.println("퇴근");
		}
		
		// boolean  true/false  "medium"X
		
		// 붕어빵 토핑 : ppat, cream, pizza
		String topping = "pizza";
		
		
		
		Week day3 = Week.MON;	// Enum 이용
		Week day4 = Week.FRI;
		
		if(day4 == Week.FRI) {
			System.out.println("금요일!!!");
		}
		
		Topping tp1 = Topping.CREAM;
		
	}

}
