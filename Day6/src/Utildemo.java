import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utildemo {

	public static void main(String[] args) {
		
		Collectiondemo();
		Arraydemo();
	}

	private static void Arraydemo() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,15};
			for(int i:a) {
				System.out.println(i+",");
			}
			System.out.println();
			Arrays.sort(a);
			for(int i:a) {
				System.out.println(i+",");
			}
			
			String s[]= {"N","A","V","E","E","N"};
			List<String> s1=Arrays.asList(s);
			System.out.println(s1);
		
	}

	private static void Collectiondemo() {
		List<String> list=new ArrayList<>();
		list.add("zoe");
		list.add("hoe");
		list.add("toe");
		list.add("woe");
		list.add("koe");
		list.add("roe");
		System.out.println(list);
		
		//natural ordering
		Collections.sort(list);
		System.out.println(list);
		
		//Using a compartor
		Collections.sort(list, new Mycomparator());
		System.out.println(list);
		
//		Collections.reverse(list);
//		System.out.println(list);
		
		int res=Collections.binarySearch(list, "roe");
		System.out.println("Max found at: "+res);
	}
}
	class Mycomparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	}

