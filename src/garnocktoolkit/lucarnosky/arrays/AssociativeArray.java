package garnocktoolkit.lucarnosky.arrays;

import garnocktoolkit.lucarnosky.exception.OutOfBoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class AssociativeArray.
 *@author Matteo Lucarno
 *@version 1.0.4
 *
 * Should works as PHP associative array
 * 
 * @param <String> the generic type
 * @param <Object> the generic type
 */
@SuppressWarnings("hiding")
public class AssociativeArray<String,Object> {

	/** The associative array. */
	Map<String, Object> associativeArray = new HashMap<String, Object>();
	
	/** The size. */
	int size = - 1;
	/** The automatic index. */
	int nIndex = 0;

	/**
	 * Adds the value at the specified key.
	 *
	 * @param keyName the name of the key
	 * @param value the value to add at the specified key
	 * @throws OutOfBoundException the out of bound exception
	 */
	public void add(String keyName, Object value) throws OutOfBoundException{
		if(size == -1 || this.getSize() < size){
			associativeArray.put(keyName, value);
		}else throw(new OutOfBoundException());
	}
	

	/**
	 * Adds the specified value to a number generated key.
	 *
	 * @param value the value to add
	 * @throws OutOfBoundException the out of bound exception
	 */
	@SuppressWarnings("unchecked")
	public void add(Object value) throws OutOfBoundException{
		if(size == -1 || this.getSize() < size){
			associativeArray.put((String) Integer.toString(nIndex), value);
			nIndex ++;
		}else throw(new OutOfBoundException());
		
	}
	
	/**
	 * Gets the value at the specified key.
	 *
	 * @param keyName the key name
	 * @return the object to get
	 */
	public Object get(String keyName){
		return associativeArray.get(keyName);
	}
	

	/**
	 * Check if a value is contained in the associative array.
	 *
	 * @param value the value to search
	 * @return true, if successful
	 */
	public boolean containsValue(Object value){
		return associativeArray.containsValue(value);
	}
	
	/**
	 * Check if an key is contained in the associative array.
	 *
	 * @param keyName the key name to search
	 * @return true, if successful
	 */
	public boolean containskey(String keyName){
		return associativeArray.containsKey(keyName);
	}
	
	/**
	 * Gets the element key.
	 *
	 * @param value the value
	 * @return the element key
	 */
	public String getElementKey(Object value){
		for (Map.Entry<String, Object> e : associativeArray.entrySet()) {
		    if(e.getValue() == value)
		    	return e.getKey();
		}
		return null;
	}
	
	/**
	 * Parses the keys.
	 *
	 * @return the array list
	 */
	public ArrayList<String> parsekeys(){
		ArrayList<String> keyes = new ArrayList<String>();
		for ( String key : associativeArray.keySet() ) {
		    keyes.add(key);
		}
		return keyes;
	}

	/**
	 * Parses the values.
	 *
	 * @return the array list
	 */
	public ArrayList<Object>parseValues(){
		ArrayList<Object> values = new ArrayList<Object>();
		for ( Object value : associativeArray.values() ) {
			values.add(value);
		}
		return values;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize(){
		return associativeArray.size();
	}
	
	/**
	 * Clear the associative array.
	 */
	public void clear(){
		associativeArray.clear();
	}

	/**
	 * Removes the element by specified key.
	 *
	 * @param key the key
	 */
	public void removeBykey(String key){
		associativeArray.remove(key);
	}
	
	/**
	 * Removes the element by key array.
	 *
	 * @param key the key
	 */
	public void removeBykey(String[] key){
		for (int i = 0; i < key.length ; i ++ ) {
			associativeArray.remove(key[i]);
		}
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty(){
		return (associativeArray.isEmpty());
	}
	
	/**
	 * Set Associative Array max size
	 * Set the size to -1 to unlimited size.
	 *
	 * @param size the size of the associative array
	 */
	public void setSize(int size){
		this.size = size;
	}
	
}
