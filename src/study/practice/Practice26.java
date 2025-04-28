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
		Scanner scanner = new Scanner(System.in);
		
			
			// 탑승인원 입력
//			System.out.print("탑승 인원 수: ");
//			int count = scanner.nextInt();
			
			// 탑승인원 랜덤
			int personCount = (int)(Math.random()*20)+1;	
			System.out.println("탑승인원 : "+personCount);
			
			int[] floorArr = new int[personCount];
			System.out.print("목적지 층수 목록(2~100층) : ");	
			for(int i=0; i<floorArr.length; i++) {
				floorArr[i] = (int)(Math.random()*99)+2;	// 층수 랜덤 추출
				System.out.print(floorArr[i]+" ");
			}
			
			System.out.println();
			int[] weightArr = new int[personCount];
			System.out.print("탑승객 몸무게 목록(40~150kg) : ");
			for(int i=0; i<weightArr.length; i++) {
				weightArr[i] = (int)(Math.random()*111)+40;	// 몸무게 랜덤 추출
				System.out.print(weightArr[i]+" ");
			}
			
			System.out.println();
			System.out.print("최대 멈춤 횟수 입력: ");	
			int maxStopCount = scanner.nextInt();
			
			System.out.print("엘리베이터 제한 무게(kg) 입력 : ");
			int maxWeight = scanner.nextInt();			
			System.out.print("엘리베이터 탑승 정원 입력 : ");
			int maxPersonCount = scanner.nextInt();
			
			// 실제 탑승 인원 수 check
			
			// 1) 탑승 정원 만큼
			// 2) 탑승객의 무게 합산 <= 엘리베이터 총 무게
			int sumWeight = 0; // 승객 무게 합
			int realPersonCount = 0; // 실제 탑승 인원
			
			/*
			for(int i=0; i<weightArr.length; i++) {	//최대인원or최대무게 조건이 반복체크되면서 '실제탑승인원'이정해짐
				
				//최대 인원 넘는지 체크
				//i: 0 1 2 "3"....   
				//maxPesonCount: 3
				if(i >= maxPersonCount) {
					realPersonCount = i;
					break;
				}
				
				// 최대무게 넘는지 체크
				if(sumWeight + weightArr[i] > maxWeight) {
					realPersonCount = i;
					break;
				}else {
					sumWeight = sumWeight + weightArr[i];
				}
					
			}			
			*/
			
			/*
			// 탑승정원 -> 무게 필터링
			// weightArr.length > maxPersonCount
			
			int iMaxCount = (weightArr.length > maxPersonCount) ? maxPersonCount : weightArr.length;
			
			
			for(int i=0; i<iMaxCount; i++) {
				sumWeight = sumWeight + weightArr[i]; // 몸무게 순서대로 합산 
				
				if(sumWeight > maxWeight) 	// 몸무게 합이 최대 제한 넘어가는지 체크
					break;
				
				realPersonCount++;	// 실제 탑승 인원 계산
			}
			*/
			
			//무게 먼저 필터링 -> 탑승정원 적용
			for(int i=0; i<weightArr.length; i++) {
				sumWeight = sumWeight + weightArr[i]; // 몸무게 순서대로 합산 
				
				if(sumWeight > maxWeight) 	// 몸무게 합이 최대 제한 넘어가는지 체크
					break;
				
				realPersonCount++;	// 실제 탑승 인원 계산
			}
			
			//실제 탑승 인원과 최대 정원 비교 해서 작은 값을 실제 탑승 인원에 대입
			realPersonCount = (realPersonCount > maxPersonCount) ? maxPersonCount : realPersonCount;
			
			System.out.println("최종 탑승 인원 : "+realPersonCount);
//-----------------------------------------------------------------------------------
			// 1) 실제 탑승인원 -> 적용
			// 2) floorArr를 실제 작동될 범위로 새로 지정
			
			// 목적지 층 중 최대값 구하기
			int maxFloor = 0;	
//			for(int i=0; i<floorArr.length; i++) {
			for(int i=0; i<realPersonCount; i++) {
				if(maxFloor<floorArr[i]) {	
					maxFloor = floorArr[i];
				}
			}
			
			int floor = 1;
			int flow = 1;   
			int stopCount = 0;
			
			
			while (true) {

				if (realPersonCount < 1) {
					System.out.println("=====탑승 인원이 없습니다=====");
					break;
				}
				System.out.println(floor + "층");

				// 내리는 층 도착 출력
				if (flow == 1) {
					// for (int j=0; j<floorArr.length; j++) {
					for (int j = 0; j < realPersonCount; j++) {
						if (floor == floorArr[j] && flow == 1) {
							System.out.println("==도착==");
							stopCount++;
						}
					}
				}

				if (stopCount == maxStopCount) {
					System.out.println("===점검 중===");
					break;
				}

				if (floor >= maxFloor)
					flow = -1;

				if (floor <= 1 && flow == -1)
					break;

				floor += flow;
			}
		}
	
}