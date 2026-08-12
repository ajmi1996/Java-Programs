package single_inheritance;

public class Child extends Parent{
	public void demo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
	Child obj = new Child();
	obj.method(10,20);
	obj.demo("ajmi",29);
	}
}
