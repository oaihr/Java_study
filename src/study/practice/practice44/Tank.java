package study.practice.practice44;

public class Tank extends Unit{ // 탱크	
	void move(int x, int y) { 
		this.x += x;
		this.y += y;
		System.out.println("탱크 이동");
	} //지정된 위치로 이동	
	
	void changeMode() {
		System.out.println("changing the mode");
	} //공격모드를 변환한다

}
