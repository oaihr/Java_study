package study.iface.interface02;

import java.util.ArrayList;
import java.util.List;

public class Inter02Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.c = new ApplePhone();
		p.call("1432");
		
		p.c = new SamsungPhone();
		p.call("6435");
		
		List<Callable> cList = new ArrayList<Callable>();
		cList.add(new ApplePhone());
		cList.add(new SamsungPhone());
		
		for(Callable c : cList) {
			c.call();
		}
		
		
		List<Connectable> bList = new ArrayList<Connectable>();
		bList.add(new SamsungPhone());
		bList.add(new BluetoothSpeaker());
		
		for(int i=0; i<bList.size(); i++) {
			bList.get(i).connect();
		}
	}

}
