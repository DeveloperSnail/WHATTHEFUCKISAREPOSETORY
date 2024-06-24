package datoteke.D_visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitorBilj extends SimpleFileVisitor<Path> {
	//SimpleFileVisitor ima napisane metode sucelja FileVisitor, samo što su blank
	//Trebam sam napisati ovu klasu s metodama interface-a FileVisitor tako da 
	//bih moga njega koristiti za listanje stabla direktorija
	
	int level = -1;
	
	//...Poziva se kada naiđe na novi direktorij
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException{
		
		for (int i=0; i<level; i++) System.out.printf("- ");
		System.out.println(dir.getFileName());
		level++;
		return FileVisitResult.CONTINUE;
	}
	

	//...Poziva se kada naiđe na novu datoteku
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
		
		for (int i=0; i<level; i++) System.out.printf("  ");
		System.out.printf("%s (%d bytes) [%s]\n", file.getFileName(), Files.size(file), attrs.creationTime());
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		level--;
		return FileVisitResult.CONTINUE;
	}
	
}
