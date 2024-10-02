package Four;

public class MyMain {

	public static void main(String[] args) {
		A obj=new B();
		obj.Parent();
		
		System.out.println("-----------------");
		B obj2 = new B();
		obj2.child();
		obj2.Parent();

	}

}
