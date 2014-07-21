package garnocktoolkit.lucarnosky.auth;

import garnocktoolkit.lucarnosky.exception.NoAllowedException;

import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * The Class BaseAuthService.
 * @author Matteo Lucarno
 * @version 1.0.1
 */
public class BaseAuthService extends JFrame{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 0;
	
	/** The allowed list. */
	protected ArrayList<String>allowed = new ArrayList<String>();
	
	/**
	 * Instantiates a new base auth service and initiate it.
	 */
	public BaseAuthService(){
		init();
	}
	
	/**
	 * Inits the service.
	 */
	private void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		this.requestFocus();
	}
	
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
	 * Show window.
	 */
	public void showWindow(){
		this.setVisible(true);
	}
	
	/**
	 * Hide window.
	 */
	public void hideWindow(){
		this.setVisible(false);
	}
	
	/**
	 * Update window graphic.
	 */
	public void updateWindow(){
		repaint();
	}
	
	/**
	 * Sets the allowed.
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
	 */
	public void setAllowed(String allowed){
		this.allowed.add(allowed);
	}
	
	/**
	 * Log in.
	 *
	 * @param username the username to check
	 * @return 1 if is allowed, -1 if is not allowed
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
