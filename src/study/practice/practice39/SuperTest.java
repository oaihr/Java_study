package study.practice.practice39;

public class SuperTest {

	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크", 80);
		System.out.println(orc.toString());
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior war = new OrcWarrior("오크전사", 120, 3);
		System.out.println(war.toString());
	}

}
