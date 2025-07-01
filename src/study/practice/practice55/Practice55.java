package study.practice.practice55;

import java.util.List;

public class Practice55 {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> sList = studentDAO.findStudentListScoreHakjumByDeptno(101);
		for(StudentDTO s : sList)
			System.out.println(s);
	}

}
