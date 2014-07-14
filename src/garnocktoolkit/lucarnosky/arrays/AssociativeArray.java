package garnocktoolkit.lucarnosky.arrays;

import java.util.HashMap;
import java.util.Map;

public class AssociativeArray {

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
	public void add(Object value){
		associativeArray.put(String.valueOf(nIndex), value);
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
	public boolean contains(Object value){
		return associativeArray.containsValue(value);
	}
	
	/*
	 * Return if the specified index is contained in the array
	 * @param indexName to check if is contained in the array
	 */
	public boolean contains(String indexName){
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
	
	
}
