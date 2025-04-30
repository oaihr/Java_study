package study.practice.practice29;

public class TV {
	
	String mfr;
	int releaseYear;
	int inch;
	
	TV(String mfr, int releaseYear, int inch){
		this.mfr = mfr;
		this.releaseYear = releaseYear;
		this.inch = inch;
	}
	
	void show(){
		System.out.printf("%s제품 %d년형 %d인치 TV\n", mfr, releaseYear, inch);
	}
}
