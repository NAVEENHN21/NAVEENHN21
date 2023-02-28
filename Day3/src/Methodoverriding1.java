
public class Methodoverriding1 {

	public static void main(String[] args) {
		
		Car1 c=new Car1();
		c.fuel();
		Bus1 b=new Bus1();
		b.fuel();
	}
}
class Vehicle1{
	void fuel() {
		System.out.println("Petrol");
	}
	
}
class Bus1 extends Vehicle1{
	void fuel() {
		super.fuel();
		System.out.println("Diesel");
	}
}
class Car1 extends Vehicle1{
	
}
class Bike1 extends Vehicle1{
	
}
