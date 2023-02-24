
public class Demo4 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int res;
		res=a+b;
		res=a-b;
		res=a/b;
		res=a*b;
		System.out.println(res);
		System.out.println(a++);
		System.out.println(++a);
		
		boolean isselected=false;
		
		if(!isselected) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		// Relational operators: <,>,==,!=
		//Logical operators : 
		int age=19;
		boolean drivingclassattended=true;
		if(age>18 && drivingclassattended) {
			System.out.println("License Issued");
		}
		else {
			System.out.println("Come later");
		}
		
		boolean isaccountactive=false;
		int balance=5000;
		if(balance>1000 || isaccountactive) {
			System.out.println("Transaction approved");
		}
		else {
			System.out.println("Transaction Rejected");
		}
		//Ternary operator
		
		String license=(age>18 && drivingclassattended)?"Transcation approved":"Transaction Rejected";
		System.out.println(license);
		
		//minimum of 2 numbers using ternary operator
		int a1=10;
		int b2=20;
		int res1= (a1<b2) ? a1: b2;
		System.out.println(res1);
		
		//Assignment operator 
		a1=+10;
		b2=-5;
		a1=5;
		b2=6;
	}
}
