import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
	
		
		
		//Demo1();
		//Demo2();
		Demo3();
		
	}

	private static void Demo3() {
		// TODO Auto-generated method stub
		ArrayList<Integer> inlist=new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			inlist.add(i);
		}
		System.out.println(inlist);
		
		inlist.add(2,100);
		inlist.add(3,101);
		System.out.println(inlist);
		inlist.remove(5);
		System.out.println(inlist);
		if(inlist.contains(600)) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		
	}

	private static void Demo2() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList();
		list1.add(1);
		list1.add(20);
		System.out.println(list1);
	}

	private static void Demo1() {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add("Hello");
		System.out.println(list);
		
	}

}
