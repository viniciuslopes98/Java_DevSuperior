package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program_Arquivos {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\in.txt");
		Scanner leia = null;
		try {

			leia = new Scanner(file);
			while (leia.hasNextLine()) {
				System.out.println(leia.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		finally {
			if (leia != null) {
				leia.close();
			}
		}

	}

}
