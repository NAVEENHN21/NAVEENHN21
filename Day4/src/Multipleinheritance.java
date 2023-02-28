class Multipleinheritance{
	public static void main(String[] args) {
		Tv tv=new Tv();
		tv.poweron();
		
		Monitor mn=new Monitor();
		mn.poweron();
		
		Desktocompter dc=new Desktocompter();
		dc.start();
		
	}
}

class Electronincdevice{
	void poweron() {
		System.out.println("Device powered on");
	}
}
class Tv extends Electronincdevice{
	void poweron() {
		System.out.println("Tv Device powered on");
	}
}
class Monitor extends Electronincdevice{
	void poweron() {
		System.out.println("Monitor Device powered on");
	}
}

class Desktocompter implements T1,T2{
	public void start() {
		T1.super.start();
		T2.super.start();
	}
	
}