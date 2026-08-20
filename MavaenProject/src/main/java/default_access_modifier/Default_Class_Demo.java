package default_access_modifier;

public class Default_Class_Demo {
void method(int a, int b) {
	int x=a*b;
	System.out.println(x);
}
	public static void main(String[] args) {
		Default_Class_Demo s=new Default_Class_Demo();
		s.method(4,6);

	}

}
