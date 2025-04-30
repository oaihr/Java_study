package study.practice.practice29;

public class MonitorMain {

	public static void main(String[] args) {
		
		Monitor m1 = new Monitor("삼성", 27, 150000, "검정색");
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		m1.setXY(1080, 780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.showInfo();
		m2.showInfo();
		
		m2.price = m2.priceUp(70000);
		
		m1.showInfo();
		m2.showInfo();
	}

}
