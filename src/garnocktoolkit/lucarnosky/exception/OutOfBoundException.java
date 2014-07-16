/*
 * 
 */
package garnocktoolkit.lucarnosky.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class OutOfBoundException.
 */
public class OutOfBoundException extends RuntimeException{

	/**  Exception thrown when index is out of bound. */
	private static final long serialVersionUID = 0;

	/**
	 * Instantiates a new out of bound exception.
	 */
	public OutOfBoundException(){
		super("Index out of bounds - Set size to -1 or extends the size");
	}
	
}
