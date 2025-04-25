package study.practice;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		
		//for문을 이용해 최대값을 출력하는 코드를 작성해보기
		int maxNum = 0;
		
		for(int i=0; i<array.length; i++) {
			if(maxNum < array[i]) {
				maxNum = array[i];
			}			
		}
		System.out.println(maxNum);
		
		
		//주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요 중첩 (for문 이용)
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				
		};
		
		int sum = 0;
		int length = 0;
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++){
				sum = sum + array2[i][j];
				length ++;
			}
		}
		System.out.println("전체 합: "+sum);
		System.out.println("평균: "+ (double)sum / length );
		
		
		// 학생들의 점수를 분석하는 프로그램 
		Scanner scanner = new Scanner(System.in);
		int num = 1;
		int[] scores = null;
		int student = 0;
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.print("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료\n");
			System.out.println("----------------------------------------------");
			System.out.println("선택> "+num);
			
			if(num == 1) {
				System.out.print("학생수> ");
				student = scanner.nextInt();
				scores = new int[student];			
				
			}else if(num == 2) {				
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]: ", i);
					scores[i] = scanner.nextInt();
				}
			}else if(num == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
			}else if(num == 4) {
				int max = scores[0];
				int total = 0;
				for(int i=0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					total = total + scores[i];
				}
				System.out.println("최고 점수: "+max);				
				System.out.println("평균 점수: "+( (double)total/scores.length ) );
			}else if(num == 5) {
				System.out.println("프로그램 종료");
				break;
			}			
						
			num++;
		}
		
		
		
		
	}

}
