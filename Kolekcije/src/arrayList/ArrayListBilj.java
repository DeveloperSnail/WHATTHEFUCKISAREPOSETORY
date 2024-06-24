package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBilj {

	public static void main(String[] args) {
		//...Stvaranje dinamičkog polja
		ArrayList<String> dinPolje = new ArrayList<String>(3);

		//...[add] Dodavanje elemenata
		//...Možemo odlučit na koji indeks se nadoda element
		dinPolje.add("ChickenFingers");
		dinPolje.add("NinjaChicken");
		dinPolje.add(1, "ChickenNingers");
		
		//...Ispisivanje cijelog polja
		System.out.println(dinPolje);
		//...Veličina polja
		System.out.println(dinPolje.size() + "\n");
		
		//...Možemo modificirati polje da bude preko veličine default veličine
		dinPolje.add("Friends");
		System.out.println(dinPolje + "\n");
		
		
		//...[remove] Brisanje jednog elementa polja
		dinPolje.remove(2);
		System.out.println(dinPolje + "\n");
		
		//...[set] Mijenjanje elemenata na neki indeks
		dinPolje.set(1, "DONT SAY THE N WORD");
		System.out.println(dinPolje + "\n");
	
		//...[get] Vračanje elementa sa nekog indeksa
		System.out.println("Na indeks 2 je " + dinPolje.get(2));
		
	}

}
