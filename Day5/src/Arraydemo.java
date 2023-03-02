
public class Arraydemo {

	public static void main(String[] args) {
		int[] arr= {3,5,4,5,6,3,5,7};
		//printArray(arr);
//		arr[0]=13;
//		printArray(arr);
//		arr[3]=new Integer(24);
//		printArray(arr);
		
		//sumofarray();
		//sumofevennoinarray();
		//chararray();
		arrayofobjects();
		
	}

	private static void arrayofobjects() {
		// TODO Auto-generated method stub
		Employee[] employees=new Employee[4];
		Employee emp1=new Employee(1,"suman",50000,"3242");
		Employee emp2=new Employee(2,"suman",50000,"3242");
		Employee emp3=new Employee(3,"suman",50000,"3242");
		Employee emp4=new Employee(4,"suman",50000,"3242");
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		employees[3]=emp4;

		
		
	}

	private static void chararray() {
		// TODO Auto-generated method stub
		char c[]= {'a','z','b','q'};
		String s1="hello world",res=" ";
		for(char x:s1.toCharArray())
		{
			System.out.println(x);
			res=x+res;
			System.out.println(res);
		}
		System.out.println("Reverse String "+res);
		
		
		
	}

	private static void sumofevennoinarray() {
		// TODO Auto-generated method stub
		int a[]= {3,0,4,5,6,3,0,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
			System.out.println(sum);
		}
		
	}

	private static void sumofarray() {
		// TODO Auto-generated method stub
		
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]==3 && arr[i+1]==5) {
				arr[i]=0;
			}
			System.out.print(arr[i]+" ,");
		}
		
		
		
	}
	//{3,5,4,5,6,3,5,7} // replace the 5's that follow a 3 with zero
	//{3,0,4,5,6,3,0,7}
}
