package study.cls.cls01;

public class Phone {

	//필드
	String model; // 모델명		필수!
	int price;	  // 금액			선택 -> 기본값 100
	int battery;  //배터리 용량		선택 -> 기본값 3000
	
	//생성자
	
	//기본생성자 : 선언된 생성자가 없을 때 자동으로 만들어짐 
//	phone(){
//		
//	}
	
	//생성자 선언
	//생성자 오버로딩
	Phone(String model){
		this(model, 100, 3000); // 내 클래스 내에 있는 다른 생성자 호출 this();
//		this.model = model;
//		this.price = 100;
//		this.battery = 3000;
	}
	
	Phone(String model, int price){
		this(model, price, 3000); // 내 클래스 내에 있는 다른 생성자 호출 this();
//		this.model = model;
//		this.price = price;
//		this.battery = 3000;
	}
	
	Phone(String model, int price, int battery){   //공통 코드를 한 생성자에 집중 
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	
	//메소드
}
