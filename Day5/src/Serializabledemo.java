import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serializabledemo{
	public static void main(String[] args) {
//		Employee em=new Employee(1,"Navi",55000,"4474372");
//		System.out.println(em);
//		Employee em1=new Employee(2,"Navi",55000,"4474372");
//		System.out.println(em1);
		Serializationdemosimplified();
		Deserialization();
		
		
	}

	private static void Serializationdemosimplified() {
		// TODO Auto-generated method stub
		try (
			FileOutputStream fs=new FileOutputStream("C:\\Java FSD\\NAVEENHN21\\Day5\\src\\Helloworld");
			ObjectOutputStream oos=new ObjectOutputStream(fs);){
			Employee em=new Employee(1,"Navi",55000,"4474372");
    		oos.writeObject(em);
    		System.out.println("Object Serialization");
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
	}
	}

	private static void Deserialization() {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("C:\\Java FSD\\NAVEENHN21\\Day5\\src\\Helloworld");
				ObjectInputStream ois=new ObjectInputStream(fis);){
					Employee emp=(Employee)ois.readObject();
					System.out.println("Object Deserialized= "+emp);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				
	}

	private static void Serializationdemo() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs=new FileOutputStream("C:\\Java FSD\\NAVEENHN21\\Day5\\src\\Helloworld");
			ObjectOutputStream oos=new ObjectOutputStream(fs);
			Employee em=new Employee(1,"Navi",55000,"4474372");
    		oos.writeObject(em);
    		System.out.println("Object Serialization");
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fs.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
class Employee implements Serializable{
	int id;
	String name;
	double salary;
	//@Transient
	String aadharno;
	
	Employee(int id,
	String name,
	double salary,
	String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadharno;
	}
}