package polymorphism_demo;

public class RunT_Polymorphism_Child extends RunT_Polymorphism_Parent{
	public void method1(int a, int b) { //Method overriding
		super.method1(2,4); //executing parent class ....Super keyword is only only used in method overriding
		int x=a+b;
		System.out.println(x);
	}
	public static void main(String[] args) { //Executing child class method in 2 ways
		RunT_Polymorphism_Child ob= new RunT_Polymorphism_Child();
		ob.method1(2,3);
		
		RunT_Polymorphism_Parent obj=new RunT_Polymorphism_Child(); // Upcasting
		ob.method1(5,6);
	}

}
