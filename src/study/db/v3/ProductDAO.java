package study.db.v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;	//DB 연결과 종료 manager
import study.db.v3.ProductDTO;

public class ProductDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public ProductDTO findProductByPcode(int pcode) {

		conn = DBConnectionManager.connectDB();
		
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
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return productDTO;
		
		
	}
	
	public List<ProductDTO> findProductDTOList() {

		conn = DBConnectionManager.connectDB();

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

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return productList;
	}
}
