import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Treeset{
	
	public static void main(String[] args) {
		
		Set<String> str1=new TreeSet<String>();
				str1.add("Max");
		str1.add("John");
		str1.add("Will");
		str1.add("Robert");
		str1.add("Zoe");
		System.out.println(str1);
		
		Set<String> str2=new TreeSet<String>(new StringComparator());
				str2.add("Max");
		str2.add("John");
		str2.add("Will");
		str2.add("Robert");
		str2.add("Zoe");
		System.out.println(str2);
		
		Set<Employee> e=new TreeSet<Employee>();
		e.add(new Employee(100,"mark",450000,"s34879"));
		e.add(new Employee(102,"sark",450000,"s34879"));

		e.add(new Employee(104,"aark",450000,"s34879"));

		e.add(new Employee(106,"wark",450000,"s34879"));

		System.out.println(e);
	}
}
	
	class StringComparator implements Comparator<String>{

		@Override
		public int compare(String str1, String str2) {
			int l1=str1.length();
			int l2=str2.length();
			if(l1<l2) {
				return -1;
			}else if(l1>l2) {
				return 1;
			}else {
			return str1.compareTo(str2);
			//return 0; // equals treeset does'nt allow duplicate values
			}
		}
		
	}
	
	class Employee implements Comparable<Employee>{
		int id;
		String name;
		double salary;
		transient String aadharno;
		
		Employee(int id, String name,double alary, String aadharno){
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.aadharno=aadharno;
		}

		public String toString() {
			// TODO Auto-generated method stub
			return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadharno;
		}

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return this.id < o.id ? -1:this.id>o.id?1:0;
		}
		
	}

	
	
