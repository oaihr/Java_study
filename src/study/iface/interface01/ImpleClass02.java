package study.iface.interface01;

public class ImpleClass02 implements Interface01, Interface02{

	@Override
	public void method03() {
		System.out.println("Imple02 method3");
	}

	@Override
	public void method01() {
		System.out.println("Imple02 method2");
	}

	@Override
	public void method02() {
		System.out.println("Imple02 method1");
		
	}
	
	
}
