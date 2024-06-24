package scanner;

import java.util.Scanner;

public class ScannerBilj {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			int x = sc.nextInt();
		} else if (sc.hasNextLine()) {
			String s = sc.nextLine();
		}
		
		
		
	}

}
