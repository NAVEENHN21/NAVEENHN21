
public class Finalkeyword {
	public static void main(String[] args) {
		final int x=5;
		//x=10;
		int y=10;
		y=100;
		
	}

}

class A{
	final void dosomework() {
	System.out.println("A is doing work");
	}
}
class B extends A{
//	void dosomework() {
//		System.out.println("B is doing work");
//	}
	
}
