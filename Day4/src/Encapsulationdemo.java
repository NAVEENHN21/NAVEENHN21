
public class Encapsulationdemo {

	public static void main(String[] args) {
		car c=new car();
		c.setColour("Red");
		System.out.println(c.getColour());
		System.out.println(c.getNumofwheels());
	}
}

class car{
	private String colour;
	private int numofwheels;
	private boolean customisable;
	
	public static String manufacturere="Honda";
	
	public car() {
		setNumofwheels(4);
		setColour("green");
		customisable=true;
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		if(customisable) {
		this.colour = colour;
		}
	}

	public int getNumofwheels() {
		return numofwheels;
	}

	public void setNumofwheels(int numofwheels) {
		this.numofwheels = numofwheels;
	}
	
}
