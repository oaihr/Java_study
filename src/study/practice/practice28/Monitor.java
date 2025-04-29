package study.practice.practice28;

public class Monitor {

	int inch;
	String mfr;
	String model;
	
	Monitor(int inch, String mfr, String model){
		this.inch = inch;
		this.mfr = mfr;
		this.model = model;
	}
	
	void printInfo(){
		System.out.print("제조사:"+mfr+" ");
		System.out.print("모델명:"+model+" ");
		System.out.print("인치:"+inch+"인치");
		System.out.println();
	}
}
