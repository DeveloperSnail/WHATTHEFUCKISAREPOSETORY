package datoteke.A_basics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * Predstavljanje "PrintWriter" kao opcija metoda
 */

public class WriteFileBilj {

	public static void main(String[] args) throws IOException {

		Path p = Path.of("newBooty.txt");

		//Načini pisanja datoteka u Javi
		// 1) PrintWriter
		PrintWriter writer = new PrintWriter(p.toFile());
		
		writer.println("How many Jelly beans can I shove up my ass?");
		writer.println("5");
		writer.close();
		//...Ovo piše u datoteku ali prvo briše što piše u njoj
		//...Evo fix
		writer = new PrintWriter(new FileWriter("newBooty.txt", true));
													//...Ako je stavljeno "true", onda će pisat na ono što je u file
													//...Ako je "false", onda će pisat preko onoga što je u file
		writer.println("Wait actually lemme recount");
		writer.println("6");
		writer.close();
		
		
		// 2) Files.writeString()
		Files.writeString(p, "I humble apologize for the grave mistake ive made");
		//...Overwrita ono što je pisalo prije u datoteci
	}

}
