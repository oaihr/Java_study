package study.practice;

import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {		
		prac2();
	}
	
	public static void prac1() {
		int qtyTotal1 = 0;
		int qtyTotal2 = 0;
		int qtyTotal3 = 0;
		
		while(true) {
		System.out.println("======== 메뉴 ========");
		System.out.println("1.아메리카노     3500원");
		System.out.println("2.카페라떼      4100원");
		System.out.println("3.바닐라라떼     4300원");
		System.out.println("====================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int menu = scanner.nextInt();
		
			if(menu>=1 && menu<=3 ) {			
			
				System.out.print("수량 선택 : ");
				int qty = scanner.nextInt();				
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				String ans = scanner.next();				
				if(ans.equals("y")) {			
					if(menu == 1) {
						qtyTotal1 = qtyTotal1 + qty;
					}else if(menu == 2) {
						qtyTotal2 = qtyTotal2 + qty;
					}else if(menu == 3) {
						qtyTotal3 = qtyTotal3 + qty;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}	
				}else if(ans.equals("n")) {			
								
					if(menu == 1) {
						qtyTotal1 = qtyTotal1 + qty;				
					}else if(menu == 2) {
						qtyTotal2 = qtyTotal2 + qty;				
					}else if(menu == 3) {
						qtyTotal3 = qtyTotal3 + qty;				
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}			
				
					break;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");			
				}							
				
									
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		int total = (qtyTotal1 * 3500) + (qtyTotal2 * 4100) + (qtyTotal3 * 4300);
		
		System.out.println("====================");
		if (qtyTotal1 > 0) {
			System.out.println("아메리카노 " + qtyTotal1 + "잔 : " + (qtyTotal1 * 3500) + "원");
		}
		if (qtyTotal2 > 0) {
			System.out.println("카페라떼 " + qtyTotal2 + "잔 : " + (qtyTotal2 * 4100) + "원");
		}
		if (qtyTotal3 > 0) {
			System.out.println("바닐라라떼 " + qtyTotal3 + "잔 : " + (qtyTotal3 * 4300) + "원");
		}
		System.out.println("====================");
		System.out.println("총액 : " + total + "원");
	}
	
	public static void prac2() {
	
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = {3500, 4100, 4300};		
		int[] countArr = new int[3];  //0 초기화 
		
		System.out.println("======== 메뉴 ========");
		for(int i=0; i<=menuArr.length; i++ ){
			System.out.printf("&d. %-6S      %d원", (i+1), menuArr[i], priceArr[i] );
		}
		System.out.println("====================");
	}

}
