package study.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collection03 {
	public static void main(String[] args) {
		
		//HashMap
		
		// Key	Value
		// 번호	이름
		// 숫자	문자
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "일일");
		map1.put(2, "이이");
		map1.put(3, "삼삼");
		map1.put(3, "삼삼삼"); //수정
		
		map1.remove(2); // (2, "이이") 제거
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(3));
		System.out.println(map1.containsKey(5));
		
		System.out.println(map1.containsValue("이이"));
		System.out.println(map1.containsValue("사사"));
		
		System.out.println(map1.get(1));
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("규칙1", "지각하지 않기");
		map2.put("규칙2", "결석하지 않기");
		
		System.out.println(map2.get("규칙2")); 
		
		System.out.println("========map1 key========");
		//map1.keySet(); // set -> iterator -> hasNext next
		for(int key : map1.keySet()) {		//1 2 3
			System.out.print(key+":"+map1.get(key)+" ");
		}							//key값으로 value값 가져옴
		System.out.println();
		
		System.out.println("========map1 value========");
		
		for(String value : map1.values()) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		
		Set< Entry<Integer, String> > entrySet = map1.entrySet();
		
		System.out.println("========map1 entrySet========");
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}
