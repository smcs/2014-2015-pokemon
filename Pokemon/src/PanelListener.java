import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
	
		JComboBox cb = (JComboBox) e.getSource();
		System.out.println(cb.getSelectedItem().toString());
		
		
	}

}
