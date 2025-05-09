package study.inherit.inherit06;

public class Driver {
//	public void drive(Bus bus) {	//오버로딩
//		System.out.println("Driver 운전 시작");
//		bus.run();
//	}
//	public void drive(Taxi taxi) {	//오버로딩
//		System.out.println("Driver 운전 시작");
//		taxi.run();
//	}
					// Vehicle vehicle = t; 가능
					// Vehicle vehicle = b; 가능
	public void drive(Vehicle vehicle) {//매개변수 다형성
		System.out.println("Driver 운전 시작");
		vehicle.run();
	}
}
