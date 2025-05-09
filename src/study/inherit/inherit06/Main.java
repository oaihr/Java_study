package study.inherit.inherit06;

public class Main {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Bus b2 = takeBus();
		Taxi t2 = takeTaxi();
		
		// Bus b3 = takeTaxi();
		// int b3 = "abc";
		
		Vehicle v1 = takeTaxi();
		Vehicle v2 = new Taxi();
		Vehicle v3 = takeBus();	
		
		//Bus b4 = takeVehicle();	// takeVehicle()의 리턴 타입이 Vehicle이라 안됨
		// Bus   = Vehicle
		Vehicle v4 = takeVehicle();
		
//		===========================================================================
		
		Vehicle vv = new Vehicle();
		
		Vehicle vv2 = new Bus(); //자동 타입 변환
		//vv2.run();    O
		//vv2.start();  X
		Bus bb = new Bus();
		bb.run();
		bb.start();
		
		Bus bb2 = (Bus)vv2;
		bb2.start();
		
		
//		Bus bb3 = (Bus)vv;
//		bb3.start();	// 안됨
		
//		===========================================================================
		Vehicle vv4 = takeVehicle();
		
		if(vv4 instanceof Bus) {
			Bus bbb = (Bus)vv4;
			System.out.println("Bus가 들어있음");
		}
		if(vv4 instanceof Taxi) {
			Taxi ttt = (Taxi)vv4;
			System.out.println("Taxi가 들어있음");
		}
		//Bus bbb = (Bus)vv4;
		//bbb.start();
		
		
	}

	public static Bus takeBus() {		
		//Bus b = new Bus();
		return new Bus();		
	}
	
	public static Taxi takeTaxi() {
		//Taxi t = new Taxi();
		return new Taxi();
	}
	
	public static Vehicle takeVehicle() {		
//		return new Vehicle();
//		return new Bus();
//		return new Taxi();
		
		int n = (int)(Math.random()*2) + 1;
		if(n == 1) 
			return new Bus();
		else
			return new Taxi();
		
	}
	
	
}
