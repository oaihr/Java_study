package study.cls.cls02;

import java.util.Scanner;

public class IpadMain {

	public static void main(String[] args) {		
		Ipad pad1 = new Ipad();
		pad1.owner = "sos";		
		pad1.powerOn();
		
		Ipad pad2 = new Ipad();
		pad2.owner = "sza";
		pad2.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		
		String ss = "123";
		int ii = Integer.parseInt(ss); // Integer.parseInt()가 Integer라는 클래스의 static 메서드
		
		int num = (int)(Math.random()*6)+1; //1~6  Math.random()가 Math라는 클래스의 static 메서드
		
		System.out.println(Math.PI);
		
		Ipad.check();
		
//		pad2.check(); -> Ipad.check();   pad2.check();도 가능하지만 check()가 static이니 Ipad.check();로 쓰자
		
		System.out.println(Ipad.brand);
//		System.out.println(pad1.brand);  가능하지만 static을 부를 때는 클래스 이름으로 부르자 Ipad.brand
	}

}
