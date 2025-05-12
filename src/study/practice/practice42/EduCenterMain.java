package study.practice.practice42;

import java.util.Arrays;

public class EduCenterMain {
	
	public static void main(String[] args) {
		EduCenter edu1 = new EduCenter();
	
		edu1.staffList.addAll(Arrays.asList(
				 new Staff("가나다", "회계", "abc@naver.com", "01012345678"),
				 new Staff("라마바", "교육생관리", "def@daum.net", "01098765432")
		));
		
		edu1.roomList.addAll(Arrays.asList(
				 new ClassRoom(1, "강의실", "강의용", 20, true, true),
				 new BreakRoom(2, "휴게실", "휴게용", 10, false, false),
				 new WorkRoom(3, "사무실", "사무용", 5, true)
		));
	}
}
