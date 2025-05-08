package study.inherit.inherit01;
					// Parent 상속, 상속은 하나만!
public class Child extends Parent{
	int grade; // 학년
	String school; // 학교명
	
	// 기본 생성자
	// public Child(){}
	public Child(){
		// 상속받은 부모클래스 생성자
		// super(); 부모생성자
		super(0);		
		
		// 자식에서 해야할 일
		// this(); // 자기자신의 다른 생성자
	}
	
	public Child(int money){
		super(money);
		
	}
	
	public Child(int grade, String school){
		super(0); // 부모 먼저 생성		
		this.grade = grade;
		this.school = school;
		
	}
	public Child(int money, int grade, String school){
		super(money); // 부모 먼저 생성		
		this.grade = grade;
		this.school = school;
		
	}
	
	public void play() {
		System.out.println("놀고싶어");
	}
	
	public void printInfo() {
		System.out.println(grade+"학년 "+school+"다님 돈:"+money);
		System.out.println("나이 "+age);
	}
	
	public void say() {	// 메서드 오버라이딩(재정의)
		System.out.println("아이가 하는 말");
	}
	
//	public void donate() {	// 메서드 오버라이딩
//		System.out.println("한달에 10만원 기부");
//	}
}
