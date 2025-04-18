package study.iteration;

public class Iteration03 {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		//for(int i=1; i<=10; i++)
		while(i<=10) {
			System.out.println(i);
			i++;
			
			if (i==5)
				break; // 실행중인 반복문을 끝내기
		}
		
		//무한루프		(while이 잘어울림, for는 횟수가 정해졌을 때)
		int energy = 100;
		
		while(true) {
			System.out.println("달리는 중");
			energy--;
			
			if(energy == 0)
				break;			
			
		}
		
		for(energy=50; true; energy--) {
			System.out.println("달리는 중");
			
			if(energy == 0)
				break;		
		}
	 
		/*  
		 반복(true) {
		 	멈춰야하는 사전 조건 확인 (사전 필터링)
		 	
		 	if(유통기한 남았나?)
		 		break;
		 	if(이상한 냄새가 안나나?)
		 		break;
		 	if(곰팡이가 생겼나?)
		 		break;
		 			 	
		 	실행
		 } 
		 */
		
		System.out.println("============================");
		
		for(i=1; i<=10; i++) {			
			
			if(i==5 || i==8)
				continue; // 5, 8 빼고 출력
			
			if(i==7)
				break;
			
			System.out.println(i);
		}
	}

}
