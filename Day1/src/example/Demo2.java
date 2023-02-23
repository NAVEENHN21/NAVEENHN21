package example;

public class Demo2 {

	public Demo2() {
		System.out.println("From constructor");
	}
	{
		System.out.println("From non static");
	}
	public static void main(String args[]) {
		System.out.println("From main method");
		
		Demo2 d=new Demo2();
		
	}
}
