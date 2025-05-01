package study.cls.cls03.pack1;

import java.util.Scanner;

 import study.cls.cls03.pack2.Cup;
// import를 하면 본페이지에서 클래스 사용시
// import한 클래스로 인식

public class CupMain {

	public static void main(String[] args) {
		
		//상단에 import가 없으면, 동일 패키지 클래스로 인식
		//import하면 pack2의 Cup 클래스가 생성됨
		Cup c1 = new Cup();
		c1.method();
		
//		study.cls.cls03.pack2.Cup c2 = new Cup();
		// pack2.Cup c2 = new pack1.Cup();
		
		study.cls.cls03.pack2.Cup c2 = new study.cls.cls03.pack2.Cup();
		c2.method();
		
		Scanner scanner = new Scanner(System.in);
		
		study.cls.cls03.pack1.Cup c3 = new study.cls.cls03.pack1.Cup();
		c3.method();
		
		//c2.a	default라 접근 불가 (패키지다름)
		//c2.b	public이라 접근가능 O
		//c2.c	private라 접근 불가
		
		//c3.a	//default 같은 패키지라 접근가능 O
		//c3.b	//public이라 접근가능 O
		//c3.c private라 접근 불가
	}

}
