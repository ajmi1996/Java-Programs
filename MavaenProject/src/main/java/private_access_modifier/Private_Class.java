package private_access_modifier;

import protected_access_modifier.Protected_Democlass;

public class Private_Class extends Protected_Democlass {
private void add() {
	String address="abc";
	System.out.println(address);
}
	public static void main(String[] args) {
		Private_Class o=new Private_Class();
		o.add();
//imported from another package (protected class)
		o.abs(10,5);
		o.fgh(20,4);

	}

}
