package study.practice.practice33;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
//		stu1.major = "Economics";
//		stu1.entryYear = 20;
		stu1.setMajor("Economics");
		stu1.setEntryYear(20);
		
		Student stu2 = new Student();		
		stu2.setMajor("Fine Arts");
		stu2.setEntryYear(25);
	}

}
