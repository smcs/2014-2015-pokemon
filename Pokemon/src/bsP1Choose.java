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
		
		Vector<Poke> pokeList = Poke.PopulatePokeVector();
		
		buttonListener = new ButtonListener(this);
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		//begin player 1 first pokemon creation
		
		JComboBox P1Pokemon1 = new JComboBox();
		P1Pokemon1.setBounds(150, 20, 150, 50);
		add(P1Pokemon1);
		//P1Pokemon.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1Poke1Lvl = new JComboBox();
		P1Poke1Lvl.setBounds(150, 50, 150, 50);
		add(P1Poke1Lvl);
		P1Poke1Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			P1Poke1Lvl.addItem(i);
		}
		
		JComboBox P1Poke1Move1 = new JComboBox();
		P1Poke1Move1.setBounds(150, 80, 150, 50);
		add(P1Poke1Move1);
	
		JComboBox P1Poke1Move2 = new JComboBox();
		P1Poke1Move2.setBounds(150, 110, 150, 50);
		add(P1Poke1Move2);
		
		JComboBox P1Poke1Move3 = new JComboBox();
		P1Poke1Move3.setBounds(150, 140, 150, 50);
		add(P1Poke1Move3);
		
		JComboBox P1Poke1Move4 = new JComboBox();
		P1Poke1Move4.setBounds(150, 170, 150, 50);
		add(P1Poke1Move4);
		
		//begin player 1 second pokemon creation
		
		JComboBox P1Pokemon2 = new JComboBox();
		P1Pokemon2.setBounds(350, 20, 150, 50);
		add(P1Pokemon2);
		//P1Pokemon2.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1Poke2Lvl = new JComboBox();
		P1Poke2Lvl.setBounds(350, 50, 150, 50);
		add(P1Poke2Lvl);
		P1Poke2Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			P1Poke2Lvl.addItem(i);
		}
		
		JComboBox P1Poke2Move1 = new JComboBox();
		P1Poke2Move1.setBounds(350, 80, 150, 50);
		add(P1Poke2Move1);
	
		JComboBox P1Poke2Move2 = new JComboBox();
		P1Poke2Move2.setBounds(350, 110, 150, 50);
		add(P1Poke2Move2);
		
		JComboBox P1Poke2Move3 = new JComboBox();
		P1Poke2Move3.setBounds(350, 140, 150, 50);
		add(P1Poke2Move3);
		
		JComboBox P1Poke2Move4 = new JComboBox();
		P1Poke2Move4.setBounds(350, 170, 150, 50);
		add(P1Poke2Move4);
		
		//begin player 1 third pokemon creation
		
		JComboBox P1Pokemon3 = new JComboBox();
		P1Pokemon3.setBounds(550, 20, 150, 50);
		add(P1Pokemon3);
		//P1Pokemon3.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1Poke3Lvl = new JComboBox();
		P1Poke3Lvl.setBounds(550, 50, 150, 50);
		add(P1Poke3Lvl);
		P1Poke3Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			P1Poke3Lvl.addItem(i);
		}
		
		JComboBox P1Poke3Move1 = new JComboBox();
		P1Poke3Move1.setBounds(550, 80, 150, 50);
		add(P1Poke3Move1);
	
		JComboBox P1Poke3Move2 = new JComboBox();
		P1Poke3Move2.setBounds(550, 110, 150, 50);
		add(P1Poke3Move2);
		
		JComboBox P1Poke3Move3 = new JComboBox();
		P1Poke3Move3.setBounds(550, 140, 150, 50);
		add(P1Poke3Move3);
		
		JComboBox P1Poke3Move4 = new JComboBox();
		P1Poke3Move4.setBounds(550, 170, 150, 50);
		add(P1Poke3Move4);
		
		//begin player 1 fourth pokemon creation
		
		JComboBox P1Pokemon4 = new JComboBox();
		P1Pokemon4.setBounds(150, 230, 150, 50);
		add(P1Pokemon4);
		//P1Pokemon4.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1Poke4Lvl = new JComboBox();
		P1Poke4Lvl.setBounds(150,260, 150, 50);
		add(P1Poke4Lvl);
		P1Poke4Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			P1Poke4Lvl.addItem(i);
		}
		
		JComboBox P1Poke4Move1 = new JComboBox();
		P1Poke4Move1.setBounds(150, 290, 150, 50);
		add(P1Poke4Move1);
	
		JComboBox P1Poke4Move2 = new JComboBox();
		P1Poke4Move2.setBounds(150, 320, 150, 50);
		add(P1Poke4Move2);
		
		JComboBox P1Poke4Move3 = new JComboBox();
		P1Poke4Move3.setBounds(150, 350, 150, 50);
		add(P1Poke4Move3);
		
		JComboBox P1Poke4Move4 = new JComboBox();
		P1Poke4Move4.setBounds(150, 380, 150, 50);
		add(P1Poke4Move4);
		
		//begin player 1 fifth pokemon creation
		
		
		JComboBox P1Pokemon5 = new JComboBox();
		P1Pokemon5.setBounds(350, 230, 150, 50);
		add(P1Pokemon5);
		//P1Pokemon5.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1Poke5Lvl = new JComboBox();
		P1Poke5Lvl.setBounds(350,260, 150, 50);
		add(P1Poke5Lvl);
		P1Poke5Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			P1Poke5Lvl.addItem(i);
		}
		
		JComboBox P1Poke5Move1 = new JComboBox();
		P1Poke5Move1.setBounds(350, 290, 150, 50);
		add(P1Poke5Move1);
	
		JComboBox P1Poke5Move2 = new JComboBox();
		P1Poke5Move2.setBounds(350, 320, 150, 50);
		add(P1Poke5Move2);
		
		JComboBox P1Poke5Move3 = new JComboBox();
		P1Poke5Move3.setBounds(350, 350, 150, 50);
		add(P1Poke5Move3);
		
		JComboBox P1Poke5Move4 = new JComboBox();
		P1Poke5Move4.setBounds(350, 380, 150, 50);
		add(P1Poke5Move4);
		
		//begin player 1 sixth pokemon creation
		
		
		JComboBox P1Pokemon6 = new JComboBox();
		P1Pokemon6.setBounds(550, 230, 150, 50);
		add(P1Pokemon6);
		//P1Pokemon6.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox P1Poke6Lvl = new JComboBox();
		P1Poke6Lvl.setBounds(550,260, 150, 50);
		add(P1Poke6Lvl);
		P1Poke6Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			P1Poke6Lvl.addItem(i);
		}
		
		JComboBox P1Poke6Move1 = new JComboBox();
		P1Poke6Move1.setBounds(550, 290, 150, 50);
		add(P1Poke6Move1);
	
		JComboBox P1Poke6Move2 = new JComboBox();
		P1Poke6Move2.setBounds(550, 320, 150, 50);
		add(P1Poke6Move2);
		
		JComboBox P1Poke6Move3 = new JComboBox();
		P1Poke6Move3.setBounds(550, 350, 150, 50);
		add(P1Poke6Move3);
		
		JComboBox P1Poke6Move4 = new JComboBox();
		P1Poke6Move4.setBounds(550, 380, 150, 50);
		add(P1Poke6Move4);
		
		
		
		JButton readyUp = new JButton("Ready Up");
		buttonListener.registerScreen("Ready Up", bsP2Choose.class);
		readyUp.addActionListener(buttonListener);
		readyUp.setBounds(315, 440, 120, 30);
		add(readyUp);
		
		setP1Name();
		
	}
	
	public void setP1Name(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
}