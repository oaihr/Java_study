package study.practice.practice33;

public class AccountTest {

	public static void main(String[] args) {
		Account acc2 = new Account("사람2", 1000000);
		
		//인출 상한 걸림
		acc2.withdraw(1000001);

	}

}
