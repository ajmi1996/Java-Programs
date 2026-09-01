package atm_withdraw_amt;

public class User {
public void getpin() {
	Bank b = new Bank();
	b.setpin(1234);
	b.validatepin();
}
	public static void main(String[] args) {
		User u = new User();
		u.getpin();

	}

}
