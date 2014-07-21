package garnocktoolkit.lucarnosky.auth;

import garnocktoolkit.lucarnosky.exception.NoAllowedException;

import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * The Class BaseAuthService.
 * @author Matteo Lucarno
 * @version 1.0.0
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
	 * @return true, if is allowed
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
	
	/* (non-Javadoc)
	 * @see java.awt.Window#setSize(int, int)
	 */
	public void setSize(int width, int height){
		//this.setSize(32, 32);
	}
	
	/**
	 * Update window.
	 */
	public void updateWindow(){
		repaint();
	}
	
	/**
	 * Sets the allowed.
	 *
	 * @param allowed the new allowed
	 */
	public void setAllowed(ArrayList<String> allowed){
		this.allowed = allowed;
	}
	
	/**
	 * Sets the allowed.
	 *
	 * @param allowed the new allowed
	 */
	public void setAllowed(String allowed){
		this.allowed.add(allowed);
	}
	
	/**
	 * Log in.
	 *
	 * @param username the username
	 */
	public void logIn(String username){
		if(isAllowed(username)){
			System.out.println("Allowed can proceed");
		}else throw(new NoAllowedException());
	}
	
}
