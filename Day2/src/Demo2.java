
public class Demo2 {

	public static void main(String[] args) {
		byte b=126;
		int a=100;
		System.out.println(b);
		b=(byte)a;
		System.out.println(a);
		//Explicit type casting - Specify datatype
		
		char ch='a';
		System.out.println(ch);
		
		int a1=ch;
		System.out.println(a1);
		//Implicit type casting - Automatic Conversion
		
		char ch1=(char)a;
		System.out.println(ch1);
		
	}
}
