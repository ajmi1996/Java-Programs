package exception_handling;

public class Throw_Exception {

	public static void main(String[] args) {
		int age = 15;
		if(age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new ArithmeticException("Age is under 18, Not Eligible for voting");
		}
	}

}
