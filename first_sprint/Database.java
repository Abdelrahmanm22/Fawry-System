package first_sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Database {

	private boolean type;
	private static String line;
	private Scanner scanner;
	private static File file;
	
	public Database(boolean type) {
		this.type = type;
		if(type)
			file = new File("D:\\F  C  I\\Fawry_System\\Clients.txt");
		else
			file = new File("D:\\F  C  I\\Fawry_System\\Admins.txt");
	}

	
	public String getLine() {
		try {
		      	scanner = new Scanner(file);
		        line = scanner.nextLine();
		        scanner.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return line;
	}
	
	public boolean getType() {
		return type;
	}
}
