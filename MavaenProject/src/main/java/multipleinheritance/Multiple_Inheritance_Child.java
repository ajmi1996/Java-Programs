package multipleinheritance;

public class Multiple_Inheritance_Child implements Multiple_Inheritance_P1 ,Multiple_Inheritance_P2 {
	public void method(String name) { // method
		System.out.println(name);
	}

	public static void main(String[] args) {
		Multiple_Inheritance_Child obj=new Multiple_Inheritance_Child();
		obj.add("Txxxx");
		obj.sub(3,4.1f);
		obj.method("Ajjjj");

	}

	@Override
	public void sub(int x, float y) {
		System.out.println(x+y);
		
	}

	@Override
	public void add(String place) {
		System.out.println(place);
		
	}

}
