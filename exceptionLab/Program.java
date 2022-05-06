package ExceptionLab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		Account a1 = new Account(1, 100, "henry");
		try {
		a1.withdraw(50);
		a1.withdraw(60);
		a1.withdraw(10);
		}
		catch(IllegalArgumentException e){
			System.out.println("insufficient funds");
		}
		finally {
			a1.close();
		}
		try {
			log("hello there");			
		}
		catch(IOException e) {
			System.out.println("exception caught");
		}

	}
	
	private static void log(String msg) throws IOException{
		File file = new File("log.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(msg + "\r\n");
		br.close();
		fr.close();
		}

}
