import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;


public class bsP1Choose extends JPanel {

	String P1Name;
	
	public bsP1Choose() {
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		
		JComboBox P1pokemon = new JComboBox();
		P1pokemon.setBounds(new Rectangle(0, 0, 750, 500));
		P1pokemon.setBounds(275, 200, 200, 50);
		add(P1pokemon);
		
		JComboBox P1pokemonLevel = new JComboBox();
		P1pokemonLevel.setBounds(275, 250, 200, 50);
		add(P1pokemonLevel);
		
		JButton readyUp = new JButton("Ready Up");
		readyUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel bsP2Choose = new bsP2Choose();
				setContentPane(bsP2Choose);
				bsP2Choose.revalidate();
				bsP2Choose.repaint();
			}
		});
		readyUp.setBounds(315, 360, 120, 30);
		add(readyUp);
		
	

		setP1Name();
		
	}
	
	public void setP1Name(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
}