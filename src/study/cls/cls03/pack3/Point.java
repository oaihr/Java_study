package study.cls.cls03.pack3;

public class Point {
	private int kor;
	private int eng;
	private int math;
	String name; // 이 점수의 소유자
	
	//생성자
	public Point() {
		
	}
	
	//외부에서 생성못함
//	private Point() {
//		
//	}
	
	//getter 값 가져오기(반환)
	// get필드명
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	//setter 값 세팅(저장)
	// set필드명
	
	public void setKor(int kor) {
		if(kor<0 || kor>100) {
			System.out.println("범위를 벗어남, 저장불가");
			return;
		}			
		this.kor = kor;		
	}
	
	public void setEng(int eng) {
		if(eng<0 || eng>100)
			eng = 100;		
		this.eng = eng;		
	}
	
	public void setMath(int math) {
		if(math<0 || math>100)
			eng = 0;
		this.math = math;		
	}
}
