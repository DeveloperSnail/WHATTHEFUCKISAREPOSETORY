package datoteke.D_visitor;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;

/*	Files.walkFileTree( , )
 * 
 * */

public class IspisDirektorija_FileVisitorBilj {

	public static void main(String[] args) throws IOException {

		Path dir = Path.of("C:\\JavaLAB\\Datoteke\\");

		FileVisitor<Path> visitor = new MyFileVisitorBilj();
		
		Files.walkFileTree(dir, visitor);
	}

}
