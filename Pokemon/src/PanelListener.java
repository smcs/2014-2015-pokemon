import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelListener implements ActionListener{

	private BS_PlayerChoose myPanel;
	
	public PanelListener(BS_PlayerChoose p) {
		myPanel = p;
	}
	
	public void actionPerformed(ActionEvent e) {
	
		JComboBox cb = (JComboBox) e.getSource();
		System.out.println(cb.getSelectedIndex() + 1);
		myPanel.setPokemon();
		
	}

}
