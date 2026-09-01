package customer;

public class Offseason {
	public void discount(double price) {
		double discount = price * 15 / 100;
		double finalprice = price - discount;
		System.out.println("Off-season Discount: 15%");
		System.out.println("Final Price: " + finalprice);
	}
	public static void main(String[] args) {
		Onseason on = new Onseason();
		Offseason off = new Offseason();
		
		on.discount(1000);
		off.discount(1000);

	}

}
