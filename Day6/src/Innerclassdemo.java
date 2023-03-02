
public class Innerclassdemo {

	public static void main(String[] args) {
		Electrondevice.poweron();
		Electrondevice.Chip.brandname();
		
		Electrondevice.Chip chip=new Electrondevice.Chip();
		chip.specs();
		
		Electrondevice laptop=new Electrondevice();
		laptop.poweron();
		
		Electrondevice.processor proc=laptop.new processor();
		proc.getvoltage();
	}
}
class Electrondevice{
	static void poweron() {
		System.out.println("Device powered on..");
	}
	static class Chip{
		static void brandname() {
			System.out.println("From Sony..");
		}
		void specs() {
			System.out.println("Specifications for the chip..");
		}
	}
	class processor{
		void getvoltage() {
			System.out.println("Display voltage on the processor..");
		}
	}
}