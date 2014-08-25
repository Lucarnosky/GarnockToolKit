package garnocktoolkit.lucarnosky.exception;

public class InvalidPositionException extends GException{

	/**
	 * InvalidPositionException 
	 * This exception is thrown when an invalid position is specified for GWindow and sons
	 * while adding component
	 * 
	 * @author Matteo Lucarno
	 * @version 1.0.2
	 */
	private static final long serialVersionUID = 0;
	
	public InvalidPositionException(){
		super("The specified position is invalid, please check the javadoc");
	}

}
