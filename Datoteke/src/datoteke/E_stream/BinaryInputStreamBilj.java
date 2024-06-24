package datoteke.E_stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io. *;

public class BinaryInputStreamBilj {

	public static void main(String[] args){

		Path p = Path.of("Suffisticated.txt");
		
		// Input stream
		//  InputStream is1 = new FileInputStream(p.toFile());
		//  InputStream is2 = Files.newInputStream(p);
		try( InputStream is = new FileInputStream(p.toFile());){
			
			int data;
			
			while((data = is.read()) != -1) {
				System.out.println(data + "	= " + (char)data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//DrugiNacin postojanja InputStream je ako 
		try( InputStream is = new FileInputStream(p.toFile());){
			
			byte[] buff = new byte[100];
			
			while(true) {
				
				int r = is.read(buff);
				if(r < 1) break;
				for(int i =0; i<r; i++) {
					System.out.println(buff[i] + "	= " + (char)buff[i]);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
