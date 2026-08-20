package aggregation_pack;

public class Aggreg_Class2 {
int x;
int y;
//Aggregation
Aggreg_Class1 aref; // Aggreg_Class1 - datatype, a - reference variable
public Aggreg_Class2(int x, int y, Aggreg_Class1 aref) { //Constructor
this.x=x;
this.y=y;
this.aref=aref;
}
public void aggregmeth() { //Method
System.out.println(x);	
System.out.println(y);
System.out.println(aref.a);
System.out.println(aref.b);
}

	public static void main(String[] args) {
		//First execute Aggreg_Class1
		Aggreg_Class1 o=new Aggreg_Class1(5,8);
		// Now execute Aggreg_Class2
		Aggreg_Class2 ob=new Aggreg_Class2(2,4,o); //Inside second class adding an entity reference value (ie, the object (o))of the first class.
		//Executing method
		ob.aggregmeth();
	}

}
