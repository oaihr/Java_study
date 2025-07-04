package study.practice.practice59;

public class ItemDTO {
	int id;
	String name;
	int qty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", qty=" + qty + "]";
	}
	
	
}
