
public class Runtimepolymorphism {

	public static void main(String[] args) {
		Macbook mc=new Macbookair();
		mc.start();
		mc.shutdown();
	}
}

class Macbook{
	void start() {
		System.out.println("Macbook started");
	}
	void shutdown() {
		System.out.println("Macbook shutdown");
	}
}

class Macbookair extends Macbook{
	void start() {
		System.out.println("Macbookair started");
	}
	void shutdown() {
		System.out.println("Macbookair shutdown");
	}
}
class Macbookpro extends Macbook{
	void start() {
		System.out.println("Macbookpro started");
	}
	void shutdown() {
		System.out.println("Macbookpro shutdown");
	}
}