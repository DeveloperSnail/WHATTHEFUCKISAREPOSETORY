package datoteke.C_direktorij;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class IspisCijelogDirektorijaBilj {

	public static void main(String[] args) throws IOException {

		Path dir = Path.of("C:\\JavaLAB\\Datoteke\\");
		System.out.println(dir.toAbsolutePath());
		listajDir(dir, 0);
	}
	
	public static void listajDir(Path dir, int level) throws IOException {
		
		DirectoryStream<Path> ds = Files.newDirectoryStream(dir);
		
		for(Path p: ds) {
			if(Files.isDirectory(p)) {
				for (int i=0; i<level; i++) System.out.printf("   ");  //format ispisa
				System.out.printf("Direktorij: %s\n", p.getFileName()); //ispis
				listajDir(p, level+1);
				
			} else {
				for (int i=0; i<level; i++) System.out.printf("   "); //format ispisa
				System.out.printf("File: %s (%d) \n", p.getFileName(), Files.size(p)); //format ispisa	
			}
		
		}
	}

}
