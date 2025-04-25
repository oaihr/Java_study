package study.practice;

import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
//		basicv3();
//		level1();
		level2();
	}
	
	public static void basicv1() {
				// 100층 짜리 빌딩 
		
				// 1층에서 사람들이 탑승, 각자 내릴 층 버튼을 누른다
				
				// 1 -> 100층 까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려옴
				
				// 층수가 변경될 때마다 현재 층수를 출력
				
				// 탑승인원을 입력받음
				// 탑승 인원 만큼 사람들이 내릴 층(2층~100층) 을 각각 입력받음
				
				Scanner scanner = new Scanner(System.in);
				while(true) {
					System.out.print("탑승 인원: ");
					int count = scanner.nextInt();
					
					int[] floorArr = new int[count];
					
					System.out.print("층수 입력: ");	
					for(int i=0; i<floorArr.length; i++) {
						floorArr[i] = scanner.nextInt();
					}
					
					int floor = 1;
					
					while(true) {
						
						System.out.println(floor+"층");
						
						for(int i=0; i<floorArr.length; i++) {
							if(floor == floorArr[i]) {
								System.out.println(" 내림");				
							}
						}
						if(floor == 100)
							break;
						floor++;
					}
					
					
					while(true) {
						floor--;
						System.out.println(floor+"층");
						if (floor==1)
							break;
					}				
					
				}
	}
	
	public static void basicv2() {
		
				//내가 만듬
		
				// 100층 짜리 빌딩 
		
				// 1층에서 사람들이 탑승, 각자 내릴 층 버튼을 누른다
				
				// 1 -> 100층 까지 올라가는 와중에 탑승 인원을 내려주고 
				// 탑승 인원이 0이된 층(최대층)부터 1층으로 내려옴
				
				// 층수가 변경될 때마다 현재 층수를 출력
				
				// 탑승인원을 입력받음
				// 탑승 인원 만큼 사람들이 내릴 층(2층~100층) 을 각각 입력받음
				
				Scanner scanner = new Scanner(System.in);
				while(true) {
					System.out.print("탑승 인원 수: ");
					int count = scanner.nextInt();
					
					int[] floorArr = new int[count];
					
					System.out.print("층수 입력: ");	
					for(int i=0; i<floorArr.length; i++) {
						floorArr[i] = scanner.nextInt();
					}
					
					int floor = 1;
					
					int check = count;
					
					while(true) {
						
						System.out.println(floor+"층");
						
						for(int i=0; i<floorArr.length; i++) {
							if(floor == floorArr[i]) {
								System.out.println(" 내림");	
								check --;
							}
						}
						
						if(check == 0)
							break;
						floor++;
					}
					
					
					while(true) {
						floor--;
						System.out.println(floor+"층");
						if (floor==1)
							break;
					}				
					
				}
	}
	public static void basicv3() {
		
		// 100층 짜리 빌딩 
		
		// 1층에서 사람들이 탑승, 각자 내릴 층 버튼을 누른다
		
		// 1 -> 100층 까지 올라가는 와중에 탑승 인원을 내려주고 
		// 탑승 인원이 0이된 층(최대층)부터 1층으로 내려옴
		
		// 층수가 변경될 때마다 현재 층수를 출력
		
		// 탑승인원을 입력받음
		// 탑승 인원 만큼 사람들이 내릴 층(2층~100층) 을 각각 입력받음
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("탑승 인원 수: ");
			int count = scanner.nextInt();
			
			int[] floorArr = new int[count];
			
			System.out.print("층수 입력: ");	
			for(int i=0; i<floorArr.length; i++) {
				floorArr[i] = scanner.nextInt();
			}
			
			// boolean 이용
//			int floor = 1;
//			boolean isUp = true; // true 올라가는 중     false 내려가는 중
//			// flag : 특정 동작을 수행할지 말지 결정하는 (보통 1비트인) 변수
//			
//			while(true) {
//				
//				System.out.println(floor+"층");			
//			
//				if(floor >= 100)
//					isUp = false;
//					
//				if(floor <= 1 && isUp == false)  // 내려 오는 경우에만 1층에서 종료
//					break;
//				
//				// isUp 값에 의해 +1 -1 결정
//				if(isUp)
//					floor++;
//				else
//					floor--;
				
//				if(floor <= 0)
//					break;
			
			// int 변수를 이용 
			int floor = 1;
			int flow = 1;   // flow: 1 or -1   올라가는지 내려가는지 방향 설정, 층 값 변화 연산에 참여
			// flag
			
			int maxFloor = 0;
			for(int i=0; i<floorArr.length; i++) {
				if(maxFloor<floorArr[i]) {	// 지금까지의 최대값인 maxScore보다 배열[i]에 있는 값이 더크다
					maxFloor = floorArr[i];
				}
			}
				
			while(true) {
				
				System.out.println(floor+"층");			
				
				
				if(flow == 1) {  // 올라가는 중일때만 도착 층 출력
					for (int j=0; j<floorArr.length; j++) {
						if(floor == floorArr[j] && flow == 1) {
							System.out.println("==도착==");
						}
					}
				}
				
				// 100층까지 다 올라갔으면? 내려가는 방향으로
				//if(floor >= 100)
				if(floor >= maxFloor)	
					flow = -1;
					
				if(floor <= 1 && flow == -1)  // 내려 오는 경우에 1층에서 종료
					break;				
				
				floor += flow; // 층 정보에 flow가 +1 or -1 연산 
			}
			
			
			
		}

	}	
	
	public static void level1() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("탑승 인원 수: ");
			int count = scanner.nextInt();
			
			int[] floorArr = new int[count];
			
			System.out.print("층수 입력: ");	
			for(int i=0; i<floorArr.length; i++) {
				floorArr[i] = scanner.nextInt();
			}
			
			System.out.print("최대 멈춤 횟수 입력: ");	
			int maxStopCount = scanner.nextInt();
			
			int maxFloor = 0;
			for(int i=0; i<floorArr.length; i++) {
				if(maxFloor<floorArr[i]) {	
					maxFloor = floorArr[i];
				}
			}
			
			int floor = 1;
			int flow = 1;   
			int stopCount = 0;
				
			while(true) {
				
				System.out.println(floor+"층");			
				
				
				if(flow == 1) {  
					for (int j=0; j<floorArr.length; j++) {
						if(floor == floorArr[j] && flow == 1) {
							System.out.println("==도착==");
							stopCount++;
						}
					}
				}
				
				if(stopCount == maxStopCount) {
					System.out.println("===점검 중===");
					break;
				}
				
				
				if(floor >= maxFloor)	
					flow = -1;
					
				if(floor <= 1 && flow == -1)  
					break;				
				
				floor += flow;
			}
		}
	}
	
	public static void level2() {
		
//		- 레벨 2
//		엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
//		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
//		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
//
//		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
//		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
//		+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
		
		// 먼저 탑승 인원 밑 내릴층을 랜덤으로 뽑은 후에 총무게 정원 처리
		
	
		
	}
	
}
