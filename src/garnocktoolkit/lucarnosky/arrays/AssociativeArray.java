package garnocktoolkit.lucarnosky.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("hiding")
public class AssociativeArray<String,Object> {

	/*
	 * Associative Array works as associative array in php
	 * the index can be a text instead of a number
	 */
	Map<String, Object> associativeArray = new HashMap<String, Object>();
	private int nIndex = 0;

	public AssociativeArray(){
		
	}
	
	/*
	 * Add to the specified index the specified value
	 * @param indexName the name of the index
	 * @param value the object to save in the specified index
	 */
	public void add(String indexName, Object value){
		associativeArray.put(indexName, value);
	}
	
	/*
	 * Add the specified value at a normal int value
	 * @param value the object to save 
	 */
	@SuppressWarnings("unchecked")
	public void add(Object value){
		associativeArray.put((String) Integer.toString(nIndex), value);
		nIndex ++;
	}
	
	/*
	 * Return the object stored in the specified index
	 * @param indexname The index to read
	 */
	public Object get(String indexName){
		return associativeArray.get(indexName);
	}
	
	/*
	 * Return if the specified value is contained in the array
	 * @param value to check if is contained in the array
	 */
	public boolean containsValue(Object value){
		return associativeArray.containsValue(value);
	}
	
	/*
	 * Return if the specified index is contained in the array
	 * @param indexName to check if is contained in the array
	 */
	public boolean containsIndex(String indexName){
		return associativeArray.containsKey(indexName);
	}
	
	/*
	 * Return the index of the specified value
	 * @param value to get the index
	 */
	public String getElementIndex(Object value){
		for (Map.Entry<String, Object> e : associativeArray.entrySet()) {
		    if(e.getValue() == value)
		    	return e.getKey();
		}
		return null;
	}
	
	/*
	 * Get all index of the current associative array
	 * return an arraylist of string
	 */
	public ArrayList<String> parseIndexes(){
		ArrayList<String> indexes = new ArrayList<String>();
		for ( String key : associativeArray.keySet() ) {
		    indexes.add(key);
		}
		return indexes;
	}

	/*
	 * Get all values in the current associative array
	 * return an arraylist of object
	 */
	public ArrayList<Object>parseValues(){
		ArrayList<Object> values = new ArrayList<Object>();
		for ( Object value : associativeArray.values() ) {
			values.add(value);
		}
		return values;
	}
	
	/*
	 * Return the size of the array
	 * return an integer
	 */
	public int getSize(){
		return associativeArray.size();
	}
	
	/*
	 * clear the associative array
	 */
	public void clear(){
		associativeArray.clear();
	}

	/*
	 * Remove element at the specified index
	 * @param index to remove
	 */
	public void removeByIndex(String index){
		associativeArray.remove(index);
	}
	
	/*
	 * Remove element at the specified indexes
	 * @param index array to remove
	 */
	public void removeByIndex(String[] index){
		for (int i = 0; i < index.length ; i ++ ) {
			associativeArray.remove(index[i]);
		}
	}

	/*
	 * Check if the associative array contains something
	 * return boolean
	 */
	public boolean isEmpty(){
		return (associativeArray.isEmpty());
	}
	
}
