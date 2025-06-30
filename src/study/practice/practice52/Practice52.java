package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import study.db.v2.DBConnectionManager;


public class Practice52 {

	public static void main(String[] args) {
		
		List<Professor> pList = findProfessorListByDeptno(102);
		if (pList == null)
			System.out.println("리스트가 없다 == 데이터가 없다");

		if (pList.size() == 0)
			System.out.println("리스트가 비어있다");

		if (pList != null) {

			for (Professor p : pList) {
				System.out.println(p);
			}
		}
	}
	
	public static List<Professor> findProfessorListByDeptno(int deptno) {

		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null; 

		conn = DBConnectionManager.connectDB();

	
		String query = "select * from professor where deptno = ? ";

		List<Professor> professorList = new ArrayList<Professor>();

		try {

			psmt = conn.prepareStatement(query); 

			psmt.setInt(1, deptno); 

			rs = psmt.executeQuery(); 

		
			while (rs.next()) { 

				Professor p = new Professor(rs.getInt("PROFNO"), rs.getString("NAME"), rs.getString("ID"), rs.getString("POSITION"), rs.getInt("PAY"), rs.getInt("DEPTNO") );

				professorList.add(p);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		return professorList;

	}
}
