package study.practice.practice37;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {
		String str = "Returns a completion of the value and message";
		
		String str1 = str.toLowerCase();
		
		str1 = str1.replaceAll(" ", "");
		
//		1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
//		(중복된 수 제외, 대소문자 구분X)
//		Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
		
		HashSet<Character> set1 = new HashSet<Character>();
		
		for(char c : str1.toCharArray()) {			
			set1.add(c);
		}
		System.out.println(set1.size());
		
//		2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		for(char c : str1.toCharArray()) {
			
			map1.put(c, map1.getOrDefault(c, 0)+1);
							// key값이 c인 value가 있으면 가져오고 없으면 0대입
//			if(map1.containsKey(c)) {
//				map1.put(c, map1.get(c)+1);
//			}else {
//				map1.put(c, 1);
//			}			
		}
		
		Set< Entry<Character, Integer> > entrySet = map1.entrySet();
		
		for(Entry<Character, Integer> entry : entrySet) {			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
