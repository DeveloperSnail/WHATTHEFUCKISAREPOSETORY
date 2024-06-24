package kolekcije_IteratorSucelja;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

abstract class SuceljeListBilj implements List<String>{

	public abstract int size();
	public abstract boolean add(String e);
	public abstract boolean remove(Object o);
	public abstract boolean isEmpty();
	public abstract boolean contains(Object o);
	public abstract Iterator<String> iterator();
	public abstract Object[] toArray();
	public abstract <T> T[] toArray(T[] a);
	public abstract boolean containsAll(Collection<?> c);
	public abstract boolean addAll(Collection<? extends String> c);
	public abstract boolean addAll(int index, Collection<? extends String> c);
	public abstract boolean removeAll(Collection<?> c);
	public abstract boolean retainAll(Collection<?> c);
	public abstract void clear();
	//Ovo su sve metode od collections, ovo ispod su posebne ta list
	
	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set(int index, String element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<String> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<String> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
