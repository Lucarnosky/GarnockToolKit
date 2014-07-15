package garnocktoolkit.lucarnosky.arrays;

import garnocktoolkit.lucarnosky.exception.OutOfBoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The Class AssociativeArray.
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
	int size = - 1;
	/** The automatic index. */
	int nIndex = 0;

	/**
	 * Adds the.
	 *
	 * @param indexName the index name
	 * @param value the value to add
	 * @throws OutOfBoundException 
	 */
	public void add(String indexName, Object value) throws OutOfBoundException{
		if(size == -1 || this.getSize() < size){
			associativeArray.put(indexName, value);
		}else throw(new OutOfBoundException());
	}
	

	/**
	 * Adds the specified value.
	 *
	 * @param value the value to add
	 * @throws OutOfBoundException 
	 */
	@SuppressWarnings("unchecked")
	public void add(Object value) throws OutOfBoundException{
		if(size == -1 || this.getSize() < size){
			associativeArray.put((String) Integer.toString(nIndex), value);
			nIndex ++;
		}else throw(new OutOfBoundException());
		
	}
	

	/**
	 * Gets the value at the specified index.
	 *
	 * @param indexName the index name
	 * @return the object to get
	 */
	public Object get(String indexName){
		return associativeArray.get(indexName);
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
	 * Check if an index is contained in the associative array.
	 *
	 * @param indexName the index name to search
	 * @return true, if successful
	 */
	public boolean containsIndex(String indexName){
		return associativeArray.containsKey(indexName);
	}
	
	/**
	 * Gets the element index.
	 *
	 * @param value the value
	 * @return the element index
	 */
	public String getElementIndex(Object value){
		for (Map.Entry<String, Object> e : associativeArray.entrySet()) {
		    if(e.getValue() == value)
		    	return e.getKey();
		}
		return null;
	}
	
	/**
	 * Parses the indexes.
	 *
	 * @return the array list
	 */
	public ArrayList<String> parseIndexes(){
		ArrayList<String> indexes = new ArrayList<String>();
		for ( String key : associativeArray.keySet() ) {
		    indexes.add(key);
		}
		return indexes;
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
	 * Removes the element by specified index.
	 *
	 * @param index the index
	 */
	public void removeByIndex(String index){
		associativeArray.remove(index);
	}
	
	/**
	 * Removes the element by index array.
	 *
	 * @param index the index
	 */
	public void removeByIndex(String[] index){
		for (int i = 0; i < index.length ; i ++ ) {
			associativeArray.remove(index[i]);
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
	 * Set the size to -1 to unlimited size
	 * @param size the size of the associative array
	 */
	public void setSize(int size){
		this.size = size;
	}
	
}
