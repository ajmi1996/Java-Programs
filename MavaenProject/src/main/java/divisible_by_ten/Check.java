package divisible_by_ten;

public class Check extends Addition{
	public void check(int a, int b) {
		
		int result = super.add(a,b);;
		if(result % 10 == 0)
			System.out.println("Addition result is divisible by 10");
		else
			System.out.println("Addition result not is divisible by 10");
	}

	public static void main(String[] args) {
		Check obj = new Check();
		obj.check(10,20);
	}

}
