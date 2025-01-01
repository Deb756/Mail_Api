package Anonymous_class;


interface A
{
	void m1();
	void m2();
}

abstract class B {
	public void m1()
	{
		System.out.println("Hello World-----");
	}
}
public class anonymous_class {
	public static void main(String[] args) {
		
//		Anonymous class implementation
		B ref = new B() {
			@Override
			public void m1()
			{
				System.out.println("Overriden");
			}
		};
		ref.m1();
//		msg(ref);
		
		msg(new B() {
			@Override
			public void m1()
			{
				System.out.println("Overriden");
			}
		});
	}
	
	public static void msg(B obj)
	{
		System.out.println("Object Received");
	}
}
