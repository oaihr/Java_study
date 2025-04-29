package study.practice.practice27;

public class Person {
	
	//필드
	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String bloodType;
	String healthCondition;
	boolean sleepingOrNot;
	
	//생성자
	Person(){
		
	}
	
	Person(String name, String gender, int age, double height, double weight, String job, 
			String bloodType, String healthCondition, boolean sleepingOrNot ){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.healthCondition = healthCondition;
		this.sleepingOrNot = sleepingOrNot;		
		
	}
	
	//메소드
	// 매개변수 없음 
	void printPersonInfo(){
		System.out.println("이름: "+name);
		System.out.println("성별: "+gender);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
		System.out.println("직업: "+job);
		System.out.println("혈액형: "+bloodType);
		System.out.println("건강상태: "+healthCondition);
		System.out.println("수면 중 여부: "+(sleepingOrNot? "깨어있음" : "자는중"));
		System.out.println();
	}
	
}
