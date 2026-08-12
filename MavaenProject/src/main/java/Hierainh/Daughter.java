package Hierainh;

public class Daughter extends Father{
	public void dname() {
		String ab="fgddd";
		System.out.println(ab);
		}
	public static void main(String[] args) {
		Daughter o=new Daughter();
		o.fname();
		o.dname();

	}

}
