import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class ButtonListener implements ActionListener {

	private JPanel panel;
	private Map<String, Class> screens;
	
	public ButtonListener(JPanel panel){
		this.panel = panel;
		screens = new HashMap<String, Class>();
	}
	
	public void actionPerformed(ActionEvent e) {
		try{
			
			JPanel temp = (JPanel) screens.get(e.getActionCommand()).newInstance();
			
			((JFrame) SwingUtilities.getWindowAncestor(panel)).setContentPane(temp);
			temp.revalidate();
			temp.repaint();
			
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
	}
	
	public void registerScreen(String actionCommand, Class screen){
		screens.put(actionCommand, screen);
	}

}
