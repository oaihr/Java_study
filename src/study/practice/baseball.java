package study.practice;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		basic();
//		level1();
//		level2();
//		level3();
	}
	
	public static void basic() {
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		
		Scanner scanner = new Scanner(System.in);
		int outCount = 0;
		System.out.println("========게임 시작========");
		while(true) {
			
			System.out.print("입력: ");
			int bat = scanner.nextInt();
			
			if(bat<1 || bat>10) {
				System.out.println("===1~10 범위에서 입력해주세요.===");
				System.out.println();
				continue;
			}
			
			int pitcher = (int)(Math.random()*10)+1;
			System.out.println("투수 :"+pitcher);		
			if(bat == pitcher) {
				System.out.println("안타!");
				System.out.println();
			}else {
				System.out.println("아웃!");
				System.out.println();
				outCount++;
			}
			
			if(outCount == 3) {
				System.out.println("========게임 종료========");
				break;
			}
			
		}
	}
	public static void level1() {
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		// 레벨 1 
		// 1회부터 3회까지만 진행
		// 각회는 3아웃마다 회가 넘어가며 회가 시작할때마다 0아웃으로 시작
		
		Scanner scanner = new Scanner(System.in);
		int outCount = 0;
		int times = 1;
		
		System.out.println("========게임 시작========");		
		while(true) {
			System.out.print("입력: ");
			int bat = scanner.nextInt();
			
			if(bat<1 || bat>10) {
				System.out.println("===1~10 범위에서 입력해주세요.===");
				System.out.println();
				continue;
			}
			
			int pitcher = (int)(Math.random()*10)+1;
			System.out.println("투수 :"+pitcher);		
			if(bat == pitcher) {
				System.out.println("!!안타!!");
				System.out.println();
			}else {
				System.out.println("!!"+(outCount+1)+"아웃!!");
				System.out.println();
				outCount++;
			}
			
			if(outCount == 3) {
				System.out.println("==="+times+"회 종료===");				
				outCount = 0;
				times++;
			}
			
			if(times > 3) {
				System.out.println("========게임 종료========");
				break;
			}
		}
	}
	public static void level2() {
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		// 레벨 1 
		// 1회부터 3회까지만 진행
		// 각회는 3아웃마다 회가 넘어가며 회가 시작할때마다 0아웃으로 시작
		
		// 레벨 2
		// 9명의 타자를 등록
		// 각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
		// 9번 타자 다음 순서는 1번타자로 9명이 로테이션 된다.
		
		// 1회차가 끝나는 기준은 3아웃
		// 타자는 1아웃이면 다음 선수로 넘어감
		// 타자가 안타를 쳐도 출루했다고 가정하고 다음선수로 넘어감
		
		Scanner scanner = new Scanner(System.in);
		int outCount = 0;
		int times = 1;
		int i = 0;
		
		String[] hitter = {"타자1", "타자2", "타자3", "타자4", "타자5", "타자6", "타자7", "타자8", "타자9"};
		
		System.out.println("========게임 시작========");		
		
		while(true) {
			
			System.out.println((i+1)+"번 "+hitter[i]+ " 타석에 들어섭니다");
			System.out.print("입력: ");
			int bat = scanner.nextInt();
			
			if(bat<1 || bat>10) {
				System.out.println("===1~10 범위에서 입력해주세요.===");
				System.out.println();
				continue;
			}
			
			int pitcher = (int)(Math.random()*10)+1;
			System.out.println("투수 :"+pitcher);		
			if(bat == pitcher) {
				System.out.println("!!안타!!");
				System.out.println();				
			}else {
				System.out.println("!!"+(outCount+1)+"아웃!!");
				System.out.println();				
				outCount++;
			}
			
			i++;
			
			if(outCount == 3) {
				System.out.println("==="+times+"회 종료===");				
				outCount = 0;
				times++;
			}
			if(i>=9)
				i = 0;
			
			if(times > 3) {
				System.out.println("========게임 종료========");
				break;
			}			
		}
	}	
	public static void level3() {
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		// 레벨 1 
		//1회부터 3회까지만 진행
		//각회는 3아웃마다 회가 넘어가며 회가 시작할때마다 0아웃으로 시작
		
		// 레벨 2
		// 9명의 타자를 등록
		// 각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
		// 9번 타자 다음 순서는 1번타자로 9명이 로테이션 된다.
		
		// 1회차가 끝나는 기준은 3아웃
		// 타자는 1아웃이면 다음 선수로 넘어감
		// 타자가 안타를 쳐도 출루했따고 가정하고 다음선수로 넘어감
		
		// 레벨 3
		// 각 타자의 전체 타석 및 안타수를 기록
		// 타석에 등장시, 타순 및 타자명 분만 아니라 타율도 출력됨 (타율 = 안타수/타석수)
		// 첫 타석의 타율은 0
		// 한번 휘두를때 기준으로 타석 수가 증가함
		// 현재는 안타 아웃 뿐이지만 이후 스트라이크 볼 등에 대해서 타석수는 증가함
		
		Scanner scanner = new Scanner(System.in);
		int outCount = 0;
		int times = 1;
		int i = 0;
		
		String[] hitter = {"타자1", "타자2", "타자3", "타자4", "타자5", "타자6", "타자7", "타자8", "타자9"};
		int[] hit = new int[9];
		int[] plate = new int[9];
		
		System.out.println("========게임 시작========");		
		
		while(true) {
			
			System.out.println((i+1)+"번 "+hitter[i]+" 타석에 들어섭니다.");
			plate[i] = plate[i] + 1;
			
			System.out.println("이 타자의 타율은 "+(double)hit[i]/plate[i]+"입니다.");
			System.out.print("입력: ");
			int bat = scanner.nextInt();
			
			if(bat<1 || bat>10) {
				System.out.println("===1~10 범위에서 입력해주세요.===");
				System.out.println();
				continue;
			}
			
			int pitcher = (int)(Math.random()*10)+1;
			System.out.println("투수 :"+pitcher);		
			if(bat == pitcher) {
				System.out.println("!!안타!!");
				System.out.println();
				hit[i] = hit[i] + 1;				
			}else {
				System.out.println("!!"+(outCount+1)+"아웃!!");
				System.out.println();				
				outCount++;
			}
			
			i++;
			
			if(outCount == 3) {
				System.out.println("==="+times+"회 종료===");				
				outCount = 0;
				times++;
			}
			if(i>=9)
				i = 0;
			
			if(times > 3) {
				System.out.println("========게임 종료========");
				break;
			}			
		}
	}

}
