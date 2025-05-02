package study.practice.practice33;

public class Student {
	
//	다음을 만족하는 Student 클래스를 작성하시오.
//	· String 형의 학과와 정수형의 학번을 필드로 선언
//	· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//	학과와 학번 필드에 적당한 값을 입력 후 출력
//	기능 추가.
//	· 필드를 모두 private 로 하고, getter 와 setter 를 구현하고
//	· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//	setter 를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
	
	//필드
	private String major;
	private int entryYear;
	
	//getter와 setter
		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
			System.out.println(major);
		}

		public int getEntryYear() {
			return entryYear;
		}

		public void setEntryYear(int entryYear) {
			this.entryYear = entryYear;
			System.out.println(entryYear);
		}
		
	//main
	public static void main(String[] args) {
		
		Student stu1 = new Student();
//		stu1.major = "Economics";
//		stu1.entryYear = 20;
		stu1.setMajor("Economics");
		stu1.setEntryYear(20);
		
		System.out.println(stu1.major);
		System.out.println(stu1.entryYear);
		
		Student stu2 = new Student();		
		stu2.setMajor("Fine Arts");
		stu2.setEntryYear(25);
		
	}
	
}
