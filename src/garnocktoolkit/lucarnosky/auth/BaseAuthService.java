package garnocktoolkit.lucarnosky.auth;

import garnocktoolkit.lucarnosky.exception.NoAllowedException;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * The Class BaseAuthService.
 * @author Matteo Lucarno
 * @version 1.0.5
 */
public class BaseAuthService extends JFrame{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 0;
	/**Window location on the screen */
	public static Component CENTER_LOCATION;
	public static float BOTTOM_LOCATION = Component.BOTTOM_ALIGNMENT;
	
	/** The allowed list. */
	protected ArrayList<String>allowed = new ArrayList<String>();
	protected Font[] allFonts;
	protected String title;
	protected boolean allowResize = true;
	
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
		screenLocation(CENTER_LOCATION);
		setTitle(title);
		setResizable(allowResize);
		
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
	 * Changes the window dimension
	 * @param width the width of the window
	 * @param height the height of the window
	 */
	public void changeDimension(int width, int height){
		setSize(width,height);
		updateWindow();
	}
	
	/**
	 * Position of the Window in the screen
	 * @param location the location on the screen
	 */
	public void screenLocation(Component location){
		setLocationRelativeTo(location);
	}
	
	/**
	 * Show window.
	 */
	public void showWindow(){
		this.setVisible(true);
		this.requestFocus();
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
	
	/**
	 * Changes the window title 
	 * @param title The title you want to appear on the top bar of the window
	 */
	public void windowTitle(String title){
		setTitle(title);
		this.title = title;
		updateWindow();
	}
	
	/**
	 * Let the programmer decide if the created window should be resizable by the user
	 * @param isResizable true if the user can resize the window
	 */
	public void allowResize(boolean isResizable){
		allowResize = isResizable;
	}
	
}
