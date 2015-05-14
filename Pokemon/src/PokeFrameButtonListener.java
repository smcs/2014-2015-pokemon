import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PokeFrameButtonListener implements ActionListener {

	private BS_JPanel panel;
	private Map<String, Class> screens;
	private BattleSimulator battleSimulator;
	private int button;
	private Player p;

	public PokeFrameButtonListener(BS_JPanel panel, BattleSimulator battleSimulator) {
		this.panel = panel;
		this.battleSimulator = battleSimulator;
	}

	public void actionPerformed(ActionEvent e) {

		Window home = SwingUtilities.getWindowAncestor(panel);
		
		if(button == 1){
			BS_JPanel temp = new BS_PlayerChoose(battleSimulator);
			((JFrame) home).setContentPane(temp);
			temp.revalidate();
			temp.repaint();
			temp.attachBattleSimulator(battleSimulator);
			
		}

			/*BS_JPanel temp = (BS_JPanel) screens.get(e.getActionCommand())
					.newInstance();

			((JFrame) SwingUtilities.getWindowAncestor(panel))
					.setContentPane(temp);
			temp.revalidate();
			temp.repaint();
			temp.attachBattleSimulator(battleSimulator);
			*/


	}

	public void registerButton(int actionCommand) {
		button = actionCommand;
	}

}
