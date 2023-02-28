import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Multicatchdemoexception {

	public static void main(String[] args) {
		multicatch();
	}

private static void multicatch(){
	try {
		String s="x";
		int i=Integer.parseInt(s);
		System.out.println("Converted integer"+i);
		String s2=null;
		System.out.println("Length "+s2.length());
	}catch(NumberFormatException e) {
		System.out.println("Number format exception");
	}catch(NullPointerException e) {
		System.out.println("Null pointer exception");


	}catch(Exception e) {
		System.out.println("Exception occured"+e.getMessage());

	}
}
private static void checkedExceptiondemo() throws FileNotFoundException {
	//FileInputStream fi=new FileInputStream(user/txt);
}

}