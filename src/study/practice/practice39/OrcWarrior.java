package study.practice.practice39;

public class OrcWarrior extends Orc{
	protected int armor;

	public OrcWarrior(String name, int hp, int armor) {
		super(name, hp);
		this.armor = armor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		String str = String.format("OrcWarrior { name: %s, hp: %d, armor: %d }", name, hp, armor);
		return str;
	}
}
