import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class ButtonListener implements ActionListener {

	private BS_JPanel panel;
	private Map<String, Class> screens;
	private BattleSimulator battleSimulator;
	
	public ButtonListener(BS_JPanel panel, BattleSimulator battleSimulator){
		this.panel = panel;
		this.battleSimulator = battleSimulator;
		screens = new HashMap<String, Class>();
	}
	
	public void actionPerformed(ActionEvent e) {
		try{
			
			BS_JPanel temp = (BS_JPanel) screens.get(e.getActionCommand()).newInstance();
			
			((JFrame) SwingUtilities.getWindowAncestor(panel)).setContentPane(temp);
			temp.revalidate();
			temp.repaint();
			temp.attachBattleSimulator(battleSimulator);
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
	}
	
	public void registerScreen(String actionCommand, Class screen){
		screens.put(actionCommand, screen);
	}

}
