
public class Constructorchaining {

	public static void main(String[] args) {
		Childclass c=new Childclass(10);
		Childclass c=new Childclass();
	}
}

class Superclass{
	int x;
	Superclass(){
		System.out.println("No args super class constrcutor");
	}
	Superclass(int x){
		this.x=x;
		System.out.println("Only one argument");
	}
}
class Childclass extends Superclass{
	Childclass(){
		System.out.println("No args child constructor called ");
	}
	Childclass(int y){
		super(y);
		System.out.println("Only args child constructor called ");

	}
}