package datoteke.C_direktorij;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/* Ključni element listanja direktorija
 * 	-> Iterator/Closable je DirectoryStream<Path>
 *  -> i njegov konstruktpr Files.newDirectoryStream(dir)
 * */

public class IspisDirektorijaBilj {

	public static void main(String[] args) throws IOException {

		Path dir = Path.of("C:\\JavaLAB\\Datoteke\\");
		//Ova metoda otvara direktorij i vrača natrag DirectoryStream
		DirectoryStream<Path> ds = Files.newDirectoryStream(dir);
		
		for(Path p: ds) {
			System.out.printf("%s %s (%d) \n", Files.isDirectory(p) ? "Direktorij" : "  ", p.getFileName(), Files.size(p));	
		}
		
	}

}
