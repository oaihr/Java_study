package study.inherit.abstract01;

public class Coke extends Beverage{
//	String name;
//	int ml;
	
	@Override
	public void checkSafety() {
		System.out.println("탄산 체크");
	}

	@Override
	public void open() {
		
		System.out.println("뚜껑 칙~");
	}
	
}
