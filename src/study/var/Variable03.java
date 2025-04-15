package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 타입변환
		
		double d1 = 3.14;
		double d2 = d1; 
		
		int i1 = 30;
		int i2 = i1;
		//int i3 = 3.33; // int는 정수형 값만 갖음  3.33=실수
		
		double d3 = i1; // double <- int 자동타입변환 큰타입 <- 작은타입 
		
		int i3 = (int)d2; // 작은타입 = (작은타입)큰타입   '강제타입변환'
		
		System.out.println(d2); // 3.14
		System.out.println(i3); // 3   강제타입변환시 소수점 아래 0.14 사라짐
		
		// java 정수 -> int 타입 인식 
		// java 실수 -> double 타입 인식 
		
		float f1 = 5.5f;  //float타입 변수에 double타입 값을 넣어서 오류 뒤에 f를 넣음 
		d3 = f1; // 자동변환 일어남 d3는 double
		
		double d4 = 15;  // 15.0으로 출력됨 자동타입변환
		double d5 = 15.5;
		System.out.println(d4);
		
		
		int i6 = 10;
		double d6 = 5.5;
		
		double result1 = i6 + d6; // int + double --> double
		System.out.println(result1);
		
		//  int     =  double
//		int result2 = i6 + d6;
		int result2 = i6 + (int)d6;  // d6 값이 5.5 -> 5
		
		result2 = (int)(i6 + d6);   // (int)(double)
					   //int + double
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rst = (int)dv1 + (int)dv2;  // 11
		System.out.println(rst);
		
		rst = (int)(dv1 + dv2);     // 12
		System.out.println(rst);
		
		int x = 1;
		int y = 2;
						// int / int => 연산결과 int
		double z = x / y;
		System.out.println(z);
		
		// 소수점이 정확하게 나오게 하기 위해서
		// 연산을 double 과 int 의 연산으로 바꾼다
		z = (double)x / y;    // double / int = double
		z = x / (double)y; 	  // int / double = double
		z = (double)x / (double)y;  // double / double = double
		System.out.println(z);
		
		z = 10 / 3.0;  // int / double 로 인식 
		System.out.println(z);
	}

}
