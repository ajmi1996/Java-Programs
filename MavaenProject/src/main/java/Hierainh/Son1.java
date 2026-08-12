package Hierainh;

public class Son1 extends Father {
	public void sname() {
	String a="fgd";
	System.out.println(a);
	}
	public static void main(String[] args) {
	Son1 o=new Son1();
	o.fname();
	o.sname();
	Daughter ob=new Daughter();
	ob.fname();
	ob.dname();
	}

}
