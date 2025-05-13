package study.practice.practice44;

public abstract class Unit {
	int x, y; // 현재 위치
	
	abstract void move(int x, int y);
	void stop() { //현재 위치에 정지
		System.out.println("Stop at the current location");
	}
}
