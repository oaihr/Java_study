package study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class StudentDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public StudentMypageDTO findStudentMypageInfoByStudno(int studno) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		// String query = "select * from student";
		String query = " select * from student s, department d "
				+ " where studno = ? "
				+ " AND s.deptno1 = d.deptno ";

		StudentMypageDTO s = null;

		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, studno);
			rs = psmt.executeQuery();

			if (rs.next()) {

				s = new StudentMypageDTO(rs.getInt("studno"), rs.getString("name"), rs.getString("id"), rs.getInt("grade"),
						rs.getString("jumin"), rs.getString("birthday"), rs.getString("tel"), rs.getInt("height"),
						rs.getInt("weight"), rs.getInt("deptno1"), rs.getInt("deptno2"), rs.getInt("profno"));
				
				//department
				s.setDeptno(rs.getInt("deptno"));
				s.setDname(rs.getString("dname"));
				s.setPart(rs.getInt("part"));
				s.setBuild(rs.getString("build"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return s;
	}
	
	
	public StudentDTO findStudentByStudno(int studno) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		// String query = "select * from student";
		String query = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno from student where studno = ?";

		StudentDTO s = null;

		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, studno);
			rs = psmt.executeQuery();

			if (rs.next()) {

				s = new StudentDTO(rs.getInt("studno"), rs.getString("name"), rs.getString("id"), rs.getInt("grade"),
						rs.getString("jumin"), rs.getString("birthday"), rs.getString("tel"), rs.getInt("height"),
						rs.getInt("weight"), rs.getInt("deptno1"), rs.getInt("deptno2"), rs.getInt("profno"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return s;
	}

	public List<StudentDTO> findStudentList() {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		// String query = "select * from student";
		String query = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno from student";

		// List<Dept> deptList = null;
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {

			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

//				if(deptList == null) //반복문 안에 있으니까 계속 초기화되지 않도록 리스트가 빈 경우에만 초기화 하도록!
//					deptList = new ArrayList<Dept>();

				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO Student = new StudentDTO(rs.getInt("studno"), rs.getString("name"), rs.getString("id"),
						rs.getInt("grade"), rs.getString("jumin"), rs.getString("birthday"), rs.getString("tel"),
						rs.getInt("height"), rs.getInt("weight"), rs.getInt("deptno1"), rs.getInt("deptno2"),
						rs.getInt("profno"));
				studentList.add(Student);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
	}

	public List<StudentDTO> findStudentListByGrade(int grade) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno from student where grade = ?";

		// List<Dept> deptList = null;
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {

			psmt = conn.prepareStatement(query);

			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

//				if(deptList == null) //반복문 안에 있으니까 계속 초기화되지 않도록 리스트가 빈 경우에만 초기화 하도록!
//					deptList = new ArrayList<Dept>();

				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO Student = new StudentDTO(rs.getInt("studno"), rs.getString("name"), rs.getString("id"),
						rs.getInt("grade"), rs.getString("jumin"), rs.getString("birthday"), rs.getString("tel"),
						rs.getInt("height"), rs.getInt("weight"), rs.getInt("deptno1"), rs.getInt("deptno2"),
						rs.getInt("profno"));
				studentList.add(Student);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
	}
}
