package study.practice.practice49;

public class KRW extends Currency{
	public KRW(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		String str = String.format("KRW: %.2f %s", amount, notation);
		return str;
	}
}
