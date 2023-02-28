
public class Polymorphism {

	public static void main(String[] args) {
		Compiletimepoly cp=new Compiletimepoly();
		cp.add(10f, 5.5f);
		cp.add(12, 16);
		cp.add(10, 20, 30);
		//cp.add("x", "y");
	}
}
class Compiletimepoly{
	void add(int a,int b) {
		int res=a+b;
		System.out.println("Add"+res);
	}
	void add(float a,float b) {
		float res=a+b;
		System.out.println("Add"+res);
	}
	void add(int a,int b,int c) {
		int res=a+b+c;
		System.out.println("Add"+res);
	}
}
