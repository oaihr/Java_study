package study.practice.practice58;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice58 {

	public static void main(String[] args) throws ParseException {
		String jsonString = "{\r\n"
				+ "\"employees\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"홍길동\",\r\n"
				+ "\"position\": \"개발자\",\r\n"
				+ "\"salary\": 50000,\r\n"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"김철수\",\r\n"
				+ "\"position\": \"디자이너\",\r\n"
				+ "\"salary\": 40000,\r\n"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"company\": {\r\n"
				+ "\"name\": \"주식회사 ABC\",\r\n"
				+ "\"address\": \"서울시 강남구\",\r\n"
				+ "\"established\": \"1990-01-01\",\r\n"
				+ "\"departments\": [\r\n"
				+ "{\r\n"
				+ "\"name\": \"개발부\",\r\n"
				+ "\"employees\": [1, 3, 5]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"name\": \"디자인부\",\r\n"
				+ "\"employees\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "\"projects\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"사내 시스템 개발\",\r\n"
				+ "\"budget\": 100000,\r\n"
				+ "\"team\": [1, 3]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"웹 디자인 프로젝트\",\r\n"
				+ "\"budget\": 80000,\r\n"
				+ "\"team\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";

		JSONParser jsonParser = new JSONParser();
		JSONObject obj = (JSONObject) jsonParser.parse(jsonString);
		
		JSONArray employees = (JSONArray)obj.get("employees");
		System.out.println("직원 목록");
		for(int i=0; i<employees.size(); i++) {
			JSONObject emp = (JSONObject)employees.get(i);
			System.out.println(" id: "+emp.get("id"));
			System.out.println(" name: "+emp.get("name"));
			System.out.println(" position: "+emp.get("position"));
			System.out.println(" salary: "+emp.get("salary"));
			JSONArray skills = (JSONArray)emp.get("skills");
			System.out.println(" skills:");
			for(int j=0; j<skills.size(); j++ ) {
				System.out.println("     "+skills.get(j));
			}
			System.out.println();
		}
		
		JSONObject company = (JSONObject)obj.get("company");
		System.out.println("회사 정보");
		System.out.println(" name: "+company.get("name"));
		System.out.println(" address: "+company.get("address"));
		System.out.println(" established: "+company.get("established"));
		System.out.println(" departments: ");	
		JSONArray depts = (JSONArray)company.get("departments");
		for(int i=0; i<depts.size(); i++) {
			JSONObject dept = (JSONObject)depts.get(i);
			System.out.println("     "+dept.get("name"));
			JSONArray emps = (JSONArray)dept.get("employees");			
			for(int j=0; j<emps.size(); j++) {
				System.out.println("         "+emps.get(j));
			}
		}
		System.out.println();
		
		JSONArray projects = (JSONArray)obj.get("projects");
		System.out.println("프로젝트 목록");
		for(int i=0; i<projects.size(); i++) {
			JSONObject project = (JSONObject)projects.get(i);
			System.out.println(" title: "+project.get("title"));
			System.out.println(" budget: "+project.get("budget"));
			System.out.println(" team: ");
			JSONArray team = (JSONArray)project.get("team");
			for(int j=0; j<team.size(); j++) {
				System.out.println("     "+team.get(j));
			}
		}
	}
	
	
	
}
