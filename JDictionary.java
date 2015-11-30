import java.util.List;
import java.util.ArrayList;

class JDictionary<K, V>{
	private List<K> keys;
	private List<V> values;
	public static int length = 0;
	
	public class Pair{
		public K key;
		public V value;
		public Pair(K theKey, V theValue){
			key = theKey; value = theValue;
		}
	}
	
	public JDictionary(){
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
	}

	public void put(K key, V value){
		keys.add(key);
		values.add(value);
		length++;
	}

	public K getKey(int i){
		return keys.get(i);
	}
	
	public V getValue(int i){
		return values.get(i);
	}
	
	public Pair get(int i){
		return new Pair(getKey(i), getValue(i)); 
	}
	
	public void remove(int i){
		keys.remove(i);
		values.remove(i);
		length--;
	}
	
	public void remove(K key){
		remove(at(key));
	}

	public void setValue(K key, V value){
		values.set(at(key), value);
	}

	public void setKey(K key, K newKey){
		keys.set(at(key), newKey);
	}
	
	// convenience function
	private int at(K key)
	{
		return keys.indexOf(key);
	}
}
