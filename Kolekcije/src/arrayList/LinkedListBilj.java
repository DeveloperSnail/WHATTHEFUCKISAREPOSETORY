package arrayList;

import java.util.LinkedList;

public class LinkedListBilj {

	public static void main(String[] args) {
		//...Skoro iste komande
		//arrayList<String> dinPolje = new arrayList<String>(3);
		LinkedList<String> dinPolje = new LinkedList<String>();

		dinPolje.add("ChickenFingers");
		dinPolje.add("NinjaChicken");
		dinPolje.add(1, "ChickenNingers");
		System.out.println(dinPolje);
		System.out.println(dinPolje.size());
		
		dinPolje.add("Friends");
		System.out.println(dinPolje);
		dinPolje.remove(2);
		System.out.println(dinPolje);
		dinPolje.set(1, "DONT SAY THE N WORD");
		System.out.println(dinPolje);
		System.out.println("Na indeks 2 je " + dinPolje.get(2) + "\n");
		
		
		//...iteriranje na dva načina
		//...1.
		for(int i=0; i<dinPolje.size(); i++) {
			System.out.println(dinPolje.get(i));
		}
		//...2.
		for(String s : dinPolje) {
			System.out.println(s);
		}
	}

}
