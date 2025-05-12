package study.practice.practice43;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		FoodTruck t1 = new FoodTruck("피피피자");
		
		t1.addMenu("치즈피자", 10000, 7);
		t1.addMenu("페퍼로니피자", 11000, 8);
		t1.addMenu("버섯피자", 12000, 6);
		
		t1.storeOpening();
		
		/*
		FoodTruck t2 = new FoodTruck("쌈쌈쌈밥");
		//메뉴
		t2.storeOpening();
		*/
	}

}
