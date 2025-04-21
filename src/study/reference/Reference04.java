package study.reference;

public class Reference04 {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr22 = arr2; 	// arr22에게 arr2의 주소를 대입
		
		System.out.println(arr1 == arr2); // 배열은 참조 타입이라 주소가 다름
		System.out.println(arr1[1] == arr2[1]); // 배열의 값을 비교
		
		System.out.println(arr2 == arr22);
		
		String[] arr3 = {"A", "B", "C"};
		String[] arr4 = {"A", "B", "C"};
		
		System.out.println(arr3 == arr4); // 주소가 다름
		System.out.println(arr3[0] == arr4[0]); // 값 비교, 같음
		System.out.println(arr3[0].equals(arr4[0])); // 값 비교 할 때는 eqauls를 사용하자!
		
		
			
	}

}
