package kolekcije_IteratorSucelja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParStaticnihMetodaCollections {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		//...Scanner for making list until empty line
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine() ) {
			String x = sc.nextLine();
			if(!(x.equals(""))) {
				lista.add(x);
			} else {
				break;
			}
		}
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println("Sortirana lista: " + lista);
		
		Collections.reverse(lista);
		System.out.println("Obrnuta lista: " + lista);
		
		Collections.shuffle(lista);
		System.out.println("Pomiješana lista: " + lista);
		
		Collections.swap(lista, 0, 1);
		System.out.println("Zamjena prvog i drugog mjesta u listi: " + lista);
		
		Collections.min(lista);
		System.out.println("Minimum liste: " + Collections.min(lista));
		
		Collections.rotate(lista, 2);
		System.out.println("Pomakni sve elemente za 2 udesno: " + lista);
		
		Collections.replaceAll(lista, "brate", "ass");
		System.out.println("Zamijeni svaku pojavu riječi \"brate\" s \"ass\": " + lista);
		
		Collections.fill(lista, "ass");
		System.out.println("Svaki element zamijenjen s ass: " + lista);
		
		List<String> lista2 = new ArrayList<>();
		Collections.copy(lista, lista2);
		
		
	}

}
