import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;


public class bsP1Choose extends JPanel {

	String P1Name, P2Name;
	
	public bsP1Choose() {
		setLayout(null);
		setBackground(new Color(205, 205, 205));
		
		JComboBox P1pokemon = new JComboBox();
		P1pokemon.setBounds(275, 200, 200, 50);
		add(P1pokemon);
		
		JComboBox P1pokemonLevel = new JComboBox();
		P1pokemonLevel.setBounds(275, 250, 200, 50);
		add(P1pokemonLevel);
		/*
		JComboBox P2pokemon = new JComboBox();
		P2pokemon.setBounds(430, 150, 200, 50);
		add(P2pokemon);
		
		JComboBox P2pokemonLevel = new JComboBox();
		P2pokemonLevel.setBounds(430, 180, 200, 50);
		add(P2pokemonLevel);
		*/
	

		setP1Name();
		//setP2Name();
		
		
		
	}
	
	public void setP1Name(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
	/*public void setP2Name(){
		
		P2Name =  JOptionPane.showInputDialog(null, "Player 2 Name:");
	    
	}*/
}
