package study.practice.practice41;

import java.util.List;

public class Kitchen {
	
	int space; // 평수
	String wallpaperColor; // 벽지 색상
	int floorHeight; // 층고
	
	//Cup cup; // 주방에 컵이 있다
	List<Cup> cupList; // = new ArrayList<Cup>(); 사용할떄 생성
	// 컵이 여러개
	
	List<TrashCan> trashCanList;
	
	Refrigerator ref;	
	Sink sink;
	GasStove gasstove;
}
