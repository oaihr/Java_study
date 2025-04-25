package study.practice;

public class Practice25 {

	public static void main(String[] args) {
//		학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
//		이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.
//
//		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
//
//		최고 점수와 최저 점수를 력하세요.
//		평균 점수를 출력하세요.
//		80점 이상인 학생의 수를 출력하세요.
//
//		출력 예)
//
//		최고 점수: 100
//		최저 점수: 63
//		평균 점수: 82.5
//		80점 이상 학생 수: 6명
		
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		int maxScore = 0;
		int minScore = 100;
		int sum = 0;
		int good = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(maxScore<scores[i]) {	// 지금까지의 최대값인 maxScore보다 배열[i]에 있는 값이 더크다
				maxScore = scores[i];
			}
			if(minScore>scores[i]) {	// 지금까지의 최소값인 minScore보다 배열[i]에 있는 값이 더작다
				minScore = scores[i];
			}
			sum = sum + scores[i];		// 각 인덱스 값의 합 구하기
			if(scores[i] >= 80) {		// 각 인덱스의 값이 80이 넘을 경우 체크 
				good++;				
			}
		}
		double avg = (double)sum / scores.length;
		
		System.out.println("최고 점수: "+maxScore);
		System.out.println("최저 점수: "+minScore);
		System.out.println("평균 점수: "+ avg);
		System.out.println("80점 이상 학생 수: "+good+"명");
		
				
		// 정렬 알고리즘 알아보기 
		// {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
	
	}

}
