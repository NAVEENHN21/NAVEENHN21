import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapdemo {

	public static void main(String[] args) {
		
		Map<String,Integer> marks=new HashMap<>();
		marks.put("Bob", 99);
		marks.put("John", 90);
		marks.put("Max", 80);
		marks.put("Tom", 70);
		marks.put("Lee", 60);
		marks.put("Tom", 85);
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		
		for(String key: marks.keySet()) {
			System.out.println(marks.get(key));
		}
		Map<String,Integer> marks2=new LinkedHashMap<>();
		marks2.put("Bob", 99);
		marks2.put("John", 90);
		marks2.put("Max", 80);
		marks2.put("Tom", 70);
		marks2.put("Lee", 60);
		marks2.put("Tom", 85);
		System.out.println(marks2);
		System.out.println(marks2.keySet());
		System.out.println(marks2.values());
	}
}
