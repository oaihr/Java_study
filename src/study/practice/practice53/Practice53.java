package study.practice.practice53;

import java.util.List;

public class Practice53 {

	public static void main(String[] args) {
		
	
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> sList = studentDAO.findStudentList();
		for(StudentDTO s : sList) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------------------------------------------");
		List<StudentDTO> sList2 = studentDAO.findStudentListByGrade(2);
		for(StudentDTO s : sList2) {
			System.out.println(s);
		}
	}

}
