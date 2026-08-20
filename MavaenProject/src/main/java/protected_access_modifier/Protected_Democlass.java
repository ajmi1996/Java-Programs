package protected_access_modifier;

public class Protected_Democlass {
	protected void abs(int s, int d) {
		int y=s-d;
		System.out.println(y);	
	}
	protected void fgh(int r, int s) {
		int y=r-s;
		System.out.println(y);
	}
	public static void main(String[] args) {
		Protected_Democlass e=new Protected_Democlass();
		e.abs(5,6);
		e.fgh(8,9);
	}

}
