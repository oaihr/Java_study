package study.practice.practice43;

public class Menu {
	String name;
	int price;
	int stockQty;
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void setStockQty(int qty) {	// 재고 설정
		stockQty = qty;
	}
	
	 public String getName() { return name; }
	 public int getPrice() { return price; }
	 public int getStockQty() { return stockQty; }
	 
	 public String getMenuInfo() {
		 return String.format(" %s 가격:%d원 재고:%d", name, price, stockQty);
	 }
}
