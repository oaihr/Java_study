package study.reference;

public class Reference06 {

	public static void main(String[] args) {
		// 향상된 for문 
		
		int[] arr = {10, 20, 30, 40, 50};
		
		//누적합
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		sum = 0;
		int index = 0;
		for(int num : arr) { // num 변수에 배열의 값이 매핑			
			sum = sum + num;
			// arr의 길이만큼 처음부터 끝까지 반복
			
			// 값만 주어짐, 인덱스는 모름(필요하면 따로 처리)
			index++;
			if(index >=3)  // 3번만 반복 시키고 싶으면 조건주기
				break;
		}
		System.out.println(sum);
	
	
		int[] scores = {90, 95, 100, 80, 70}; 
		
		// 채점 실수로 모두 -5점 처리
		for(int score : scores) {			
			System.out.print(score+" ");
		}
		System.out.println();
		
		for(int score : scores) {
			score = score - 5;
//			변수 score는 반복할때마다 사용됨			
		}
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i] -5;
		}
		for(int score : scores) {			
			System.out.print(score+" ");
		}
		System.out.println();
	}

}
