package garnocktoolkit;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import garnocktoolkit.lucarnosky.auth.BaseAuthService;
import garnocktoolkit.lucarnosky.exception.OutOfBoundException;
import garnocktoolkit.lucarnosky.ui.GWindow;

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
		final GWindow base = new GWindow();
		base.changeDimension(500, 500);
		base.screenLocation(BaseAuthService.CENTER_LOCATION);
		base.windowTitle("Prova");
		JPanel tp = new JPanel();
		JPanel b = new JPanel();
		JButton b1 = new JButton("Culo");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				base.removeComponent(GWindow.Location.BOTTOM);
			}
		});
		b.setBackground(Color.yellow);
		tp.add(b1);
		tp.setBackground(Color.black);
		base.addComponent(tp,GWindow.Location.TOP);
		base.showWindow();
	}
}
