package study.cls.cls01;

public class PhoneMain {

	public static void main(String[] args) {
		
//		Phone p1 = new Phone();   사용불가
		Phone p1 = new Phone("갤럭시30");
		
		Phone p2 = new Phone("아이폰22");
		
		Phone p3 = new Phone("아이폰23", 300);
		
		Phone p4 = new Phone("아이폰25", 400, 10000);
	}

}
