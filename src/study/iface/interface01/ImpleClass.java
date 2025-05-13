package study.iface.interface01;

// 상속 		자식클래스 extends 부모클래스
// 인터페이스 	구현클래스 implements 인터페이스

public class ImpleClass implements Interface01{	

	@Override
	public void method01() {
		System.out.println("111");		
	}

	@Override
	public void method02() {
		System.out.println("222");
	}
	
	
}
