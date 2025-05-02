package study.practice.practice30;

public class Elevator {
	
	public static void main(String[] args) {
		// 변수 생성
//				int a = 13;
//				int b = 7;
//				int c = 10;
		// 결과 출력
//				System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
//				System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
//				System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
			}

			public static String guide(int floor) {
				String result = null;
				if(floor>=1 && floor<=10) {
					result = "저층";
				}else if(floor>=11 && floor<=20) {
					result = "고층";
				}else {
					result = "유효하지 않은 층";
				}
				return result;
				
			}
}
