package kolekcije_IteratorSucelja;

import java.util.Collection;
import java.util.Iterator;

abstract class MetodeSuceljaCollection implements Collection<Integer>{

	public abstract int size();
	public abstract boolean add(Integer e);
	public abstract boolean remove(Object o);
	
	public abstract boolean isEmpty();	
	//...Provjerava ako je kolekcija prazna, vrača true/false

	public abstract boolean contains(Object o);	
	//...Provjerava ako je navedeni objekt sadržan unutar metode, vrača true/false

	public abstract Iterator<Integer> iterator();	
	//...Stvara Iterator, vidi drugi primjer za praktičnost iteratora

	public abstract Object[] toArray();	
	//...

	public abstract <T> T[] toArray(T[] a);

	public abstract boolean containsAll(Collection<?> c);	
	//...

	public abstract boolean addAll(Collection<? extends Integer> c);	
	//...

	public abstract boolean removeAll(Collection<?> c);	
	//...

	public abstract boolean retainAll(Collection<?> c);	
	//...

	public abstract void clear();	
	//...

}
