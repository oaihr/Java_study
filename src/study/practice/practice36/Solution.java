package study.practice.practice36;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	
		// 최빈값 구하기
		
		public int solutionMap(int[] array) {
			
			// 		숫자		카운트
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int n : array) {
				if(map.containsKey(n)){                 
	                map.put(n, map.get(n)+1);
	            }else{
	                map.put(n, 1);
	            }				
			}
			
			int maxValue = 0;
			for(int key : map.keySet()) {				
				if(map.get(key) > maxValue)
					maxValue = map.get(key);
			}
			
			return maxValue;
		}
		
		
		
		
		public int solution(int[] array) {
	        int[] numCount = new int[1000]; // 각 숫자별로 카운트용 배열
	        for(int i=0; i<array.length; i++){
	            numCount[array[i]]++; 
	        }
	        int maxNum = 0;
	        int maxIndex = 0;
	        for(int i=0; i<numCount.length; i++){  //최빈 요소 구하기
	            if(maxNum<numCount[i]){
	                maxNum = numCount[i];
	                maxIndex = i;
	            }            
	        }
	        int answer = 0;
	        answer = maxIndex;
	        // 만약에 최빈 요소가 여러개면? how to check
	        Arrays.sort(numCount);
	        
	        if(numCount[numCount.length-1] == (numCount[numCount.length-2]))
	            answer = -1;
	       
	        return answer;
	    
		
	}

}
