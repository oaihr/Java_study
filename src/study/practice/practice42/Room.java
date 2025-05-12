package study.practice.practice42;

public class Room {
	int roomNumber;
	String roomName;	// 방 이름
	String purpose;		// 용도
	int capacity;		// 최대 수용 인원
	
	Room(int roomNumber,String roomName, String purpose, int capacity){
		this.roomNumber = roomNumber;
		this.roomName = roomName;
		this.purpose = purpose;
		this.capacity = capacity;
	}
	
	
}
