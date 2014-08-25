/*
 * 
 */
package garnocktoolkit.lucarnosky.exception;

/**
 * The Class OutOfBoundException.
 * @author Matteo Lucarno
 * @version 1.0.2
 */
public class OutOfBoundException extends GException{

	/**  Exception thrown when index is out of bound. */
	private static final long serialVersionUID = 0;

	/**
	 * Instantiates a new out of bound exception.
	 */
	public OutOfBoundException(){
		super("Index out of bounds - Set size to -1 or extends the size");
		System.exit(-1);
	}
	
}
