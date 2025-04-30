package study.practice.practice29;

public class Circle {

	int radius;
	
	void setRadius(int radius){
		this.radius = radius;
	}
	
	double getArea() {
		double area = 0;
		area = radius*radius*3.14;
		return area;
	}
}
