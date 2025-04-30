package study.practice.practice29;

public class Triangle {
	
	int bottom;
	int height;
	
	void setSize(int bottom, int height){
		this.bottom = bottom;
		this.height = height;
	}
	
	double getArea() {
		double area = 0;
		area = bottom*height/2;
		return area;
	}
}
