package study.practice.practice47;

import java.util.ArrayList;
import java.util.List;

public class InterfaceType {

	public static void main(String[] args) {
		// 객체 생성
		Food f = new Food("족발", 19800);
		Electronics e = new Electronics("에어팟", 199000);
		Clothing c = new Clothing("셔츠", 49900);
		// 총합 계산
		List<Orderable> oList = new ArrayList<Orderable>();
		oList.add(f);
		oList.add(e);
		oList.add(c);
		
		int total = 0;
		for(Orderable o : oList) {
			total += o.discountedPrice();
		}
		// 결과 출력
		System.out.printf("총합: %d원", total);
	}

}
