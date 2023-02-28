
public class Vehicledemo {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.fuel());
		Vehicle v=new Vehicle();
		System.out.println(v.fuel());

		
	}

}
class Vehicle {
	String fuel() {
		return "petrol";
	}
	
}
class Bus extends Vehicle{
	String fuel() {
		return super.fuel();
	}
	
}
class Car extends Vehicle{
	String fuel() {
		return super.fuel();
	}
	
}
class Bike extends Vehicle{
	String fuel() {
		return "petrol";
	}
	
}
