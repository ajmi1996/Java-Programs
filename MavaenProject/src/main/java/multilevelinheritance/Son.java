package multilevelinheritance;

public class Son extends Father{
	
public void sname() {
String c="sfd";
System.out.println(c);
}
public static void main(String args[]) {
	Son o=new Son();
	o.relation();
	o.housename();
	o.sname();
}
}

