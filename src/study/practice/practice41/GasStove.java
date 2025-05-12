package study.practice.practice41;

public class GasStove extends HomeAppliance{
	
	int burnerNum; // 화구 몇개	
	int price; // 가격
	int heatLevel; // 불세기
	
	// 불세기조절 
	public void adjustHeat(int level) {
		this.heatLevel += level;
	}
	
}
