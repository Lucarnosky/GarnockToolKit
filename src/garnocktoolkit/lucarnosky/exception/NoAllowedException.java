package garnocktoolkit.lucarnosky.exception;

/**
 * The Class NoAllowedException.
 * This exception is thrown when in the basicAuthService there's no elements in the allowed list
 * @author Matteo Lucarno
 * @version 1.0.2
 */

public class NoAllowedException extends GException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 0;
	
	/**
	 * Instantiates a new "No Allowed Exception".
	 */
	public NoAllowedException(){
		super("No allowed in allowed list");
	}

}
