package garnocktoolkit.lucarnosky.auth;

import java.util.ArrayList;

import javax.swing.JFrame;

public class BaseAuthService extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 0;
	
	protected ArrayList<String>allowed = new ArrayList<String>();
	
	public BaseAuthService(){
		init();
	}
	
	private void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		requestFocus();
	}
	
	public boolean isAllowed(String elementToCheck){
		return allowed.contains(elementToCheck);
	}
	
	public void showWindow(){
		setVisible(true);
	}
	
	public void hideWindow(){
		setVisible(false);
	}
	
	public void setSize(int width, int height){
		setSize(width, height);
	}
	
	public void updateWindow(){
		repaint();
	}
	
	
	
	
}
