package study.practice.practice57;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice57 {

	public static void main(String[] args) throws ParseException {
		String jsonString = "{\r\n"
				+ "\"도서관\": {\r\n"
				+ "\"위치\": \"서울특별시 강남구\",\r\n"
				+ "\"운영시간\": {\r\n"
				+ "\"평일\": [\"09:00\", \"21:00\"],\r\n"
				+ "\"주말\": [\"10:00\", \"18:00\"]\r\n"
				+ "},\r\n"
				+ "\"책목록\": [\r\n"
				+ "{\r\n"
				+ "\"제목\": \"자바 프로그래밍\",\r\n"
				+ "\"저자\": \"홍길동\",\r\n"
				+ "\"출판연도\": 2023,\r\n"
				+ "\"가격\": 25000,\r\n"
				+ "\"대출가능\": true,\r\n"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"제목\": \"데이터 분석 입문\",\r\n"
				+ "\"저자\": \"김철수\",\r\n"
				+ "\"출판연도\": 2022,\r\n"
				+ "\"가격\": 28000,\r\n"
				+ "\"대출가능\": false,\r\n"
				+ "\"카테고리\": [\"데이터\", \"분석\"]\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"특별서비스\": {\r\n"
				+ "\"키오스크\": true,\r\n"
				+ "\"스터디룸\": {\r\n"
				+ "\"개수\": 5,\r\n"
				+ "\"예약 가능\": true,\r\n"
				+ "\"비용\": {\r\n"
				+ "\"1시간당\": 5000,\r\n"
				+ "\"하루\": 30000\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "}";

		// jsonString 텍스트 데이터 -> JSON 파싱

		// json-simple 라이브러리

		// JSONObject 	{
		// JSONArray 	[
		// 변수.get("키") key:value

		JSONParser jsonParser = new JSONParser();
		JSONObject obj = (JSONObject) jsonParser.parse(jsonString);
		// 최초 최상단 { 에 해당하는 객체 타입 -> JSONObject			
		
		JSONObject lib = (JSONObject)obj.get("도서관");
		// 최상단 객체의 입장을 기준으로 보면, 키 값은 "도서관" 밖에 없음
		// "도서관"이라는 키 값으로 접근하면 value가 { 로 시작함 -> 객체임 -> JSONObject
		/*
		  { 
		  
		  	"도서관": {} 
		  	
		  }
		 */
		
		System.out.println("위치: " + lib.get("위치"));		
		System.out.println("");
		
		JSONObject oHours = (JSONObject) lib.get("운영시간");
		System.out.println("운영시간");
		JSONArray weekDays = (JSONArray) oHours.get("평일");
		String weekDaysOpen = (String)weekDays.get(0);
		String weekDaysClose = (String)weekDays.get(1);
		System.out.println(" 평일: "+weekDaysOpen+"~"+weekDaysClose );
		JSONArray weekEnd = (JSONArray) oHours.get("주말");
		String weekEndOpen = (String)weekEnd.get(0);
		String weekEndClose = (String)weekEnd.get(1);
		System.out.println(" 주말: "+weekEndOpen+"~"+weekEndClose );
		System.out.println("");
		
		JSONArray bookList = (JSONArray) lib.get("책목록");
		
		for(int i=0; i<bookList.size(); i++) {
			JSONObject book = (JSONObject) bookList.get(i);
			System.out.println("책 목록:");
			System.out.println(" 책"+(i+1));
			System.out.println("  제목: "+book.get("제목"));
			System.out.println("  저자: "+book.get("저자"));
			System.out.println("  출판연도: "+book.get("출판연도"));
			System.out.println("  가격: "+book.get("가격"));
			System.out.println("  대출가능: "+book.get("대출가능"));
			
			JSONArray bookCategory = (JSONArray)book.get("카테고리");
			System.out.println("  카테고리");
			for(int j=0; j<bookCategory.size(); j++) {
				System.out.println("     "+bookCategory.get(j));
			}
			
		}		
		
		System.out.println("");
		
		JSONObject service = (JSONObject) lib.get("특별서비스");
		System.out.println("특별서비스");
		System.out.println(" 키오스크: "+service.get("키오스크") );
		JSONObject studyRoom = (JSONObject)service.get("스터디룸");
		System.out.println(" 스터디룸");
		System.out.println("  개수:"+studyRoom.get("개수"));
		System.out.println("  예약 가능:"+studyRoom.get("예약 가능"));
		JSONObject studyRoomPrice = (JSONObject)studyRoom.get("비용");
		System.out.println("  비용");
		System.out.println("   1시간당: "+studyRoomPrice.get("1시간당"));
		System.out.println("   하루: "+studyRoomPrice.get("하루"));
		
	}


}
