package study.practice.practice44;

public class Dropship extends Unit{// 수송선	
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println("날아서 이동");
	} //지정된 위치로 이동
	
	void load() {
		System.out.println("load..");
	} //선택된 대상을 태운다
	
	void unload() {
		System.out.println("unload..");
	} //선택된 대상을 내린다

}
