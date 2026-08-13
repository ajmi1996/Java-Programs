package super_keywordparentclassmethod;

public class Child extends Parent {
	public void Parentadd() { //method overriding-(using same return type, mathod name, parameter)
		//super.parentadd();line 5 and 9-11 is same
		String address="bvcccc";
		System.out.println(address);
	}
	public void Childadd(){
	super.parentadd();
	}
	public static void main(String[] args) {
		Child o=new Child();
		o.Parentadd();
		o.Childadd();

	}

}
