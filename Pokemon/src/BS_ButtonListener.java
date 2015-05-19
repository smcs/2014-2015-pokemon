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

	public BS_ButtonListener(BattleSimulator battleSimulator, BS_Arena bs_arena) {
		bs = battleSimulator;
		bsa = bs_arena;

		p1 = bs.getPlayer(0);
		p2 = bs.getPlayer(1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == bsa.getP1Move1()) {
			bsa.doP1Move1();
		}
		if (e.getActionCommand() == bsa.getP1Move2()) {
			bsa.doP1Move2();
		}
		if (e.getActionCommand() == bsa.getP1Move3()) {
			bsa.doP1Move3();
		}
		if (e.getActionCommand() == bsa.getP1Move4()) {
			bsa.doP1Move4();
		}
		if (e.getActionCommand() == bsa.getP2Move1()) {
			bsa.doP2Move1();
		}
		if (e.getActionCommand() == bsa.getP2Move2()) {
			bsa.doP2Move2();
		}
		if (e.getActionCommand() == bsa.getP2Move3()) {
			bsa.doP2Move3();
		}
		if (e.getActionCommand() == bsa.getP2Move4()) {
			bsa.doP2Move4();
		}

	}

	public void registerButton(int actionCommand) {
		button = actionCommand;
	}

}
