package study.practice.practice41;

public class Sink extends Stuff{
	int horizontal; // 가로 길이
	int vertical; // 세로 길이
	int depth; // 깊이
	
	public int getHorizontal() {	// getter
		return horizontal;	// mm 단위
	}
	
	public int getHorizontalAsCm() {	// cm 단위로 바꿔서 반환
		return horizontal/10;
	}
	
	public double getHorizontalAsMeter() {	// m 단위로 바꿔서 반환
		return horizontal/1000.0;
	}
	
}
