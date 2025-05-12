package study.practice.practice42;

public class WorkRoom extends Room{
	boolean hasSecuritySystem;
	
	WorkRoom(int roomNumber,String roomName, String purpose, int capacity, boolean hasSecuritySystem){
		super(roomNumber, roomName, purpose, capacity);
		this.hasSecuritySystem = hasSecuritySystem;
	}
}
