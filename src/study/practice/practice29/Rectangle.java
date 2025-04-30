package study.practice.practice29;

public class Rectangle {
	
	int bottom;
	int height;
	
	Rectangle(int bottom, int height){
		this.bottom = bottom;
		this.height = height;
	}
	
	int getArea(){
		int area = 0;
		area = bottom * height;
		return area;
	}
}
