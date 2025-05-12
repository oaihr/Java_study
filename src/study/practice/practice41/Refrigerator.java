package study.practice.practice41;

public class Refrigerator extends HomeAppliance{
	
	int litter; // 몇 리터인지	
	int temperature; // 온도
	int numberOfDoors; // 문이 몇개
	
	int maxTemperature; // 설정 가능한 최대 온도
	int minTemperature; // 설정 가능한 최저 온도
	
	IceTray iceTray; // =new IceTray(); 냉장고 안에 얼음트레이가 있음
	
	// 온도조절 Up or Down
	public void regulateTemp(int temp) {
		if(this.temperature+temp>=minTemperature && this.temperature+temp<=maxTemperature) {
			this.temperature += temp;
		}
	}
	
	// boolean을 받아서 온도조절
	public void controlTemperature(boolean isUp) {	
		if(isUp) {
			temperature++;
		}else {
			temperature--;
		}
	}
	
	// 온도 세팅 
	public void setTemperature(int temp) {
		if(temp>=minTemperature && temp<=maxTemperature) {
			this.temperature = temp;
		}
	}
	
}
