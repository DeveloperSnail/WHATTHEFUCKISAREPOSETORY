package datoteke.C_direktorij;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * KREIRANA KLASA SE KORISTI KAO PREDIKAT
 * - u smislu da implementira Filter() s jednom metodom
 * 		te tu metodu prilagođavamo da njezin uvjet
 * 		prihvati samo ono što tražimo
 *  */

public class FileFilter implements Filter<Path> {

	@Override
	public boolean accept(Path entry) throws IOException {
		//filter prima sljedeće: 
		if(entry.toString().endsWith(".java")  || entry.toString().endsWith(".class") || Files.isDirectory(entry)){
			return true;
		}
		return false;
	}

}
