import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.Rectangle;


public class bsP2Choose extends JPanel{

	String P2Name;
	private ButtonListener buttonListener;
	
	public bsP2Choose() {
		buttonListener = new ButtonListener(this);
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		
		JComboBox P2Pokemon = new JComboBox();
		P2Pokemon.setBounds(150, 100, 150, 50);
		add(P2Pokemon);
		P2Pokemon.addItem("Example");
		
		JComboBox P2PokeLvl = new JComboBox();
		P2PokeLvl.setBounds(450, 100, 150, 50);
		add(P2PokeLvl);
		
		JComboBox P2Move1 = new JComboBox();
		P2Move1.setBounds(30, 200, 150, 50);
		add(P2Move1);
	
		JComboBox P2Move2 = new JComboBox();
		P2Move2.setBounds(210, 200, 150, 50);
		add(P2Move2);
		
		JComboBox P2Move3 = new JComboBox();
		P2Move3.setBounds(390, 200, 150, 50);
		add(P2Move3);
		
		JComboBox P2Move4 = new JComboBox();
		P2Move4.setBounds(570, 200, 150, 50);
		add(P2Move4);
		
		JButton readyUp = new JButton("Ready Up");
		//buttonListener.registerScreen("Ready Up", bsP2Choose.class);
		readyUp.addActionListener(buttonListener);
		readyUp.setBounds(315, 360, 120, 30);
		add(readyUp);
		
		setP2Name();
		
	}

	private void setP2Name() {

		P2Name =  JOptionPane.showInputDialog(null, "Player 2 Name:");
		
	}
	
}
