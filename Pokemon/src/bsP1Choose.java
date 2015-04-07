import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Vector;


public class bsP1Choose extends JPanel {

	String P1Name;
	private ButtonListener buttonListener;
	
	
	public bsP1Choose() {
		
		//pokeList = new Vector<Poke>();
		//pokeList.add(new Poke ("#001 Bulbasaur"));
		
		buttonListener = new ButtonListener(this);
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		
		JComboBox P1Pokemon = new JComboBox();
		P1Pokemon.setBounds(150, 100, 150, 50);
		add(P1Pokemon);
		//P1Pokemon.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1PokeLvl = new JComboBox();
		P1PokeLvl.setBounds(450, 100, 150, 50);
		add(P1PokeLvl);
		
		JComboBox P1Move1 = new JComboBox();
		P1Move1.setBounds(30, 200, 150, 50);
		add(P1Move1);
	
		JComboBox P1Move2 = new JComboBox();
		P1Move2.setBounds(210, 200, 150, 50);
		add(P1Move2);
		
		JComboBox P1Move3 = new JComboBox();
		P1Move3.setBounds(390, 200, 150, 50);
		add(P1Move3);
		
		JComboBox P1Move4 = new JComboBox();
		P1Move4.setBounds(570, 200, 150, 50);
		add(P1Move4);
		
		JButton readyUp = new JButton("Ready Up");
		buttonListener.registerScreen("Ready Up", bsP2Choose.class);
		readyUp.addActionListener(buttonListener);
		readyUp.setBounds(315, 360, 120, 30);
		add(readyUp);
		
		setP1Name();
		
	}
	
	public void setP1Name(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
}