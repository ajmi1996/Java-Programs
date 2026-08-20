package encapsulation_demo;

public class Encapsulation_Class {
	private int a; // variables must be private
	private int b;
	public void setmethod(int a, int b) { //Set Method  to set data. using this keyword
	this.a=a;
	this.b=b;
	}
	public void getmethod() { // Get Method to print
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		Encapsulation_Class o=new Encapsulation_Class();
		o.setmethod(4,6);
		o.getmethod();
	}

}
