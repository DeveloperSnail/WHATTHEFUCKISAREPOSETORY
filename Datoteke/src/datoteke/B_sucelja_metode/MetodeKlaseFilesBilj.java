package datoteke.B_sucelja_metode;

import java.io.File;

public class MetodeKlaseFilesBilj{

	public static void main(String[] args) {
		File f = new File("Fart.txt");
		//MetodeKlaseFile
		showFileInfo(f);
		
	}
	
	private static void showFileInfo(File file) {		
		String absolutePath = file.getAbsolutePath();
		System.out.println("\t " + absolutePath);
		
		File parent = file.getParentFile();
		System.out.println("\t Parent file: " + parent);
		
		boolean exists = file.exists();
		System.out.println("\t File exists?: " + exists);
		
		boolean readable = file.canRead();
		System.out.println("\t Can read?: " + readable);
		
		boolean writeable = file.canWrite();
		System.out.println("\t Can write?: " + writeable);
		
		boolean executable = file.canExecute();
		System.out.println("\t Can execute?: " + executable);
		
		long fileSize = file.length();
		System.out.println("\t File size: " + fileSize + " bajtova");
		
		boolean isFile = file.isFile();
		System.out.println("\t Is file?: " + isFile);
		
		boolean isDirectory = file.isDirectory();
		System.out.println("\t Is directory?: " + isDirectory);
		
		boolean isHidden = file.isHidden();
		System.out.println("\t Is hidden?: " + isHidden);
	}
}
