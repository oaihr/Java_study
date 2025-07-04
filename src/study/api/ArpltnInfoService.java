package study.api;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ArpltnInfoService {
	
	private String requestApi_getMinuDustWeek() throws Exception {
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Zj0qcc5GQJyWZCHB4jwrs1qPclMhnPqcDTeqrH4ayvIxK2RvkM%2B5eodLwpWVkdoVSjzohFMzrqVdfO5MLJoOyQ%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode("2025-06-27", "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        return sb.toString();
	}
	
	public MinuDustWeekDTO getMinuDustWeek() {
		
		MinuDustWeekDTO mdwDTO = null;
		
		try {
			//String jsonText = requestApi_getMinuDustWeek();
			String jsonText = "{\"response\":{\"body\":{\"totalCount\":1,\"items\":[{\"frcstFourDt\":\"2025-06-27\",\"frcstThreeDt\":\"2025-06-26\",\"frcstTwoCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"gwthcnd\":\"[6월24일~27일] 원활한 대기 확산과 강수(25일, 27일)의 영향으로 전 권역에서 초미세먼지 농도가 '낮음' 수준일 것으로 예상됩니다.\",\"frcstTwoDt\":\"2025-06-25\",\"frcstFourCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"frcstThreeCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"frcstOneDt\":\"2025-06-24\",\"frcstOneCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"presnatnDt\":\"2025-06-21\"}],\"pageNo\":1,\"numOfRows\":100},\"header\":{\"resultMsg\":\"NORMAL_CODE\",\"resultCode\":\"00\"}}}\r\n";
			
			// 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonText);
			
			JSONObject response = (JSONObject)jsonObj.get("response");			
			JSONObject body = (JSONObject)response.get("body");			
			JSONArray items = (JSONArray)body.get("items");
			JSONObject item = (JSONObject)items.get(0);					
			
			JSONObject header = (JSONObject)response.get("header");
			
			
			// DTO 옮겨담고
			mdwDTO = new MinuDustWeekDTO();
//			mdwDTO.setTotalCount(((Long)body.get("totalCount")).intValue());
//			mdwDTO.setFrcstOneCn((String)item.get("frcstOneCn"));
//			mdwDTO.setFrcstOneDt((String)item.get("frcstOneDt"));
//			mdwDTO.setFrcstTwoCn((String)item.get("frcstTwoCn"));
//			mdwDTO.setFrcstTwoDt((String)item.get("frcstTwoDt"));
//			mdwDTO.setPresnatnDT((String)item.get("presnatnDT"));			
			
			mdwDTO.setTotalCount( objectToInt(body.get("totalCount")) );
			mdwDTO.setFrcstOneCn( valueToString(item.get("frcstOneCn")) );
			mdwDTO.setFrcstOneDt( valueToString(item.get("frcstOneDt")) );
			mdwDTO.setFrcstTwoCn( valueToString(item.get("frcstTwoCn")) );
			mdwDTO.setFrcstTwoDt( valueToString(item.get("frcstTwoDt")) );
			mdwDTO.setPresnatnDT( valueToString(item.get("presnatnDT")) );
			
		} catch (Exception e) {
			
		}
		
		return mdwDTO;
	}
	
	public int objectToInt(Object obj) {
		return Integer.parseInt( obj.toString());
	}
	public String valueToString(Object obj) {
		if(obj == null)		//null로 되어있을 경우 방지
			return null;
		else 
			return obj.toString();
		
		// return obj == null ? null : obj.toString();
	}
}
