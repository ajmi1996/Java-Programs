package single_inheritance;

import public_access_modifier.Public_Class;

public class Child extends Parent{
	public void demo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		//calling a public method from another package
		Public_Class o=new Public_Class();
		o.add();
	Child obj = new Child();
	obj.method(10,20);
	obj.demo("ajmi",29);
	}
}
