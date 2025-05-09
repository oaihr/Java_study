package study.practice.practice38;

public class Wizard extends Novice {
	int mp;
	
	public void fireball() {
		if(mp<30) {
			System.out.println("mp가 부족합니다.");
			return;
		}
		System.out.printf("[%s]의 파이어볼@\n", name);
		mp -= 30;		
	}
}
