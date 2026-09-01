package exception_handling;

public class Multiple_Exception {

	public static void main(String[] args) {
		try {
			int a[]=new int [2];
			/*a[2] = 10;
			int b = a[2] / 0;*/
			a[2] = 10 /0;
			}
		catch(ArrayIndexOutOfBoundsException a) { // instead of giving multiple catch we can give single catch(exception e){//code;}
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
