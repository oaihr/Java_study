package study.practice.practice27;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "홍길동";
		System.out.println("이름: "+p1.name);

		
		p1.gender = "남";
		System.out.println("성별: "+p1.gender);
		
		
		p1.age = 99;
		System.out.println("나이: "+p1.age);
		
		
		p1.height = 200;
		System.out.println("키: "+p1.height);
		
		
		p1.weight = 120;
		System.out.println("몸무게: "+p1.weight);
		
		
		p1.job = "의적";
		System.out.println("직업: "+p1.job);
		
		
		p1.bloodType = "ABO";
		System.out.println("혈액형: "+p1.bloodType);
		
		
		p1.healthCondition = "매우 건강";
		System.out.println("건강상태: "+p1.healthCondition);
		
		
		p1.sleepingOrNot = true;
		System.out.println("수면 중 여부: "+(p1.sleepingOrNot? "깨어있음" : "자는중"));
		System.out.println();
		
		Person p2 = new Person("오리", "여", 2, 20, 5, "고양이", "AB", "건강", false);
		
		p1.printPersonInfo();
		p2.printPersonInfo();
		
		Person p3 = new Person();
		p3.printPersonInfo();
		
	}

}
