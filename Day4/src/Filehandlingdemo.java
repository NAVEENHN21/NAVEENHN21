import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandlingdemo {

	public static void main(String[] args) {
		fileinputstream();
	}
	static void fileinputstream(){
		int i;
		File myfile=new File("C:\\Java FSD\\NAVEENHN21\\Day4\\src\\T1.java");
		try {
			FileInputStream fis=new FileInputStream(myfile);
			System.out.println("File opened");
			System.out.println("-----------");
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			fis.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	static void filewriterdemo() {
		int i;
		File myfile=new File();
		try {
			FileWriter fw=new FileWriter(myfile);
			System.out.println("File opened");
			System.out.println("---------");
			fw.write("Using file writer to write\n");
			fw.write("Using file writer to write one more line");
			fw.close();

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	static void bufferedreaderdemo() {
		
	}
}
