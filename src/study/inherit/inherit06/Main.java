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
		return new Bus();
//		return new Taxi();
	}
	
	
}
