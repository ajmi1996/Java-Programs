package hierarchical_inheritance;

public class Daughter extends Father{
	public void dname() {
		String name="mnop";
		System.out.println(name);
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.dname();
		d.fname();

	}

}
