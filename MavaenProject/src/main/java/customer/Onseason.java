package customer;

public class Onseason {
	public void discount(double price) {
		double discount = price * 40 / 100;
		double finalprice = price - discount;
		System.out.println("On-season Discount: 40%");
		System.out.println("Final Price: " + finalprice);
	}


}
