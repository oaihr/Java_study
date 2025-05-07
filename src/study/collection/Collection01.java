package study.collection;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		
		// Array
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(String value : arr) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		// ArrayList (참조변수)
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> list2 = null;
		//ArrayList<Menu>	Menu[]
		//ArrayList<Order>	order[]
		
		
		System.out.println(list.size());
		//System.out.println(list2.size());	//불가
		
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list.size());
		System.out.println(list.get(3)); // 3번 인덱스 값 불러오기
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		list.add(1, "A");	// index 1에 "A"추가 (index 2 부터는 뒤로 밀림)
		list.set(2, "H");	// index 2에 "H"저장 (해당 위치 값이 바뀜)
		list.remove(0);		// index 0 위치 값 삭제
		list.remove("G");	// "G"값을 삭제
		
		for(String value : list) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		System.out.println(list.contains("Z"));	// 값 가지고 있는지 확인
		System.out.println(list.contains("G"));
		
		int[] intArr = new int[10];
		
		//ArrayList<int> intList = new ArrayList<int>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//Integer.parseInt(null)
		
		// 포장객체 Wrapper Class
		// int -> Integer
		// double -> Double
		// boolean -> Boolean
		
		intList.add(10);
		//intList.add(new Integer(30));
		intList.add(30);
		intList.add(50);
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		for(int n : intList) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
	}

}
