package study.practice.practice49;

public class JPY extends Currency{
	public JPY(double amount, String notation) {
		super(amount, notation);
	}
	
	public String toString() {
		String str = String.format("JPY: %.2f %s", amount, notation);
		return str;
	}
}
