package study.inherit.abstract01;

public class GreenTea extends Beverage{
//	String name;
//	int ml;
	
	@Override
	public void checkSafety() {
		System.out.println("찻잎 상태 체크");
	}

	@Override
	public void open() {
		System.out.println("주전자 뚜껑 열기");
	}
}
