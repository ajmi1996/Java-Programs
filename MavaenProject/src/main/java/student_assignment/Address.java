package student_assignment;

public class Address {
 String address;
 public void address(String address) {
	 this.address=address;
 }
	public static void main(String[] args) {
		Student s = new Student();
		s.student("nnn",678);
		Address a = new Address();
		a.address("bbbbbbb");
		System.out.println("Student name: " + s.name);
		System.out.println("Roll No: " + s.rollno);
		System.out.println("Address: " + a.address);
	}

}
