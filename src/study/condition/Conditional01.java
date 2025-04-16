package study.condition;

public class Conditional01 {

	public static void main(String[] args) {
		
		//조건문 if
		
		int num = 5;
		
		if(num > 10) {
			
			System.out.println("Hello");
			System.out.println("num이 10보다 크다!");
		
		}
		
		if(num <= 20) {
			System.out.println("num이 20보다 작거나 같다!");
			System.out.println("프로젝터너무더워");
			System.out.println("프로젝터때문에건조해");
		}
		
		if(num != 5)  // 중괄호가 없으면 조건문 다음 1줄만 if문 범위에 종속됨
			System.out.println("살펴보니");		
		System.out.println("5가 아니야");	// if문 범위에 들어가지 않음
		
		boolean b1 = (num == 5);
		
		//삼항연산자 (조건식) ? 참 : 거짓
		//if(b1) {      // 조건문 if(조건식)
		if(b1 == false ) {	
			System.out.println("num이 5다!");
		}
		
		//변수의 범위 (지역 변수)
		if(b1) {
			System.out.println("b1 조건문 내부 "+ num);
			
			int x = 100;
			System.out.println("x = "+x);
		}
		
		if(b1) {
			int x = 300;
		}
		
		int x = 200;
		System.out.println("x 값 확인 : "+x);
		
		
		System.out.println("프로그램 끝!");
		
	}
}
