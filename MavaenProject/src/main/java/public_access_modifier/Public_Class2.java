package public_access_modifier;

import default_access_modifier.Default_Class_Demo;

public class Public_Class2 {

	public static void main(String[] args) {
		Public_Class o=new Public_Class();
		o.add();//same package....//calling a public method from same package (another class).
		/*Default_Class_Demo s=new Default_Class_Demo();
		s.method(4,6);*/
		
	}

}
