package study.practice.practice51;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v1.Dept;

public class Practice51 {

	public static void main(String[] args) {
		
		ProductDTO productDTO = findProductByPcode(101);
		if (productDTO != null) {
			//System.out.println(productDTO.getPcode() + " " + productDTO.getPname() + " " + productDTO.getpPrice());
			System.out.printf("%d %s %d \n", productDTO.getPcode(), productDTO.getPname(), productDTO.getpPrice());
		}
		
		if (productDTO == null) {
			System.out.println("조회된 데이터가 없음");
		}
		
		List<ProductDTO> productList = findProductDTOList();
		if (productList != null) {

			for (ProductDTO p : productList) {
				//System.out.println(p.getPcode() + " " + p.getPname() + " " + p.getpPrice());
				System.out.printf("%d %s %d \n", p.getPcode(), p.getPname(), p.getpPrice());
			}

		}
		
		if (productList == null)
			System.out.println("리스트가 없다 == 데이터가 없다");		
		
	}
	
	public static ProductDTO findProductByPcode(int pcode) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String query = "select * from product where p_code = ?";
		
		ProductDTO productDTO = null;
		
		try {
			
			psmt = conn.prepareStatement(query);
			
			psmt.setInt(1, pcode);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				productDTO = new ProductDTO(rs.getInt("P_CODE"), rs.getString("P_NAME"), rs.getInt("P_PRICE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productDTO;
		
		
	}
	
	public static List<ProductDTO> findProductDTOList() {

		// OracleDB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 쿼리 준비
		String query = "select * from product";

		// List<Dept> deptList = null;
		List<ProductDTO> productList = new ArrayList<ProductDTO>();

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

//				if(deptList == null) //반복문 안에 있으니까 계속 초기화되지 않도록 리스트가 빈 경우에만 초기화 하도록!
//					deptList = new ArrayList<Dept>();

				// 해당 행에 컬럼 단위로 데이터 접근
				ProductDTO productDTO = new ProductDTO(rs.getInt("P_CODE"), rs.getString("P_NAME"), rs.getInt("P_PRICE"));
				productList.add(productDTO);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB연결 종료

		try {

			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return productList;
	}
}
