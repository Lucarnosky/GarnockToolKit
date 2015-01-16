package garnocktoolkit.lucarnosky.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

// TODO: Auto-generated Javadoc
/**
 * The Class TabbedWindow.
 * @author Matteo Lucarno
 * @version 1.0.0
 */

public class TabbedGWindow extends GWindow{

	/**
	 * 
	 */
	private static final long serialVersionUID = 0;
	
	/**
	 * numberOfTab 
	 */
	protected int noOfTab = 2;
	
	/**
	 * tabbed panel itself
	 */
	protected JTabbedPane tabs;
	
	protected JPanel backPanel;
	/**
	 * Instantiates a new tabbed Gwindow and initialize it.
	 */
	public TabbedGWindow(){
		super();
		init();
	}
	
	/**
	 * Standard initialization of the tabbed GWindow
	 */
	protected void init(){
		super.init();
		tabs = new JTabbedPane();
		backPanel = new JPanel();
		backPanel.setBackground(Color.yellow);
		addComponent(backPanel,GWindow.Location.TOP);
		windowTitle("Garnock Tool Kit Tabbed GWindow");
	}
	
	/**
	 * Create a new Tab in the tabbed GWindow
	 * @param tabName the name of the tab
	 */
	public void newTab(String tabName){
		tabs.addTab(tabName,backPanel);
	}
	

}
