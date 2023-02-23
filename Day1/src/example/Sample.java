package example;
public class Sample {
	public static void main(String args[]) {
		System.out.println("Hello world");
		method1();
		//method();
		Sample s=new Sample();
		s.method();
	}
	static void method1() {
		System.out.println("static 1");
	}
	static void method2() {
		System.out.println("static 2");
	}
	void method() {
		System.out.println("static 3");
	}

}
