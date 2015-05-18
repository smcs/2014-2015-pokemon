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
	private BS_Arena bsa;
	private int button;
	private Player p1, p2;

	public BS_ButtonListener(BattleSimulator battleSimulator) {
		bs = battleSimulator;
		
		p1 = bs.getPlayer(0);
		p2 = bs.getPlayer(1);

	}

	public void actionPerformed(ActionEvent e) {
		if (button == 1) {
			bsa.doP1Move1();
			bsa.setP2Health();
		}
		if (button == 2) {
			bsa.doP1Move2();
			bsa.setP2Health();
		}
		if (button == 3) {
			bsa.doP1Move3();
			bsa.setP2Health();
		}
		if (button == 4) {
			bsa.doP1Move4();
			bsa.setP2Health();
		}
		if (button == 5) {
			bsa.doP2Move1();
			bsa.setP1Health();
		}
		if (button == 6) {
			bsa.doP2Move2();
			bsa.setP1Health();
		}
		if (button == 7) {
			bsa.doP2Move3();
			bsa.setP1Health();
		}
		if (button == 8) {
			//bsa.doP2Move4();
			//bsa.setP1Health();
		}

	}

	public void registerButton(int actionCommand) {
		button = actionCommand;
	}

}
