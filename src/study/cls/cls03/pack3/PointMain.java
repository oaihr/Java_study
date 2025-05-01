package study.cls.cls03.pack3;

public class PointMain {

	public static void main(String[] args) {
		// 점수 -> 국어 영어 수학
		
		// 특정 1명의 점수
		int kor = 30;
		int eng = 20;
		int math = 50;
		
		int[] korArr = new int[5];
		int[] engArr = new int[5];
		int[] mathArr = new int[5];
			//배열들의 같은 index를 같은 사람으로 구분
		
		Point p1 = new Point();
		//점수의 범위 0~100 제한
		
		// private이라 직접접근불가
//		p1.eng = 500;
//		p1.math = 95;
//		p1.kor = -10;
		
		// setter메서드를 이용해 접근
		p1.setEng(500);
		p1.setMath(95);
		p1.setKor(-10);
		
		// private 변수들은 직접 접근 불가
		// get() 메서드를 이용해서 불러옴
		System.out.println(p1.getEng());
		System.out.println(p1.getMath());
		System.out.println(p1.getKor());
		
	}

}
