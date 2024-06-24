package datoteke.A_basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ovaj primjer također sadrži načine stvaranja path-a
 */

public class ReadFileBilj {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {

		File f = new File("Fart.txt");
		//...Prvi način za napravit Path:
		Path p = Path.of("Fart.txt");
		//...Drugi način:
		//Path p = f.toPath();
		
		
		//Načini čitanja datoteka u Javi
		// 1) Scanner
		Scanner sc = new Scanner(f);	//...treba deklarirat exception
		List<String> Fart = new ArrayList<>(3);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
			Fart.add(line);
		}
		System.out.println(Fart);
		
		// 2) Files.readAllLines()
		Fart = Files.readAllLines(p);
		System.out.println(Fart);
		
		// 3) Files.readString()
		String wholeFart = Files.readString(p);
		System.out.println(wholeFart);
		
	
	}

}
