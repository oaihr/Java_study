package study.inherit.abstract01;

public class AbstractMain {
	
	public static void main(String[] args) {
		Coke c1 = new Coke();
		GreenTea g1 = new GreenTea();
		
		c1.name = "코카콜라";
		c1.ml = 355;
		
		g1.name = "오설록";
		g1.ml = 500;
		
		c1.intro();
		g1.intro();
		
		// Beverage b1 = new Beverage();
		// 추상클래스는 실체화 불가능
		// 인스턴스 객체 생성이 불가능
		
		// 부모타입변수 = 자식객체, 자식객체
		Beverage[] arr = {c1, g1};
		
		arr[0].checkSafety();
		arr[0].open();
		
		arr[1].checkSafety();
		arr[1].open();
	}
}
