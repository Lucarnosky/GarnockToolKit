package garnocktoolkit.lucarnosky.ui;

import garnocktoolkit.lucarnosky.arrays.AssociativeArray;
import garnocktoolkit.lucarnosky.exception.NoAllowedException;
import garnocktoolkit.lucarnosky.exception.NoComponentException;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * The Class BaseAuthService.
 * @author Matteo Lucarno
 * @version 1.0.5
 */
public class LWindow extends JFrame{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 0;
	/**Window location on the screen */
	public static Component CENTER_LOCATION;
	public static float BOTTOM_LOCATION = Component.BOTTOM_ALIGNMENT;
	
	/** The allowed list. */
	protected String title;
	protected boolean allowResize = true;
	protected AssociativeArray<String, Component> components = new AssociativeArray<String, Component>();  
	/**
	 * Instantiates a new base auth service and initiate it.
	 */
	public LWindow(){
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
		setLayout(new BorderLayout());
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
	
	public void addTopComponent(Component topComponent){
		add(topComponent,BorderLayout.PAGE_START);
		components.add("TopComponent", topComponent);
		updateWindow();
	}
	
	public void addLeftComponent(Component leftComponent){
		add(leftComponent,BorderLayout.LINE_START);
		components.add("LeftComponent",leftComponent);
		updateWindow();
	}
	
	public void addRightComponent(Component rightComponent){
		add(rightComponent,BorderLayout.LINE_END);
		components.add("RightComponent",rightComponent);
		updateWindow();
	}
	
	public  void addCenterComponent(Component centerComponent){
		add(centerComponent, BorderLayout.CENTER);
		components.add("CenterComponent",centerComponent);
		updateWindow();
	}
	
	public void addBottomComponent(Component bottomComponent){
		add(bottomComponent, BorderLayout.PAGE_END);
		components.add("BottomComponent",bottomComponent);
		updateWindow();
	}
	
	public void removeLeft(){
		if(components.get("LeftComponenet") != null ){
			remove(components.get("LeftComponent"));
			components.removeBykey("LeftComponent");
			updateWindow();
		}else{
			throw(new NoComponentException());
		}
	}
}
