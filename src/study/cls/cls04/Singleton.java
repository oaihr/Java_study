package study.cls.cls04;

public class Singleton {
	// 싱글톤:  전체에서 1개만 존재
	
	private static Singleton singleton = new Singleton();
	
	//외부에서 생성 방지
	private Singleton() {
		
	}
	
	//리턴타입    
	public static Singleton getInstance(){		
		return singleton;
	}
}
