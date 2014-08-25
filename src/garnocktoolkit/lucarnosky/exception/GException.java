package garnocktoolkit.lucarnosky.exception;

public class GException extends RuntimeException{

	/**
	 * GException
	 * Garnock Exception parent class for all Exception in Garnock Toolkit
	 * 
	 * @author Matteo Lucarno
	 * @version 1.0.0
	 */
	private static final long serialVersionUID = 0;

	public GException(String message){
	
		super(message);
		System.exit(-1);
	}
}
