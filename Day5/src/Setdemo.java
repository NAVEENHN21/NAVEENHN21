import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		
		//randomdemo();
		//hashsetdemo();
		treesetdemo();
	}

	private static void treesetdemo() {
		// TODO Auto-generated method stub
		Set<Integer> intset=new TreeSet<Integer>();
		intset.add(10);
		intset.add(5);
		intset.add(2);
		System.out.println(intset);
		
	}

	private static void hashsetdemo() {
		// TODO Auto-generated method stub
		Random obj=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(obj.nextInt(1,10));
			
		}
		System.out.println(list);
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		Set<Integer> set2=new LinkedHashSet<>(list);
		System.out.println(set2);
		Set<Integer> set3=new TreeSet<>(list);
		System.out.println(set3);

	}

	private static void randomdemo() {
		// TODO Auto-generated method stub
		Random obj=new Random();
		int x=obj.nextInt(100);
		System.out.println(x);
		
	}
}
