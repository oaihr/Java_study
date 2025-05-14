package study.practice.practice49;

public class EUR extends Currency{
	public EUR(double amount, String notation) {
		super(amount, notation);
	}
	
	public String toString() {
		String str = String.format("EUR: %.2f %s", amount, notation);
		return str;
	}
}
