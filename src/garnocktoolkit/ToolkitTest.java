package garnocktoolkit;

import garnocktoolkit.lucarnosky.auth.BaseAuthService;
import garnocktoolkit.lucarnosky.exception.OutOfBoundException;
import garnocktoolkit.lucarnosky.ui.TabbedGWindow;

/**
 * The Class ToolkitTest.
 */
public class ToolkitTest {

	/**
	 * Instantiates a new toolkit test.
	 */
	public ToolkitTest(){
		
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws OutOfBoundException the out of bound exception
	 */
	public static void main(String[] args) throws OutOfBoundException {
		final TabbedGWindow base = new TabbedGWindow();
		base.changeDimension(500, 500);
		base.screenLocation(BaseAuthService.CENTER_LOCATION);
		base.newTab("Tab 1");
		base.showWindow();
	}
}
