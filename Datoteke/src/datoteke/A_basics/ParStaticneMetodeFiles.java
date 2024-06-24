package datoteke.A_basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// Files ima statične metode za
//	kao za pisanje, čitanje s vračenim Stringom, čitanje s vračenom Listom

public class ParStaticneMetodeFiles {

	public static void main(String[] args) throws IOException {

		File f = new File("Suffisticated.txt");
		Path p = Path.of("Suffisticated.txt");
		
		//writing a file
		Files.writeString(p,"There once was a Little boy\n"
				+ "his name was Mike\n"
				+ "Mike didint have many friends\n"
				+ "Because he was a bitch");
		
		//reading a file
		List<String> lista = Files.readAllLines(p);
		System.out.println(lista);
		
		String string = Files.readString(p);
		System.out.println(string);
		
		
	}

}
