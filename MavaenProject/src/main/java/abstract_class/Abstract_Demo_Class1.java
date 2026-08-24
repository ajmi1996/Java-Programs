package abstract_class;

public abstract class Abstract_Demo_Class1 {
	
public abstract void method(String name);// abstract method // hiding implimentation details

public void method1(int a, int b) { //instance method - method 3
	System.out.println(a+b); 
	
}
}


//in abstract class we cant create any object in the parent class instead we are creating it in the child class. 