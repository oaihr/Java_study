package study.iface.interface01;

import java.util.ArrayList;
import java.util.List;

public class interfaceMain {
	
	public static void main(String[] args) {
		System.out.println(Interface01.CODE);	// 인터페이스의 상수 불러옴
		
		int topp = Interface01.FISHBREAD_TOPPING_PIZZA;
		//Interface01.FISHBREAD_TOPPING_PIZZA
		//FishBreadCode.FISHBREAD_TOPPING_PIZZA
		//CommonCode.FISHBREAD_TOPPING_PIZZA
		//인터페이스 이름을 구분에 따라 지으면 좋음
		
		ImpleClass c = new ImpleClass();
		c.method01();
		c.method02();
		
		//Interface01 il = new Interface01(); 인터페이스 생성 불가 (추상 클래스와 유사)
		
		Interface01 il = new ImpleClass();
		il.method01();
		il.method02();
		
		Interface01 i11 = new ImpleClass02();
		i11.method01();
		i11.method02();
		Interface02 i22 = new ImpleClass02();
		i22.method03();
		
		Interface01[] arr = {new ImpleClass(), new ImpleClass02()};		
		// 인터클래스 변수 Interface01의 리스트에 Interface01의 구현 객체를 넣을 수 있음
		List<Interface01> list = new ArrayList<Interface01>();
		list.add(new ImpleClass());
		list.add(new ImpleClass02());
		
		test1(c);
		test1(i11);
		test1(arr[0]);
		test1(list.get(1));
		
		Interface01 if1 = test2(); //return Interface01
		
		//Interface01 i11 = new ImpleClass02();
		//ImpleClass02 i11 = new ImpleClass02();
		
		ImpleClass02 ic02 = (ImpleClass02)i11;
		if(c instanceof ImpleClass) {
			ImpleClass ic = (ImpleClass)c;
		}
	}
			
	
							// Interface01 inter = new ImpleClass()
							// Interface01 inter = new ImpleClass02()
	public static void test1(Interface01 inter) {
		
	}
	
	public static Interface01 test2() {
		
		return new ImpleClass();	// ImpleClass는 Interface01의 구현객체임
	}
}
