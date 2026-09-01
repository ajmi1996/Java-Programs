package exception_handling;

public class Exception_Handling {
	

	public static void main(String[] args) {
		try {
		int a=5;
		int div = a / 0; // Arithemetic Exception
		System.out.println(div);
		}
		/*
		catch(ArithmeticException e){ //Exception is handling in catch block
		System.out.println(e);
		}
		*/
		catch(Exception a) { //Exception is the parent class of other exceptions
			System.out.println(a);
		}
		finally { 
			System.out.println("The given"); // excecutes whether an exception is handled or not
		}

	}

}
