package study.practice.practice38;

public class ProtectedFields {

	public static void main(String[] args) {
		// 객체 생성
		Basketball b = new Basketball();
		Soccer s = new Soccer();
		PingPong p = new PingPong();

		// 객체 필드 초기화
		b.name = "농구";
		s.name = "축구";
		p.name = "탁구";

		// 부모 타입(업 캐스팅)으로 배열 생성		
		Sports[] sportsArr = { b, s, p };		
		//sportsArr[0] = b;
		//sportsArr[1] = s;
		//sportsArr[2] = p;
// sportsArr에는 Sports타입 변수가 들어와야함 
// Sports의 자식 객체인 b,s,p가 들어오면
// 부모 타입 Sports로 자동 변환 됨		
		
		// 모든 운동 설명 출력
		for (int i = 0; i < sportsArr.length; i++) {
		Sports tmp = sportsArr[i];
		tmp.description();
		}

	}

}
