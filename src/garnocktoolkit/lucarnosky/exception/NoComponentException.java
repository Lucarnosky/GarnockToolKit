package garnocktoolkit.lucarnosky.exception;

public class NoComponentException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 0;
	
	public NoComponentException(){
		super("No component in the specified location");
		System.exit(-1);
	}

}
