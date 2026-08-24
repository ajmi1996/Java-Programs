package abstract_class;

public class Abstract_demo_Class2 extends Abstract_Demo_Class1{

	public static void main(String[] args) {
		Abstract_demo_Class2 o=new Abstract_demo_Class2();
		o.method("Ajmi");
		o.add();
		o.method1(5,5); // calling method 3- from parent class

	}
// overriding abstract method -method 1
	@Override //essential details are passing in this section done throught overriding
	public void method(String name) {
		System.out.println(name);
	}
// another method		- method 2
		public void add() {
			System.out.println("Hello");
		}
		
		
	}



	


