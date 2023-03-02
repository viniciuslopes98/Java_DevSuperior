package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = leia.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+path.getName());
		System.out.println("getParent: "+path.getParent());
		System.out.println("getPath: "+path.getPath());

		leia.close();

	}
}
