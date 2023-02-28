import java.util.*;
public class Exceptiondemo {

	public static void main(String[] args) {
	
		nullpointer();
	}
		
		private static void stringparser() {
			String s="hello";
			int i=Integer.parseInt(s);
			System.out.println("Converted integer"+i);
		}
		private static void nullpointer() {
			try {
			String s=null;
			System.out.println("Length of string"+s.length());
			}
			catch(Exception e) {
				System.out.println("Null poniter Exception"+e.getMessage());
			}
		}
		
		private static void dividebyzero() {
		int a,b,c,d;
		System.out.println("Enter the numbers to divide");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a=s.nextInt();
		System.out.println("Value "+a);
		System.out.println("Enter the 2nd number");
		b=s.nextInt();
		System.out.println("Value "+b);
		try {
		c=a/b;
		d=a*b;
		System.out.println("Remainder : "+a+"/"+b+"="+c);
		System.out.println("Multiplication: "+a+"*"+b+"="+d);
		}
		catch(Exception e){
			System.out.println("Exception occured"+e.getMessage());
		}
		
		
	}
	
}

