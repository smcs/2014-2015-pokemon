import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BS_ButtonListener implements ActionListener {

	private BattleSimulator bs;
	private int button;
	private Player p1, p2;

	public BS_ButtonListener(BattleSimulator battleSimulator) {
		bs = battleSimulator;
		
		p1 = bs.getPlayer(0);
		p2 = bs.getPlayer(1);

	}

	public void actionPerformed(ActionEvent e) {
		if (button == 1) {
			BS_Arena.doP1Move1();
		}
		if (button == 2) {
			BS_Arena.doP1Move2();
		}
		if (button == 3) {
			BS_Arena.doP1Move3();
		}
		if (button == 4) {
			BS_Arena.doP1Move4();
		}
		if (button == 5) {
			BS_Arena.doP2Move1();
		}
		if (button == 6) {
			BS_Arena.doP2Move2();
		}
		if (button == 7) {
			BS_Arena.doP2Move3();
		}
		if (button == 8) {
			BS_Arena.doP2Move4();
		}

	}

	public void registerButton(int actionCommand) {
		button = actionCommand;
	}

}
