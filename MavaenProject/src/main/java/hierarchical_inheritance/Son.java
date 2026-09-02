package hierarchical_inheritance;

public class Son extends Father{
		public void sname() {
			String name="xyz";
			System.out.println(name);
		}

	public static void main(String[] args) {
		Son s = new Son();
		s.fname();
		s.sname();

	}

}
