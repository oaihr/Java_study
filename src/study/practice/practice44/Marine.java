package study.practice.practice44;

public class Marine extends Unit{// 보병	
	void move(int x, int y) { 
		this.x += x;
		this.y += y;
		System.out.println("걸어서 이동");
	} //지정된 위치로 이동
	
	void stimPack() { 
		System.out.println("Ah! yeah!!");
	} //스팀팩을 사용한다

}
