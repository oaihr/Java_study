package study.practice.practice43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	String truckName;
	double revenues; // 매출
	double loss; // 손실
	boolean isOpened; // 영업 중 여부
	int menuNum; // 메뉴번호
	int qty; // 수량
	
	List<Menu> menuList = new ArrayList<Menu>(); // 메뉴 리스트
	
	FoodTruck(String truckName){
		this.truckName = truckName;
		revenues = 0;
		loss = 0;
	}
	
	void addMenu(String name, int price, int qty) {	// 메뉴 추가
		Menu newMenu = new Menu(name, price);
		newMenu.setStockQty(qty);
		menuList.add(newMenu);		
	}
	
	void storeOpening() {	// 영업 시작
		isOpened = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("----------[%s 푸드트럭 영업시작]----------\n", truckName);
		
		while(isOpened) {			
			// 시스템 메뉴 
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>입력: ");
			int menu = scanner.nextInt();
			
			switch(menu) {
				case 1:		//메뉴보기
					System.out.println("==================Menu==================");
//					int num = 1;
//					for(Menu m : menuList) {
//						System.out.println(num+m.getMenuInfo());
//						num++;
//					}
					for(int i=0; i<menuList.size(); i++) {	// 메뉴 출력
						System.out.println((i+1)+menuList.get(i).getMenuInfo());
					}
					System.out.println("========================================");
					break;
				case 2:		//주문하기
					System.out.println("==================Menu==================");
					for(int i=0; i<menuList.size(); i++) {	// 메뉴 출력
//						if(menuList.get(i).getStockQty() > 0)
						System.out.println((i+1)+menuList.get(i).getMenuInfo());
					}
					System.out.println("========================================");
					
					System.out.print("주문할 메뉴 번호: ");
					menuNum = scanner.nextInt();
					System.out.print("수량 선택: ");
					qty = scanner.nextInt();
					
					Menu orderedMenu = menuList.get(menuNum-1);
					if(orderedMenu.getStockQty() < qty) {	// 재고가 부족할시
						System.out.println();
						System.out.printf("%s의 재고가 부족합니다.(재고:%d)\n", orderedMenu.getName(), orderedMenu.getStockQty());
						break;
					}
					revenues += orderedMenu.getPrice()*qty;	// 매출액에 더하기
					orderedMenu.setStockQty( orderedMenu.getStockQty() - qty ); 	// 재고 관리
					System.out.printf("%s(을)를 %d개 주문하셨습니다.\n", orderedMenu.getName(), qty);	// 주문 확인 메세지
					break;
				case 3:		//재고관리
					System.out.println("==================Menu==================");
					for(int i=0; i<menuList.size(); i++) {	// 메뉴 출력
						System.out.println((i+1)+menuList.get(i).getMenuInfo());
					}
					System.out.println("========================================");
					
					System.out.print("재고 관리할 메뉴 번호: ");
					menuNum = scanner.nextInt();
					System.out.print("재고 조정할 수량 입력: ");
					int changeStockQty = scanner.nextInt();
					
					Menu manageMenu = menuList.get(menuNum-1);
					if(manageMenu.getStockQty() + changeStockQty < 1) {
						System.out.println("잘못된 입력입니다.");
						break;
					}
					manageMenu.setStockQty( manageMenu.getStockQty() + changeStockQty );
					System.out.println(">>> 재고 조정 완료");
					System.out.println(manageMenu.getMenuInfo());
					System.out.println("========================================");
					break;
				case 4:		//마감하기
					for(Menu m : menuList) {
						if(m.getStockQty() > 0) {
							loss += m.getStockQty()*(m.getPrice()*0.3);	// 손실액 총합 구하기				
						}
					}
					
					System.out.println("==============[마감 정산 내역]==============");
					System.out.printf("매출:%.2f원\n손실:%.2f원\n최종수익:%.2f원\n", revenues, loss, revenues-loss);
					System.out.println("========================================");
					isOpened = false;
					System.out.printf("----------[%s 푸드트럭 영업종료]----------\n", truckName);
					break;
				default:
					System.out.println("잘못된 입력입니다.\n");
					break;
			}
		}
	}
	
//	void showMenuInfo() {	// 메뉴 보여주기
//		System.out.println("==================Menu==================");
//		int num = 1;
//		for(Menu m : menuList) {
//			System.out.println(num+m.getMenuInfo());
//			num++;
//		}
//		System.out.println("========================================");
//	}
	
	
//	void menuOrder(int menuNum, int orderQty) {	// 메뉴 주문
//		Menu orderedMenu = menuList.get(menuNum-1);
//		if(orderedMenu.getStockQty() < orderQty) {	// 재고가 부족할시
//			System.out.println();
//			System.out.printf("%s의 재고가 부족합니다. 재고:%d\n", orderedMenu.getName(), orderedMenu.getStockQty());
//			return;
//		}
//		revenues += orderedMenu.getPrice()*orderQty;	// 매출액에 더하기
//		orderedMenu.setStockQty( orderedMenu.getStockQty() - orderQty ); 	// 재고 관리
//		System.out.printf("%s(을)를 %d개 주문하셨습니다.\n", orderedMenu.getName(), orderQty);	// 주문 확인 메세지
//	}
	
	
//	void storeClosing() {	// 마감
//		isOpened = false;
//		for(Menu m : menuList) {
//			if(m.getStockQty() > 0) {
//				loss += m.getStockQty()*(m.getPrice()*0.3);	// 손실액 총합 구하기				
//			}
//		}
//		
//		System.out.println("========================================");
//		System.out.printf("매출:%.2f원\n손실:%.2f원\n최종수익:%.2f원\n", revenues, loss, revenues-loss);
//		System.out.println("========================================");
//	}
	
	
	
	
}
