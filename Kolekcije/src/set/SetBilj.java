package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetBilj {

	public static void main(String[] args) {
		
		Set <String> skup = new HashSet<>();
		Set <String> skuplje = new LinkedHashSet<>();
		
		for(String s: args) {
			System.out.print(s+ " ");
			skup.add(s);
			skuplje.add(s);
		}
		
		System.out.println(skup);
		System.out.println(skuplje);

	}
	

}
