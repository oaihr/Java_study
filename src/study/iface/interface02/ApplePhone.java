package study.iface.interface02;

public class ApplePhone implements Callable{
	
	//필드변수
	int callStatus; // 전화 상태
	
	@Override
	public void call() {
		System.out.println("애플폰 전화");
		callStatus = Callable.CALL_ON;
	};
}
