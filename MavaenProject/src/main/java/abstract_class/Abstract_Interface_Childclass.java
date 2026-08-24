package abstract_class;

public class Abstract_Interface_Childclass implements Abstract_Interface_Demo{
	
	public void add(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Abstract_Interface_Childclass obj = new Abstract_Interface_Childclass();
		obj.method("xyz");
		obj.method1(3,6);
		obj.add("ajmi", 29);

	}

	@Override
	public void method(String address) {
		System.out.println(address);
		
	}

	@Override
	public void method1(int a, int b) {
		System.out.println(a+b);
		
	}

}
