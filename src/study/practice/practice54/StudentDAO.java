package study.practice.practice54;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;


public class StudentDAO {
	
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 
	
	
	
	public int saveStudent(StudentDTO student) {
		conn = DBConnectionManager.connectDB();

		String query = "INSERT INTO STUDENT VALUES(?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ?) ";

		int result = 0;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체

			// 파라미터 세팅
			psmt.setInt(1, student.getStudno());
			psmt.setString(2, student.getName());
			psmt.setString(3, student.getId());
			psmt.setInt(4, student.getGrade());
			psmt.setString(5, student.getJumin());
			psmt.setString(6, student.getBirthday());
			psmt.setString(7, student.getTel());
			psmt.setInt(8, student.getHeight());
			psmt.setInt(9, student.getWeight());
			psmt.setInt(10, student.getDeptno1());
			
			//student.getDeptno2() : null이면 안맞음
			//psmt.setInt(11, student.getDeptno2());
			if(student.getDeptno2() == null)
				psmt.setNull(11, Types.INTEGER);
			else
				psmt.setInt(11, student.getDeptno2());
			
			psmt.setInt(12, student.getProfno());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
	
}
