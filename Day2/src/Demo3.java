
public class Demo3 {

	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i);
		Integer i1=i;
		System.out.println(i1);
		//Boxing: Automatic conversion from primitive to wrapper class
		
//		Byte b=new Byte((byte) 20);
//		byte b1=b;
		
		Integer a=new Integer(100);
		int i2=a;
		System.out.println(i2);
		//Unboxing: wrapper to primitive
		if(a>i) {
			System.out.println(i);
		}
	}
}
