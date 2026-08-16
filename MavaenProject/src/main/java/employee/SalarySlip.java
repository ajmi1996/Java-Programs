package employee;

public class SalarySlip extends Salary {
	
	double total;
	public void display() {
		total=basicpay+hra-pf-deduction+bonus;
		System.out.println("  Salsry Slip  ");
		System.out.println("Basic Pay: " + basicpay);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary by Hand: " + total);
	}
	

	public static void main(String[] args) {
		SalarySlip s=new SalarySlip();
//		s.getData(args);
		s.calculate();
		s.display();

	}

}
