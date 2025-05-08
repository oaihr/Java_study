package study.inherit.inherit01;

public class InheritMain {

	public static void main(String[] args) {
		
		//Parent p1 = new Parent();
		Parent p1 = new Parent(100);
		p1.say();
		p1.money = 100;
		
// 자식 객체를 생성하면 부모 객체가 먼저 생성되고 자식 객체가 생성 
		Child c1 = new Child();
		c1.money = 200;
		c1.say();	// 상속받음
		
		Child c2 = new Child(5000);
		// 받은 5000으로 부모 객체 생성 후 자식 객체 c2생성
		c2.play();
		
		Child c3 = new Child(2000, 4, "소소초등학교");
		c3.say();
		c3.play();
		c3.printInfo();
		
		c3.donate();
		
		//c3.nightSnack();  private 
		
	}

}
