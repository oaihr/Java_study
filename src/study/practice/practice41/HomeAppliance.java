package study.practice.practice41;

public class HomeAppliance {
	String brand; // 브랜드
	boolean power; // 전원 킴 끔
	
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다");
	}
	
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다");
	}
}
