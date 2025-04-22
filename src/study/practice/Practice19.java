package study.practice;

public class Practice19 {

	public static void main(String[] args) {
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
				//규칙 찾아보기.
//				0 1 2 3 4
//			0	1 2 2 2 2
//			1	3 1 2 2 2
//			2	3 3 1 2 2
//			3	3 3 3 1 2
//			4	3 3 3 3 1
				
				int[][] arr1 = new int[5][5];
				
				for(int i=0; i<arr1.length; i++) {
					for(int j=0; j<arr1[i].length; j++) {
						if(i == j) {
							arr1[i][j] = 1; 
						}else if(i < j) {
							arr1[i][j] = 2; 
						}else if(i > j) {
							arr1[i][j] = 3;
						}
						System.out.print(arr1[i][j]+" ");
					}
					System.out.println("");
				}

	}

}
