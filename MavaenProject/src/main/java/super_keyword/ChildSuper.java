package super_keyword;

public class ChildSuper extends ParentSuper {
	int a=20;
	public ChildSuper() {
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
	ChildSuper obje = new ChildSuper();

	}

}