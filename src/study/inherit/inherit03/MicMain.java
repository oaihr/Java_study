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
		
		
	}

}
