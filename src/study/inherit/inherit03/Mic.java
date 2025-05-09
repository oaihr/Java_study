package study.inherit.inherit03;

// 모둔 자바 클래(객체)는 Object 클래스를 상속 받는다
public class Mic{
			//	extends Object
	
	String model;
	int price;
	String type; // 마이크 유형
	
	public void volumeUp() {
		System.out.println("Mic volumeUp");
	}
	
	public void check() {
	}
}
