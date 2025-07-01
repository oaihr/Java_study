package study.practice.practice55;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;
import study.db.v4.StudentMypageDTO;
import study.practice.practice55.StudentDTO;

public class StudentDAO {
	
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 

	
	
	public List<StudentDTO> findStudentListScoreHakjumByDeptno(int deptno) {
		conn = DBConnectionManager.connectDB();
		
		String query = " select st.studno AS STUDNO, st.name AS NAME, sc.total AS TOTAL, hj.grade AS HAKJUM "
				+ " from student st, score sc, hakjum hj "
				+ " where st.studno = sc.studno "
				+ "        AND "
				+ "      sc.TOTAL BETWEEN hj.MIN_POINT AND hj.MAX_POINT "
				+ "        AND "
				+ "      st.DEPTNO1 = ? ";
			
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();

			while (rs.next()) {

				StudentDTO s = new StudentDTO(rs.getInt("STUDNO"), rs.getString("NAME"), rs.getInt("TOTAL"), rs.getString("HAKJUM"));
				
				studentList.add(s);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return studentList;
	}
	
	
}
