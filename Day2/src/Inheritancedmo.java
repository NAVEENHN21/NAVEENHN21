
public class Inheritancedmo {
		public static void main(String[] args) {
			jdk8 jdk=new jdk8();
			
		} 
	}

	class jdk6{
		jdk6(){
			System.out.println("Installing JDK6");
		}
	}
	class jdk7 extends jdk6{
		jdk7(){
			System.out.println("Installing JDK7");
		}
	}
	class jdk8 extends jdk7{
		jdk8(){
			System.out.println("Installing JDK8");
		}
	}



