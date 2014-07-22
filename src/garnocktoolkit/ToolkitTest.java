package garnocktoolkit;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import garnocktoolkit.lucarnosky.auth.BaseAuthService;
import garnocktoolkit.lucarnosky.auth.TabbedWindow;
import garnocktoolkit.lucarnosky.exception.OutOfBoundException;

// TODO: Auto-generated Javadoc
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
		final TabbedWindow base = new TabbedWindow();
		//base.setAllowed("Check");
		base.changeDimension(500, 500);
		base.screenLocation(BaseAuthService.CENTER_LOCATION);
		base.windowTitle("Prova");
		JPanel tp = new JPanel();
		JPanel b = new JPanel();
		JButton b1 = new JButton("Culo");
		//JButton b2 = new JButton("Culo 2");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				base.removeLeft();
			}
		});
		tp.add(b1);
		tp.setBackground(Color.black);
		
		
		base.addTopComponent(b);
		//base.addBottomComponent(tp);
		//base.addLeftComponent(tp);
		base.showWindow();
	}
}
