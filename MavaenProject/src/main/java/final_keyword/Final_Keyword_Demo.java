//Program using Final Variable
package final_keyword;

public class Final_Keyword_Demo {
	int c=6; //instance variable
	public Final_Keyword_Demo() {
	c=8;
	System.out.println(c);
	}
	public static void main(String[] args) {
		int a=10;// local variable
		a=20;
		final int b=13;
		//b=5;
		System.out.println(a);
		System.out.println(b);
		Final_Keyword_Demo o= new Final_Keyword_Demo(); //executing final keyword
		System.out.println(o.c);// executing instance variable using the reference variable
	}

}
