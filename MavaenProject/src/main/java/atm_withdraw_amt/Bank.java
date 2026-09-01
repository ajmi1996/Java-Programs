package atm_withdraw_amt;

public class Bank {
private int pin;
public void setpin(int pin) {
	this.pin=pin;
}
public void validatepin() {
	if(pin == 1001 || pin == 1234 || pin == 1212) {
	System.out.println("Validate Pin");
	System.out.println("You can withdraw money");
	}
	else {
		System.out.println("Invalid Pin");
	}
}
}
