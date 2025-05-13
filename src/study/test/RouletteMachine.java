package study.test;

import java.util.Scanner;

public class RouletteMachine {
	
	String machineId; //기기아이디
	String storeName; //지점명
	int totalPoint; //총합 포인트
	int countOfSuccesses; //성공 횟수
	int countOfFailures; //실패 횟수
	int remainingCount; //잔여 횟수
	int revenues; //매출액
	boolean isRunning; //기계 작동중 여부
	
	public RouletteMachine (String machineId, String storeName){	// 생성자
		this.machineId = machineId;
		this.storeName = storeName;
		totalPoint = 0;
		countOfSuccesses = 0;
		countOfFailures = 0;
		remainingCount = 0;
		revenues = 0;
		isRunning = false;
	}
	
	public void powerOn() {	// 기기 시작 메소드
		isRunning = true;		
		System.out.println("=================[룰렛 시작]=================");		
		
		while (isRunning) {
			int menu = getMenuNum(); // 선택한 메뉴 반환 메소드
			switch (menu) {
			case 1:
				charge();
				break;
			case 2:
				startGame();
				break;
			case 3:
				powerOff();
				break;
			}
		}
		
	}
	
	public int getMenuNum() {	// 선택한 메뉴 반환 메소드
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while(true) {
			System.out.println("[Menu]");
			System.out.println("1.충전 2.게임시작 3.마감");
			System.out.print(">>원하는 메뉴를 선택하세요: ");
			menu = scanner.nextInt();
			if(menu<1 || menu>3) {
				System.out.println("정상 범위(1~3)에서 입력해주세요");
			}else {break;}
		}
		return menu;
	}
	
	public void charge() {	// 충전 메소드
		Scanner scanner = new Scanner(System.in);
		int insertMoney;
		if(remainingCount > 0) {
			System.out.printf("잔여 횟수 %d회가 남아있습니다\n", remainingCount);
			return;
		}
	
		while(true) {
		System.out.print("얼마를 충전하시겠습니까?: ");
		insertMoney = scanner.nextInt();				
			if(insertMoney % 1000 != 0 || insertMoney<=0) {
				System.out.println(" '1000원' 단위로만 입력해주세요 ");
			}else {
				break;
			}
		}
		revenues += insertMoney;	// 충전액만큼 매출액 증가
		remainingCount += insertMoney/500;	// 충전액만큼 잔여 횟수 증가
		System.out.printf("%d원 충전하셨습니다. 잔여 횟수:%d\n", insertMoney, remainingCount);
		return;
	}
	
	public void startGame() {	// 게임 플레이 메소드 
		if(remainingCount == 0) {
			System.out.println("잔여 횟수가 없습니다. 충전해주세요");
			System.out.println();
			return;
		}
		while(remainingCount >= 0) { 
			if(remainingCount == 0) {	// 잔여 횟수가 0이 됐을 때
				// 성공 실패횟수 총합점수 보여주기
				System.out.println();
				System.out.println("[최종결과]");
				System.out.printf("성공 횟수: %d\n실패 횟수: %d\n총합점수: %d\n", countOfSuccesses, countOfFailures, totalPoint);
				System.out.println();
				// 데이터 초기화
				totalPoint = 0;
				countOfSuccesses = 0;
				countOfFailures = 0;
				remainingCount = 0;
				break;
			}
			System.out.println("운명의 수레바퀴가 돌고 있습니다 결과는~");
			int result = (int)(Math.random()*6+1);
			if(result>=5) {
				System.out.println("아~ 실패입니다. 다시 한 번 도전해보세요");
				System.out.println();
				countOfFailures++;	// 실패횟수++
			}else{
				System.out.printf("성공!!! %d점 입니다! 운이 좋으시군요!!!!\n", result);
				System.out.println();
				countOfSuccesses++;	// 성공횟수++
				totalPoint += result;	// 결과 값을 총합포인트에 더하기
			}
			remainingCount--;	// 반복하면서 잔여횟수-- 
		}
	}
	
	public void powerOff() {
		if(remainingCount > 0) {
			System.out.println("잔여 횟수가 남았습니다. 마감 불가능");
			return;
		}				
		System.out.println("=================[룰렛 종료]=================");
		System.out.println();
		System.out.printf("[총매출액: %d원]", revenues);
		isRunning = false;
	}
	
	
	
	
	
}
