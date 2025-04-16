package study.condition;

public class Conditional02 {

	public static void main(String[] args) {
		
		int dice =  5;
		
		if(dice == 1) {    // 5 == 1 -> false
			System.out.println("한칸 전진");
		}
		
		if(dice == 1) {    
			System.out.println("한칸 전진");
			//
			//
		}else {
			System.out.println("1이 아닐때 할 행동1");
			System.out.println("1이 아닐때 할 행동2");
			System.out.println("1이 아닐때 할 행동3");
		}
		
		if(dice == 1)     // 다음 한줄까지는 if에 종속
			System.out.println("한칸 전진");			
		else 
			System.out.println("1이 아닐때 할 행동1");  // 다음 한줄까지는 else에 종속
		
		System.out.println("1이 아닐때 할 행동2");
		System.out.println("1이 아닐때 할 행동3");
	
		/*
		 if() 
		 if()
		 if()
		    
		 if()
		 else
		     
		 if()
		 else if()
		 else if()
		 else if()
		 else
		  
		 if()
		 else if()
		 else if()
		 
		 else X
		 
		 else if() X
		 
		 */
		
		if(dice == 1) {
			
		}else if(dice == 2){
						
		}else if(dice == 3){
			
		}
					
		
		if(dice == 1) {
			
		}else if(dice == 2){
						
		}else if(dice == 3){
			
		}else {
			
		}
		
		
		if(dice == 1) {
			
		}
		if(dice == 2){
						
		}
		if(dice == 3){
		
		}
		
//		6000원 이하 -> "훌륭"
//		6000원 초과 ~ 8000원 -> "선방"
//		8000원 초과 ~ 12000원 -> "눈물"
//		12000원 초과 -> "물로배채우기"
		
		int menuPrice = 5000;
		
		//if만 활용 구분이 제대로 안되는 케이스
		if(menuPrice <= 6000) {
			System.out.println("훌륭");
		}
		if(menuPrice <= 8000) {
			System.out.println("선방");
		}
		
		//if만 활용 구분이 제대로 안되는 케이스 -> 구분하도록 
		if(menuPrice <= 6000) {
			System.out.println("훌륭");
		}
		if(menuPrice > 6000 && menuPrice <= 8000) {
			System.out.println("선방");
		}
		if(menuPrice > 8000 && menuPrice <= 12000) {
			System.out.println("눈물");
		}
		
		
		
		
		menuPrice = 12000;
		
		if(menuPrice <= 6000) {
			System.out.println("훌륭");
		}else if(menuPrice <= 8000) {
			System.out.println("선방");
		}else if(menuPrice <= 12000) {
			System.out.println("눈물");
		}else {
			System.out.println("물로배채우기");
		}
		
		
		// 로직이 잘못된 케이스 -> 결과라도 맞게 나오게 (비효율적인 구조/ 잘못된 구조)
		// if 조건문 -> 중첩 사용가능
		if(menuPrice > 6000) {                   //menuPrice=15000이면 선방 눈물 물로배채우기 출력
			
			//중첩 if
			if(menuPrice > 12000) {
				//물배
			}else if(menuPrice > 8000) {
				//눈물
			}else {
				//선방
			}
			
			if(menuPrice > 12000) {
				//물배
			} else {
				
				if(menuPrice > 8000) {
					//눈물
				}else {
					//선방
				}
			}
			
						
		}else if(menuPrice > 8000) {
			System.out.println("눈물");
		}else if(menuPrice > 12000) {
			System.out.println("물로배채우기");
		}else {
			System.out.println("훌륭");
		}
		
		
		// 로직이 맞는 케이스 
		if(menuPrice > 12000) {                   
			System.out.println("물로배채우기");
		}else if(menuPrice > 8000) {
			System.out.println("눈물");
		}else if(menuPrice > 6000) {
			System.out.println("선방");
		}else {
			System.out.println("훌륭");
		}
	}

}
