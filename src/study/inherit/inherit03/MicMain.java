package study.inherit.inherit03;

public class MicMain {

	public static void main(String[] args) {
		
		Mic m1 = new Mic();
		m1.volumeUp();
		
		WirelessMic wm1 = new WirelessMic();
		wm1.volumeUp();
		
		BluetoothMic bm1 = new BluetoothMic();
		bm1.volumeUp();
		bm1.volumeUp(10);		
		
		//BluetoothMic bm1 = new WirelessMic();
		//BluetoothMic bm1 = new Mic();
		
		// 자식객체 자동 타입 변환
		Mic m2 = new WirelessMic();	
		Mic m3 = new BluetoothMic();
//Mic로 타입 변환돼서 Mic의 필드, 메서드만 사용 가능하지만 오버라이딩 메서드만 예외
		
		m2.volumeUp();
		m3.volumeUp();	// 재정의된 volumeUp 실행
		m3.check();	// 재정의된 check 실행
		
		bm1.check();		
		
		//toString 사용
		BluetoothMic bm2 = new BluetoothMic();
		bm2.isConnect = true;
		bm2.model = "Bayer";
		bm2.price = 100000;
		bm2.type = "스튜디오 마이크";
		
		String str2 = bm2.toString();
		//System.out.println(str2);
		
		//Mic m3 = new BluetoothMic();
		m3.check();
		System.out.println(m3.toString());
		
		//Mic m2 = new WirelessMic();	
		System.out.println(m2.toString()); //사용가능
		
		//Mic m1 = new Mic();
		m1.model = "일반 마이크";
		System.out.println(m1.model);
		System.out.println(m1);
		// 객체 자체를 출력 -> toString()결과를 출력
		
		//Object 클래스 변수에는 모든 객체를 담을 수 있음
		Object o1 = m1;
		o1 = m2;
		o1 = m3; 
		o1 = bm2;
		o1 = bm1;
	}

}
