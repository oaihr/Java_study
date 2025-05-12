package study.practice.practice41;

public class TrashCan extends Stuff{
	
	int capacityLitter;	
	boolean isOpen;
	int trashDummy;
	
	
	TrashCan(int litter, String color){
		this.capacityLitter = litter;
		this.color = color;
	}
	
	//용량이 몇퍼센트나 찼는지
	public void howFullIsTrashCan() {
		System.out.println((double)trashDummy / capacityLitter * 100);
	}
	
	//쓰레기통을 연다	
	public void open() {
		isOpen = true;
		System.out.println("쓰레기 통이 열렸습니다.");
	}
	
	//쓰레기통을 닫는다
	public void close() {
		isOpen = false;
		System.out.println("쓰레기 통이 닫혔습니다.");
	}
	
	//쓰레기를 채운다
	public void throwAway(int trashDummy) {
		if(capacityLitter < trashDummy) {
			System.out.println("쓰레기 통이 가득 찼습니다.");
		}
		this.trashDummy += trashDummy;
	}
	//쓰레기통을 비운다
	public void emptyTrashCan() {
		trashDummy = 0; 
	}
}
