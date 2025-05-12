package study.practice.practice42;

public class BreakRoom extends Room{
	boolean hasCoffeeMaker;
	boolean hasSnacks;
	
	BreakRoom(int roomNumber,String roomName, String purpose, int capacity, boolean hasCoffeeMaker, boolean hasSnacks){
		super(roomNumber, roomName, purpose, capacity);
		this.hasCoffeeMaker = hasCoffeeMaker;
		this.hasSnacks = hasSnacks;
	}
}
