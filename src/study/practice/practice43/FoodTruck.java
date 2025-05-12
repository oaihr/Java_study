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
	
	// 일자별 매출이력 관리용 리스트	(나중엔 DB로 관리)
	List<SalesInfo> saleInfoList;
	
	FoodTruck(String truckName){
		this.truckName = truckName;
		revenues = 0;
		loss = 0;
		saleInfoList = new ArrayList<SalesInfo>();
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
			int menu = getMainMenu();
			switch(menu) {
				case 1:		//메뉴보기
					showMenuList();
					break;
				case 2:		//주문하기
					orderMenu();
					break;
				case 3:		//재고관리
					manageStock();
					break;
				case 4:		//마감하기
					storeClosing();
					break;				
			}
		}	
		
	}
	// 메인메뉴 번호 선택 처리 메소드
	public int getMainMenu() {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while(true) {
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>입력: ");
			menu = scanner.nextInt();
			if(menu<1 && menu>4) {
				System.out.println("잘못된 입력입니다.");
				System.out.println("메뉴(1~4) 중에 선택하세요.");
			}else {break;}
		}
		return menu;
	}
	
	// 메뉴 보여주기 메소드
	public void showMenuList() {
		System.out.println("==================Menu==================");
		for(int i=0; i<menuList.size(); i++) {	// 메뉴 출력
			System.out.println((i+1)+menuList.get(i).getMenuInfo());
		}
		System.out.println("========================================");
	}
	
	// 주문하기 기능 메소드
	public void orderMenu() {
		showMenuList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("주문할 메뉴 번호: ");
		int menuNum = scanner.nextInt();
		System.out.print("수량 선택: ");
		int qty = scanner.nextInt();
		
		Menu orderedMenu = menuList.get(menuNum-1);
		if(orderedMenu.getStockQty() < qty) {	// 재고가 부족할시
			System.out.println();
			System.out.printf("%s의 재고가 부족합니다.(재고:%d)\n", orderedMenu.getName(), orderedMenu.getStockQty());
			return;
		}
		revenues += orderedMenu.getPrice()*qty;	// 매출액에 더하기
		orderedMenu.setStockQty( orderedMenu.getStockQty() - qty ); 	// 재고 관리
		System.out.printf("%s(을)를 %d개 주문하셨습니다.\n", orderedMenu.getName(), qty);	// 주문 확인 메세지
	}
	
	// 재고 괸리 메소드
	public void manageStock() {
		showMenuList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("재고 관리할 메뉴 번호: ");
		menuNum = scanner.nextInt();
		System.out.print("재고 조정할 수량 입력: ");
		int changeStockQty = scanner.nextInt();
		
		Menu manageMenu = menuList.get(menuNum-1);
		if(manageMenu.getStockQty() + changeStockQty < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		manageMenu.setStockQty( manageMenu.getStockQty() + changeStockQty );
		System.out.println(">>> 재고 조정 완료");
		System.out.println(manageMenu.getMenuInfo());
		System.out.println("========================================");
	}
	
	// 마감 메소드
	public void storeClosing() {
		for(Menu m : menuList) {
			if(m.getStockQty() > 0) {
				loss += m.getStockQty()*(m.getPrice()*0.3);	// 손실액 총합 구하기				
			}
		}
		
		System.out.println("==============[마감 정산 내역]==============");
		System.out.printf("매출:%.2f원\n손실:%.2f원\n최종수익:%.2f원\n", revenues, loss, revenues-loss);
		System.out.println("========================================");
		
		SalesInfo si = new SalesInfo();	// 일자별 매출이력 등록
//		si.salesDate = 당일날짜;
		si.revenues = revenues;
		si.loss = loss;
		si.income = revenues-loss;
		
		isOpened = false;
		System.out.println();
		System.out.printf("----------[%s 푸드트럭 영업종료]----------\n", truckName);		
	}
}
