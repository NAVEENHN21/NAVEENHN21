
public class Innerclassdemo2 {

	public static void main(String[] args) {
		Car car=new Car("Blue");
		
		car.start();
		
		Car.MusicSystem cm=car.new MusicSystem(3);
		cm.displaydetails();
		cm.playsomemusic();
	}
}
class Car{
	private static String model="Hyundai I20 Automatic";
	private String colour;
	void start() {
		System.out.println("Car with "+colour+"colour is starting");
	}
	Car(String colour){
		this.colour=colour;
	}
	class MusicSystem{
		private int numofchannels;
		MusicSystem(int num){
			this.numofchannels=num;
			
		}
		void displaydetails() {
			System.out.println("Model of the car: "+Car.model);
			System.out.println("The colour of the car:"+Car.this.colour);
			System.out.println("Number of channels in MusicSystem: "+this.numofchannels);
			
		}
		void playsomemusic() {
			System.out.println("Playing some music..");
			
			class Channel{
				int frequency;
				void getcurrentplaysong() {
					System.out.println("Displaying current playing song");
				}
			}
			Channel ch=new Channel();
			ch.getcurrentplaysong();
		}
	}
	
}
