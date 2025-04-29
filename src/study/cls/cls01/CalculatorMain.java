package study.cls.cls01;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		
		cal1.brand = "카시오";		
		cal1.powerOn();
		
		Calculator cal2 = new Calculator();
		cal2.powerOn();
		
		cal1.setBrightness(6);
		cal1.setBrightness(7);
		
		cal2.setBrightness(10);
		
		//cal2.getInfo();
		String s = cal2.getInfo();
//		String s = "전자계산기"; 와 같음
		System.out.println(s);
		
		System.out.println(cal1.getInfo());
		
		int result = cal2.sum(1,2);
		System.out.println(result);
		
		System.out.println(cal2.sum(20,15));
		
		int[] arr = {1,5,2,3,9,32,4};
		
		int result2 = cal2.sumArr(arr);
		System.out.println(result2);
	}

}
