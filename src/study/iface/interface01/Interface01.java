package study.iface.interface01;

public interface Interface01 {
	
	// 필드 x -> 변수 선언 (상수)
	/* static final */ int TYPE = 1;
	/* static final */ int CODE = 05;
	
	// 붕어빵 속재료 종류
	int FISHBREAD_TOPPING_PPAT = 11;
	int FISHBREAD_TOPPING_CREAM = 12;
	int FISHBREAD_TOPPING_PIZZA = 13;
	int FISHBREAD_TOPPING_KIMCHI = 14;	
	
	// 생성자 -> X
	
	// 메소드 -> 추상 메서드 (선언부만)
	
	public/* abstract */void method01();	// 추상메소드
	public/* abstract */void method02();	// 추상메소드
}
