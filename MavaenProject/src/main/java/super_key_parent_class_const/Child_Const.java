package super_key_parent_class_const;

public class Child_Const extends Parent_Const {
	public Child_Const(int x, int y) {
		//use super keyword beforethe following code
		super();//init keywords-initialization at starting
		int z=x+y;
		System.out.println(z);
	}
	public Child_Const(){
		super(2,5);
		String bname="ttry";
		System.out.println(bname);
		}
	public static void main(String[] args) {
		Child_Const o=new Child_Const(10,5);
		Child_Const ob=new Child_Const();

	}

}
