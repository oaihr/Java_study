package study.practice.practice55;

public class StudentDTO {
	int studno;
	String name;
	String id;
	int grade;
	String jumin;
	String birthday;
	String tel;
	int height;
	int weight;
	int deptno1; // 기본값: 0 무조건 숫자 값을 가져야함
	//int deptno2; // 기본값: null Nullable, 값이 null일 수 도 있다.
	Integer deptno2;
	//Integer -> int 타입의 wrapper 클래스
	int profno;
	
	int total;
	String hakjum;
	
	public StudentDTO() {}
	public StudentDTO(int studno, String name, int total, String hakjum) {
		super();
		this.studno = studno;
		this.name = name;
		this.total = total;
		this.hakjum = hakjum;
	}

	public StudentDTO(int studno, String name, String id, int grade, String jumin, String birthday, String tel, int height,
			int weight, int deptno1, int deptno2, int profno) {
		super();
		this.studno = studno;
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.jumin = jumin;
		this.birthday = birthday;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
	}

	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDeptno1() {
		return deptno1;
	}

	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}

	public Integer getDeptno2() {
		return deptno2;
	}

	public void setDeptno2(Integer deptno2) {
		this.deptno2 = deptno2;
	}

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}
	
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getHakjum() {
		return hakjum;
	}

	public void setHakjum(String hakjum) {
		this.hakjum = hakjum;
	}

	@Override
	public String toString() {
		return "StudentDTO [studno=" + studno + ", name=" + name + ", total=" + total + ", hakjum=" + hakjum + "]";
	}

	
}
