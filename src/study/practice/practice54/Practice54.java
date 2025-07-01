package study.practice.practice54;

public class Practice54 {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();
		
		StudentDTO s = new StudentDTO();
		s.setStudno(9232);
		s.setName("Charlotte Aitchison");
		s.setId("Charlixcx");
		s.setGrade(3);
		s.setJumin("9208022450332");
		s.setBirthday("92/08/02");
		s.setTel("064) 322-3486");
		s.setHeight(160);
		s.setWeight(50);
		s.setDeptno1(101);
		s.setDeptno2(203);
		s.setProfno(2001);
		
		int rs = studentDAO.saveStudent(s);
		if(rs > 0) {
			System.out.println("새로운 학생 정보 저장 완료!");
		}
		
		StudentDTO s2 = new StudentDTO();
		s2.setStudno(9932);
		s2.setName("name2");
		s2.setId("id2");
		s2.setGrade(3);
		s2.setJumin("9908022450332");
		s2.setBirthday("99/08/02");
		s2.setTel("031) 322-3486");
		s2.setHeight(160);
		s2.setWeight(50);
		s2.setDeptno1(101);
		s2.setDeptno2(null); //Integer를 이용해서 null을 넣을 수 있음
		s2.setProfno(2001);
		
		int rs2 = studentDAO.saveStudent(s2);
		if(rs2 > 0) {
			System.out.println("새로운 학생 정보 저장 완료!");
		}
	}

}
