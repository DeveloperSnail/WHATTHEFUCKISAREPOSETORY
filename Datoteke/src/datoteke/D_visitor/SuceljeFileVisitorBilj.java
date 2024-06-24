package datoteke.D_visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

abstract class SuceljeFileVisitorBilj implements FileVisitor<Path>{

	//...Poziva se kada naiđe na novi direktorij
	public abstract FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException;

	//...Poziva se u trenutku obilaska neke datoteke
	public abstract FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException;

	//...Poziva se kada je zaobilazak neuspješan
	public abstract FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException;

	//...Poziva se kada smo završili obilazak svih datoteka u direktoriju
	public abstract FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException;

}
