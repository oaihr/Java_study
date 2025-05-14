package study.practice.practice49;

public class USD extends Currency{
	public USD(double amount, String notation) {
		super(amount, notation);
	}
	
	public String toString() {
		String str = String.format("USD: %.2f %s", amount, notation);
		return str;
	}
}
