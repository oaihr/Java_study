package study.practice.practice29;

public class Monitor {
	
	String mfr;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	Monitor(String mfr, int inch, int price){
		this.mfr = mfr;
		this.inch = inch;
		this.price = price;
	}
	
	Monitor(String mfr, int inch, int price, String color){
		this.mfr = mfr;
		this.inch = inch;
		this.price = price;
		this.color = color;
	}
	
	void setXY(int maxX, int maxY){
		maxResolutionX = maxX;
		maxResolutionY = maxY;		 
	}
	void setColor(String color){
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	int priceUp(int price) {
		int raisedPrice = 0;
		raisedPrice = this.price + price;
		return raisedPrice;
	}
	
	void showInfo() {
		System.out.printf("%s제품 %s %d인치 해상도: %d*%d "
				+ "%d원\n", mfr, color, inch, maxResolutionX, maxResolutionY, price);
	}
	
}
