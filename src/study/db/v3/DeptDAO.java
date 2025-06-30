package study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;

public class DeptDAO {
	// DAO (Data Access Object) 데이터에 접근하는 역할

	// DB연결 및 사용시 필요한 객체 -> 필드변수로 선언
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결 후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체

	public Dept findDeptByDeptno(int deptno) {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		//String query = "select * from dept where deptno = ? ";
		String query = "select * from new_dept where deptno = ? ";

		Dept dept = null;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체

			// 파라미터 세팅
			psmt.setInt(1, deptno); // 쿼리에 있는 첫번째 ? 위치에 deptno를 세팅하겠다
			// psmt.setString(2, "1231");

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs에 담겨져있는 쿼리 수행결과 확인
			if (rs.next()) { // 읽어올 데이터가 1개만 있는 경우? if를 쓰기도함

				dept = new Dept();

				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		return dept;

	}

	public Dept findDeptByDname(String dname) {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from dept where dname = ? ";

		Dept dept = null;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체

			// 파라미터 세팅
			psmt.setString(1, dname); // 쿼리에 있는 첫번째 ? 위치에 dname를 세팅하겠다
			// psmt.setString(2, "1231");

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs에 담겨져있는 쿼리 수행결과 확인
			if (rs.next()) { // 읽어올 데이터가 1개만 있는 경우? if를 쓰기도함

				dept = new Dept();

				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return dept;

	}

	// findDeptAll
	public List<Dept> findDeptList() {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from dept";

		// List<Dept> deptList = null;
		List<Dept> deptList = new ArrayList<Dept>();

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

//				if(deptList == null) //반복문 안에 있으니까 계속 초기화되지 않도록 리스트가 빈 경우에만 초기화 하도록!
//					deptList = new ArrayList<Dept>();

				// 해당 행에 컬럼 단위로 데이터 접근
				Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"));
				deptList.add(dept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return deptList;
	}

	// insert
	public int saveDept(int deptno, String dname, String loc) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "INSERT INTO new_dept VALUES(?, ?, ?) ";

		int result = 0;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체

			// 파라미터 세팅
			psmt.setInt(1, deptno);
			psmt.setString(2, dname);
			psmt.setString(3, loc);

			// psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // catch에서 throw가 있으면 db연결 종료가 안되고 끝날 수 있기 때문에 finally 사용
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	public int saveDept(Dept dept) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "INSERT INTO new_dept VALUES(?, ?, ?) ";

		int result = 0;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체

			// 파라미터 세팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());

			// psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // catch에서 throw가 있으면 db연결 종료가 안되고 끝날 수 있기 때문에 finally 안에
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	// update
	public int modifyDept(Dept dept) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = " UPDATE new_dept "
				+ " SET dname = ? , loc = ? "
				+ " WHERE deptno = ? ";

		int result = 0;

		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체
			
			// 파라미터 세팅
			psmt.setString(1, dept.getDname());		
			psmt.setString(2, dept.getLoc());			
			psmt.setInt(3, dept.getDeptno());			
			
			
			// psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)
			
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} finally { // catch에서 throw가 있으면 db연결 종료가 안되고 끝날 수 있기 때문에 finally 안에
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}

	// delete
	public int removeDept(int deptno) {
		
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = " DELETE new_dept "
					 + " WHERE deptno = ? ";

		int result = 0;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비 객체

			// 파라미터 세팅
			psmt.setInt(1, deptno);
			

			// psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // catch에서 throw가 있으면 db연결 종료가 안되고 끝날 수 있기 때문에 finally 안에
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	public int removeDept(Dept dept) {	// deptno를 매개변수(만 다르니까)로 받는 위 메소드를 이용하기
		int deptno = dept.getDeptno();
		return removeDept(deptno);		
	}

}
