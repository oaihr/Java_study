package study.cls.cls02;

public class Ipad {	
	String owner; 
	static String brand = "Apple";  
	
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner +"의 아이패드");
		
		//System.out.println(Ipad.brand+"에서 만든 아이패드");	가능
		//check();	가능
	}
	
	static void check() {
		System.out.println(brand+"에서 만든 아이패드");
//		this.owner = "소유자"  static은 객체 없이 호출 -> this로 지칭되는 주체가 없음
//		System.out.println(owner +"의 아이패드"); // static 메서드 check()에는 owner는 인스턴스 멤버라서 사용할 수 없음
//		powerOn(); static 메서드 check()에서 powerOn() 인스턴스 멤버라서 사용할 수 없음
	}
	
}
