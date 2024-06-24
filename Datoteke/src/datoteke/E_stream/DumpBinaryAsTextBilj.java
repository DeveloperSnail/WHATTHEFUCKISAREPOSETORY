package datoteke.E_stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class DumpBinaryAsTextBilj {

	public static void main(String[] args) {
		
		Path p = Path.of("Suffisticated.txt");
		
		try( InputStream is = new FileInputStream(p.toFile());){
			
			byte[] buff = new byte[151];
			
			while(true) {
				
				int r = is.read(buff);
				if(r < 1) break;
				
				String s = new String(buff, Charset.forName("UTF-8"));
					
				System.out.println(s);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(
					new BufferedInputStream(
						new FileInputStream(
							p.toFile())),Charset.forName("UTF-8")))){
			
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}