
public class Abstractiondemo {

	public static void main(String[] args) {
		Bmwthreeseries b1=new Bmwthreeseries();
		b1.start();
		b1.accelerate();
		
		Bmwthreeseries b2=new Bmwthreeseries();
		b2.start();
		b2.accelerate();
		
		
		BMW bmw=new Bmwthreeseries();	
		bmw.start();
		bmw.accelerate();
	}
}

abstract class BMW{
	void start() {
		System.out.println("BMW started..");
	}
	abstract void accelerate();
}

class Bmwthreeseries extends BMW{

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Three time ");
	}
	
}
class Bmwfiveseries extends BMW{

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Five time ");
	}
	
}