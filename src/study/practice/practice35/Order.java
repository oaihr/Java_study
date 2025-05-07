package study.practice.practice35;

import java.util.ArrayList;

public class Order {
	// 필드(인스턴스 필드)
		int orderNum;
//		Menu[] menus;
		ArrayList<Menu> menus;
	// 생성자
		public Order(int i, ArrayList<Menu> arrList) {
			orderNum = i;
			menus = arrList;
		}

	// 메소드(인스턴스 메소드)
		public int totalPrice() {
			/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
			int total = 0;
			for(int i=0; i<menus.size(); i++) {
				total = total + menus.get(i).price;
			}
			return total;
		}
}
