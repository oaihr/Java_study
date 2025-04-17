package study.iteration;

public class Iteration02 {

	public static void main(String[] args) {
		// 반복문 while
		
		/*
		  
		 while(조건식){
		 	실행문
		 } 
		  
		 */
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("피곤해~");
		}
		
		System.out.println("========");
		
		
		int i = 1; 		// 변수 초기화
		while(i<=5) {	// 조건식		
			System.out.println("피곤해~"); //실행문
			i++;		// 증감식	
		}

		System.out.println("========");
		
		
		// while문이 끝나고 i:6이 됨
		
		// 1~5 출력
		i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		while(i<5) {// 0 < 5	
			i++;	// i:1
			System.out.println(i);	// 1			
		}
		
		// while문이 끝나고 i: 5가 됨
		
		
		// do while
		
		i = 6;
		
		while(i<=5) {
			System.out.println("i<5");			
		}
		
		do {
			System.out.println("i<5");
		}while(i<=5);    /// do while은 while 뒤에 ; 필요함
		
			
	}

}
