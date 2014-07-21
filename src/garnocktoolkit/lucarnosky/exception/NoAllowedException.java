package garnocktoolkit.lucarnosky.exception;

/**
 * The Class NoAllowedException.
 * @author Matteo Lucarno
 * @version 1.0.0
 */

public class NoAllowedException extends RuntimeException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 0;
	
	/**
	 * Instantiates a new "No Allowed Exception".
	 */
	public NoAllowedException(){
		super("No allowed in allowed list");
	}

}
