//throws
package exception_handling;

public class Custom_Exception {
	

	public static void main(String[] args)throws VotingException {
		int age = 15;
		if(age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new VotingException("Age is under 18, Not Eligible for voting");
		}
		

	}

}
