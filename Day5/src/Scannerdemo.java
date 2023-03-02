import java.util.Scanner;

public class Scannerdemo {
	public static void main(String[] args) {
		
		Scannerdemo();
		//scannerdemo2();
		
		
		
	}

	private static void scannerdemo2() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		int id=s.nextInt();
		System.out.println("Enter Name: ");
		String name=s.next();
		System.out.println("E1nter Score ");
		double score=s.nextDouble();
		System.out.println("Student Details");
		System.out.println("Id"+id);
		System.out.println("Name"+name);
		System.out.println("Score"+score);
		
	}

	private static void Scannerdemo() {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number (char to exit): ");
		while(s.hasNextInt()) {
			int num=s.nextInt();
			sum+=num;
			System.out.println("Enter a number (char to exit): ");
		}
		System.out.println("Sum: "+sum);
			
		}
		
	}


