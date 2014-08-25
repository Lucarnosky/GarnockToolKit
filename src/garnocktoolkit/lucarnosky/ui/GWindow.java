package garnocktoolkit.lucarnosky.ui;

import garnocktoolkit.lucarnosky.arrays.AssociativeArray;
import garnocktoolkit.lucarnosky.exception.InvalidPositionException;
import garnocktoolkit.lucarnosky.exception.NoComponentException;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.tools.JavaCompiler;

/**
 * The Class GWindow.
 * @author Matteo Lucarno
 * @version 1.0.2
 * 
 */
public class GWindow extends JFrame{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 0;
	
	/** Window location on the screen. */
	public static Component CENTER_LOCATION;
	
	/** The bottom location. */
	public static float BOTTOM_LOCATION = Component.BOTTOM_ALIGNMENT;
	
	/** Title of the window. */
	protected String title;
	
	/** Enable or disable window resizing. */
	protected boolean allowResize = true;
	
	public enum Location{
		LEFT,RIGHT,TOP,BOTTOM,CENTER;
	}
	
	/** The components added in the window. */
	protected AssociativeArray<String, Component> components = new AssociativeArray<String, Component>();  
	
	/**
	 * Instantiates a new Garnock Window and initiate it.
	 */
	public GWindow(){
		init();
	}
	
	/**
	 * GWindow default initialization.
	 */
	private void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		screenLocation(CENTER_LOCATION);
		setTitle(title);
		setResizable(allowResize);
		setLayout(new BorderLayout());
	}
	
	/**
	 * Changes the window dimension.
	 *
	 * @param width the width of the window
	 * @param height the height of the window
	 */
	public void changeDimension(int width, int height){
		setSize(width,height);
		updateWindow();
	}
	
	/**
	 * Position of the Window in the screen.
	 *
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
	 * Changes the window title .
	 *
	 * @param title The title you want to appear on the top bar of the window
	 */
	public void windowTitle(String title){
		setTitle(title);
		this.title = title;
		updateWindow();
	}
	
	/**
	 * Let the programmer decide if the created window should be resizable by the user.
	 *
	 * @param isResizable true if the user can resize the window
	 */
	public void allowResize(boolean isResizable){
		allowResize = isResizable;
	}
	
	/**
	 * Adds the component.
	 *
	 * @param component the component
	 * @param location the location avaiable in the Location enum
	 */
	public void addComponent(Component component, Location location){
		
		switch(location){
		case TOP:
			add(component,BorderLayout.PAGE_START);
			components.add("TopComponent", component);
			break;
		case BOTTOM:
			if(components.get("TopComponent") != null){
				remove(components.get("TopComponent"));
				components.removeBykey("TopComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case LEFT:
			if(components.get("TopComponent") != null){
				remove(components.get("TopComponent"));
				components.removeBykey("TopComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case RIGHT:
			if(components.get("TopComponent") != null){
				remove(components.get("TopComponent"));
				components.removeBykey("TopComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case CENTER:
			add(component,BorderLayout.CENTER);
			components.add("CenterComponent", component);
			break;
		default:
			throw new InvalidPositionException();
		}
		updateWindow();
	}
	
	/**
	 * Removes the component.
	 *
	 * @param location the location avaiable in the Location enum
	 */
	public void removeComponent(Location location){
		switch(location){
		case TOP:
			if(components.get("TopComponent") != null){
				remove(components.get("TopComponent"));
				components.removeBykey("TopComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case BOTTOM:
			if(components.get("BottomComponent") != null){
				remove(components.get("BottomComponent"));
				components.removeBykey("BottomComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case LEFT:
			if(components.get("LeftComponent") != null){
				remove(components.get("LeftComponent"));
				components.removeBykey("LeftComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case RIGHT:
			if(components.get("RightComponent") != null){
				remove(components.get("RightComponent"));
				components.removeBykey("RightComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		case CENTER:
			if(components.get("CenterComponent") != null){
				remove(components.get("CenterComponent"));
				components.removeBykey("CenterComponent");
			}else{
				throw(new NoComponentException());
			}
			break;
		default:
			throw new InvalidPositionException();
		}
		updateWindow();
	}
	
}
