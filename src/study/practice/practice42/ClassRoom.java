package study.practice.practice42;

public class ClassRoom extends Room{
	boolean hasProjector;
	boolean hasBlackboard;
	
	ClassRoom(int roomNumber,String roomName, String purpose, int capacity, boolean hasProjector, boolean hasBlackboard){
		super(roomNumber, roomName, purpose, capacity);
		this.hasProjector = hasProjector;
		this.hasBlackboard = hasBlackboard;
	}
}
