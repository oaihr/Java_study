package study.iteration;

public class Iteration01 {

	public static void main(String[] args) {
		
		
		System.out.println("안녕하세요~");
		System.out.println("안녕하세요~");
		System.out.println("안녕하세요~");
		System.out.println("안녕하세요~");
		System.out.println("안녕하세요~");
	
		// 반복문
		/*
		 for(초기화식; 조건식; 증감식){
		 	실행문
		 } 
		 */
		System.out.println("======for문======");
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요~");
		}
		
		// i : 1~10  -> 10번 반복
		
		// i=1, 조건식 i<15 -> 14번 반복
		
		
		// 단순 반복 용도
		int i = 1;		
		for(i=7; i != 13; i++) {
			System.out.println("반갑습니다요~");		
		}
		
		//실제 반복되는 값을 실행에 활용하는 용도
		
		// 1~7일 동안 반복 학습 출력
		System.out.println("자바 복습 1일차");
		System.out.println("자바 복습 2일차");
		System.out.println("자바 복습 3일차");
		System.out.println("자바 복습 4일차");
		System.out.println("자바 복습 5일차");
		System.out.println("자바 복습 6일차");
		System.out.println("자바 복습 7일차");
		
		// 필요한 숫자 -> 1~7 (반복용 + 사용하는 용)
		
		for(int j=1; j <= 7; j++) {
				// j: 1~7
			System.out.println("자바 복습 "+j+"일차");
		}
		
		// 1~50 까지 합
		// int sum = 1 + 2 + 3 + .... + 50;
		int sum = 0;
		for(int k=1; k<=50; k++) {			
			sum = sum + k;			
		}
		System.out.println("1~50까지의 합 : "+sum);
		
		
		for(int k=2;k<20; k=k*2) {
			System.out.println(k);
		}  // 2 4 8 16
		
		
		for(int k=400; k>100; k=k-50) {
			System.out.print(k+" ");
			//400 350 300 250 200 150 
		}
		
		System.out.println(); //줄바꿈 처리
		
		for(int k=100; k>=90;k--) {
			System.out.print(k+" ");
			// 100 99 98 97 96 95 94 93 92 91 90
		}
		
			
			
	}

}
