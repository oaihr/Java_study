package study.reference;

public class Reference02 {

	public static void main(String[] args) {
		// 참조변수: 배열
		
		// 배열이 없다면
		
		int scoreArr1 = 100;
		int scoreArr2 = 85;
		int scoreArr3 = 75;
		int scoreArr4 = 65;
		int scoreArr5 = 40;
		
		int sum = 0;
		
		sum = scoreArr1 + scoreArr2 + scoreArr3 + scoreArr4 + scoreArr5;
		double avg = sum / 5.0;
		
		System.out.printf("총점:%d 평균:%.2f\n", sum, avg);
		
		// 배열 Array
		
		// int 데이터를 가지는 배열 생성
		
		// 참조변수
		int[] scoreArr = {100, 85, 75, 65, 40}; // 5개 정수를 가진 배열
		
		System.out.println(scoreArr);
		
		System.out.println(scoreArr[0]);
		System.out.println(scoreArr[2]);
		System.out.println(scoreArr[4]);
//		System.out.println(scoreArr[5]);  index 범위 주의!
		
		sum = scoreArr[0]+scoreArr[1]+scoreArr[2]+scoreArr[3]+scoreArr[4];
		avg =  sum / 5.0;
		
		sum = 0;
		for(int i=0;i<5;i++) {  // i: 0 1 2 3 4
			sum = sum + scoreArr[i];
		}
		avg = sum / 5.0;		
		System.out.printf("총점:%d 평균:%.2f\n", sum, avg);
		
		//int[] pointArr = {1,2,3,4,5};
		int[] pointArr = null;
		//pointArr = {1,2,3,4,5}; 불가
		 pointArr = new int[]{1,2,3,4,5}; //가능
		 
		 pointArr = new int[5]; // 5칸짜리 배열 생성 
		 pointArr[0] = 1;
		 pointArr[1] = 2;
		 pointArr[2] = 3;
		 pointArr[3] = 4;
		 pointArr[4] = 5;
		
		 for(int i=0; i<5; i++) {
			 // i: 0 1 2 3 4
			 // 값: 1 2 3 4 5
			 pointArr[i] = i+1; 
		 }
		 
		 for(int i=1; i<=5; i++) {
			 //    i : 1 2 3 4 5 값
			 //index : 0 1 2 3 4 i-1
			 pointArr[i-1] = i;
		 }
		 
		 for(int i=0; i<5; i++) {
			 System.out.print(pointArr[i]+" ");
		 }
		 System.out.println();
		 
		 int[] intArr = new int[6];
		 double[] doubleArr = new double[12];
		 boolean[] boolArr = new boolean[4];
		 String[] strArr = new String[20];
		 
		 intArr[3] = 9;			//0
		 doubleArr[9] = 11.11;	//0
		 boolArr[3] = true;		//false
		 strArr[15] = "점심";		//null
		 
		 for(int i=0; i<intArr.length; i++) {
			 System.out.print(intArr[i]+" ");
		 }
		 System.out.println();
		 
		 for(int i=0; i<doubleArr.length; i++) {
		 System.out.print(doubleArr[i]+" ");
		 }
		 System.out.println();
		 
		 for(int i=0; i<boolArr.length; i++) {
		 System.out.print(boolArr[i]+" ");
		 }
		 System.out.println();
		 
		 for(int i=0; i<strArr.length; i++) {
		 System.out.print(strArr[i]+" ");
		 }
		 System.out.println();
		 
	}

}
