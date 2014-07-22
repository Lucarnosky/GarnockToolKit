package garnocktoolkit.lucarnosky.auth;

import garnocktoolkit.lucarnosky.arrays.AssociativeArray;
import garnocktoolkit.lucarnosky.exception.NoAllowedException;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

/**
 * The Class BaseAuthService.
 * @author Matteo Lucarno
 * @version 1.0.5
 */
public class BaseAuthService{

	/**Window location on the screen */
	public static Component CENTER_LOCATION;
	public static float BOTTOM_LOCATION = Component.BOTTOM_ALIGNMENT;
	
	/** The allowed list. */
	protected ArrayList<String>allowed = new ArrayList<String>();
	protected Font[] allFonts;
	protected String title;
	protected boolean allowResize = true;
	protected AssociativeArray<String, Component> components = new AssociativeArray<String, Component>();  
	
	/**
	 * Checks if is allowed.
	 *
	 * @param elementToCheck the element to check
	 * @return true, if is in the allowed list
	 */
	public boolean isAllowed(String elementToCheck){
		return allowed.contains(elementToCheck);
	}
	
	/**
	 * Sets the new allowed.
	 *
	 * @param allowed the new allowed list
	 */
	public void setAllowed(ArrayList<String> allowed){
		this.allowed = allowed;
	}
	
	/**
	 * Sets the allowed.
	 *
	 * @param allowed Add new allowed in the allowed list
	 * @return -1 if the param is already in the allowed list, 0 if he param is succeffully added to the allowed list
	 */
	public int setAllowed(String allowed){
		if(this.allowed.contains(allowed))
			return -1;
		else
			this.allowed.add(allowed);
		return 0;
	}
	
	/**
	 * Log in.
	 *
	 * @param username the username to check
	 * @return 1 if is in allowed list , -1 if is not in allowed list
	 * @throws NoAllowedException if the allowed list is empty
	 */
	public int logIn(String username){
		if(allowed.isEmpty())
			throw(new NoAllowedException());
		if(isAllowed(username)){
			System.out.println("Allowed can proceed");
			return 1;
		}else {
			return -1;
		}
	}
}
