package employee;

public class Salary extends Employee{
	double hra;
	double pf;
	public void calculate() {
		hra=basicpay*5/100;
		pf=basicpay*20/100;
	}
}
