package garnocktoolkit.lucarnosky.ui;

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
	 * Instantiates a new tabbed Gwindow and initialize it.
	 */
	public TabbedGWindow(){
		super();
		init();
	}
	
	/**
	 * Standard initialization of the tabbed Gwindow
	 */
	public void init(){
		title = "Garnock Tool Kit Tabbed GWindow";
		super.init();
	}
	
	

}
