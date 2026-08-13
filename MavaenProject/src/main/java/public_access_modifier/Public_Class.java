package public_access_modifier;

public class Public_Class {
public void add() {
	String place="kjhgf";
	System.out.println(place);
}
	public static void main(String[] args) {
		Public_Class o=new Public_Class();
		o.add();//executed in same class.

	}

}
