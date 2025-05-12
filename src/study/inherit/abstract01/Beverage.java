package study.inherit.abstract01;

 public abstract class Beverage {	// 음료
	String name;
	int ml;
	
	public void intro() {
		System.out.println("음료입니다.");
	}
	
	// 추상메소드 선언부분만		안전검사
	public abstract void checkSafety();
	
	// 뚜껑 열기 
	public abstract void open();
}
