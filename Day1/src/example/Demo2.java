package example;

public class Demo2 {
	
	static {
		System.out.println("From static method");
	}

	public Demo2() {
		System.out.println("From constructor");
	}
	{
		System.out.println("From non static");
	}
	public static void main(String args[]) {
		System.out.println("From main method");
		
		Demo2 d=new Demo2();
		Car c=new Car();
		System.out.println(c.colour);
		System.out.println(Car.maunfacturer);
	}
}
