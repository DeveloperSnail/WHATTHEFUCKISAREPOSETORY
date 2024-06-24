package maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class SuceljeMapBilj implements Map<String, String>{


	public abstract int size();
	public abstract boolean isEmpty();

	
	public abstract boolean containsKey(Object key);
	public abstract boolean containsValue(Object value);

	public abstract String get(Object key);
	public abstract String put(String key, String value);
	public abstract String remove(Object key);

	public abstract void putAll(Map<? extends String, ? extends String> m);
	public abstract void clear();

	
	public abstract Set<String> keySet();
	public abstract Collection<String> values();
	public abstract Set<Entry<String, String>> entrySet();

	
	//...see more methods, search MAP DEFAULT METHODS
}
