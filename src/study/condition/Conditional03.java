package study.condition;

public class Conditional03 {

	public static void main(String[] args) {

		// 조건문 switch

		int dice = 4;

		if (dice >= 1 && dice <= 3) {

		}

		dice = 1;

		switch (dice) {
		case 1: // dice == 1 case는 동일한 값인지 비교하는것임
			System.out.println("dice 값이!!");
			System.out.println("1이다");
			break;
		case 2: // dice == 2
			System.out.println("2이다");
			break;
		case 99: // dice == 99
			System.out.println("99이다");
			break;
		default: // else
			System.out.println("default다");

		}
		
		dice = 99;
		switch (dice) {
		case 1 -> System.out.println("1이다");			
		case 2 -> System.out.println("2이다");			
		case 99 -> System.out.println("99이다");			
		default -> System.out.println("default다");
		}


		// switch 실수형(double) 안됨!

		char c = 'c';

		switch (c) {
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		default:
		}
		
		String day = "FRI";
		
		switch(day) {
		
		case "MON":
		case "TUE":
			//....
		case "FRI":
			System.out.println("금요일입니다.");
			break;
		default:
		}

		
		
	}

}
