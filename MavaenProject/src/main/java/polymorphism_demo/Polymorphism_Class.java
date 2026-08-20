package polymorphism_demo;

public class Polymorphism_Class {
	public void method1() {
	System.out.println("Hello");
	}
	public void method1(int a, int b) {
		int x=a+b;
		System.out.println(x);
	}
	public void method1(String address, int hno) {
		address="abc";
		hno=209;
		System.out.println(address + " " + hno);
	}
	public static void main(String[] args) {
		Polymorphism_Class o=new Polymorphism_Class();
		o.method1();
		o.method1(6,8);
		o.method1("abc",209);

	}

}
