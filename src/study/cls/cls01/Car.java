package study.cls.cls01;

public class Car {
	
	// 필드(속성) 
	String model;
	String color;
	int price;
		
	
	// 생성자 이름은 클래스 이름과 같아야함
	// 기본생성자 - 생성자를 작성하지 않아도 자동 생성 
//	Car(){
//		
//	}
	Car(){
		System.out.println("Car() 생성자 호출됨");		
		color = "회색";
	}
	
	// 매개변수가 존재하는 생성자
	Car(String c){
		System.out.println("Car(String c) 생성자 호출됨");
		color = c;
	}
	
	Car(String c, int p){
		System.out.println("Car(String c, int p) 생성자 호출됨");
		color = c;
		price = p;
	}
	
//	Car(String m, int p){  <-위의 생성자 처럼 매개변수가 String, int 순서라서 같은 생성자로 인식된다
//		System.out.println("Car(String c, int p) 생성자 호출됨");
//		model = m;
//		price = p;
//	}
	
	
	Car(String model,String color, int price){
		System.out.println("Car(String m,String c, int p) 생성자 호출됨");
		this.model = model;
		this.color = color;
		this.price = price;
	}//this 이 클래스의 필드변수 라는 뜻
	
	
	// 매개변수명을 필드변수와 다르게 만들어서 쓸 수 도 있음
	/*
	Car(String _model,String _color, int _price){
		System.out.println("Car(String m,String c, int p) 생성자 호출됨");
		model = _model;
		color = _color;
		price = _price;
	}
	*/
	
	// 메소드
}
