package study.iface.interface02;

public class Person {
	
	//SamsungPhone s;
	//ApplePhone a;
	
	//부모클래스
	//Phone p;
	
	Callable c;
	
	// 사람이 전화를 거는 기능 (다른 클래스들의 call()과 다름)
	public void call(String phoneNumber) {
		c.call();	// 전화기를 사용해서 전화걸기
	}
}
