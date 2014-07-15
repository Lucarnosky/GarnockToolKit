package garnocktoolkit.lucarnosky.exception;

public class OutOfBoundException extends Exception{

	/**
	 *  Exception thrown when index is out of bound
	 */
	private static final long serialVersionUID = 0;

	public OutOfBoundException(){
		super("Index out of bounds - Set size to -1 or extends the size");
	}
}
