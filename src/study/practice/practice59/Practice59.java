package study.practice.practice59;

public class Practice59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderService s = new OrderService();
		OrderInfoDTO info = s.getOrderInfo();
		System.out.println(info);
	}

}
