package study.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeX {

	public static void main(String[] args) {
		
		
		// 100층 짜리 빌딩 
		
		// 1층에서 사람들이 탑승, 각자 내릴 층 버튼을 누른다
		
		// 1 -> 100층 까지 올라가는 와중에 탑승 인원을 내려주고 탑승 인원이 0이된 층부터 1층으로 내려옴
		
		// 층수가 변경될 때마다 현재 층수를 출력
		
		// 탑승인원을 입력받음
		// 탑승 인원 만큼 사람들이 내릴 층(2층~100층) 을 각각 입력받음
		
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("탑승 인원 수: ");
			int count = scanner.nextInt();
			
			int[] floorArr = new int[count];
			
			System.out.print("층수 입력: ");	
			for(int i=0; i<floorArr.length; i++) {
				floorArr[i] = scanner.nextInt();
			}
			
			Arrays.sort(floorArr);
			
			System.out.print("엘리베이터 멈춤 횟수: ");
			int stop = scanner.nextInt();
			
			int floor = 1;
			
			int check = stop;
			
			while(true) {
				
				System.out.println(floor+"층");
				
				for(int i=0; i<stop; i++) {
					if(floor == floorArr[i]) {
						System.out.println(" 내림");	
						check --;
					}	
				}
				if(floor == floorArr[stop-1]) {
					System.out.println("===점검 중===");
					break;
				}

				floor++;
			}
			
			if(check == 0) {				
				break;
			}
					
			
		}
	}

}
