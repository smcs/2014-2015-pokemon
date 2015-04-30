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


public class BS_PlayerChoose extends BS_JPanel {

	private static final int MAX_PLAYERS = 2;
	private ButtonListener buttonListener;
	private PanelListener panelListener;
	private Player player;
	private static int playerNumber = 1;
	private int storePokemon1, storePoke1Lvl;
	
	public BS_PlayerChoose() {
		
		this.player = new Player();
		
		Vector<Poke> pokeList = Poke.PopulatePokeVector();
		
		buttonListener = new ButtonListener(this, battleSimulator);
		panelListener = new PanelListener();
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		//begin player 1 first pokemon creation
		
		JComboBox Pokemon1 = new JComboBox();
		Pokemon1.addActionListener(panelListener);
		Pokemon1.setBounds(150, 20, 150, 50);
		add(Pokemon1);
		Pokemon1.setModel(new DefaultComboBoxModel(pokeList));
		storePokemon1 = Pokemon1.getSelectedIndex();
		
		JComboBox Poke1Lvl = new JComboBox();
		Poke1Lvl.addActionListener(panelListener);
		Poke1Lvl.setBounds(150, 50, 150, 50);
		add(Poke1Lvl);
		Poke1Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke1Lvl.addItem(i);
		}
		storePoke1Lvl = Poke1Lvl.getSelectedIndex();
		
		JComboBox Poke1Move1 = new JComboBox();
		Poke1Move1.addActionListener(panelListener);
		Poke1Move1.setBounds(150, 80, 150, 50);
		add(Poke1Move1);
		int storePoke1Move1 = Poke1Move1.getSelectedIndex();
	
		JComboBox Poke1Move2 = new JComboBox();
		Poke1Move2.addActionListener(panelListener);
		Poke1Move2.setBounds(150, 110, 150, 50);
		add(Poke1Move2);
		int storePoke1Move2 = Poke1Move2.getSelectedIndex();
		
		JComboBox Poke1Move3 = new JComboBox();
		Poke1Move3.addActionListener(panelListener);
		Poke1Move3.setBounds(150, 140, 150, 50);
		add(Poke1Move3);
		int storePoke1Move3 = Poke1Move3.getSelectedIndex();
		
		JComboBox Poke1Move4 = new JComboBox();
		Poke1Move4.addActionListener(panelListener);
		Poke1Move4.setBounds(150, 170, 150, 50);
		add(Poke1Move4);
		int storePoke1Move4 = Poke1Move4.getSelectedIndex();
		
		
		
		//begin player 1 second pokemon creation
		
		JComboBox Pokemon2 = new JComboBox();
		Pokemon2.addActionListener(panelListener);
		Pokemon2.setBounds(350, 20, 150, 50);
		add(Pokemon2);
		Pokemon2.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox Poke2Lvl = new JComboBox();
		Poke2Lvl.addActionListener(panelListener);
		Poke2Lvl.setBounds(350, 50, 150, 50);
		add(Poke2Lvl);
		Poke2Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke2Lvl.addItem(i);
		}
		
		JComboBox Poke2Move1 = new JComboBox();
		Poke2Move1.addActionListener(panelListener);
		Poke2Move1.setBounds(350, 80, 150, 50);
		add(Poke2Move1);
	
		JComboBox Poke2Move2 = new JComboBox();
		Poke2Move2.addActionListener(panelListener);
		Poke2Move2.setBounds(350, 110, 150, 50);
		add(Poke2Move2);
		
		JComboBox Poke2Move3 = new JComboBox();
		Poke2Move3.addActionListener(panelListener);
		Poke2Move3.setBounds(350, 140, 150, 50);
		add(Poke2Move3);
		
		JComboBox Poke2Move4 = new JComboBox();
		Poke2Move4.addActionListener(panelListener);
		Poke2Move4.setBounds(350, 170, 150, 50);
		add(Poke2Move4);
		
		//begin player 1 third pokemon creation
		
		JComboBox Pokemon3 = new JComboBox();
		Pokemon3.addActionListener(panelListener);
		Pokemon3.setBounds(550, 20, 150, 50);
		add(Pokemon3);
		Pokemon3.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox Poke3Lvl = new JComboBox();
		Poke3Lvl.addActionListener(panelListener);
		Poke3Lvl.setBounds(550, 50, 150, 50);
		add(Poke3Lvl);
		Poke3Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke3Lvl.addItem(i);
		}
		
		JComboBox Poke3Move1 = new JComboBox();
		Poke3Move1.addActionListener(panelListener);
		Poke3Move1.setBounds(550, 80, 150, 50);
		add(Poke3Move1);
	
		JComboBox Poke3Move2 = new JComboBox();
		Poke3Move2.addActionListener(panelListener);
		Poke3Move2.setBounds(550, 110, 150, 50);
		add(Poke3Move2);
		
		JComboBox Poke3Move3 = new JComboBox();
		Poke3Move3.addActionListener(panelListener);
		Poke3Move3.setBounds(550, 140, 150, 50);
		add(Poke3Move3);
		
		JComboBox Poke3Move4 = new JComboBox();
		Poke3Move4.addActionListener(panelListener);
		Poke3Move4.setBounds(550, 170, 150, 50);
		add(Poke3Move4);
		
		//begin player 1 fourth pokemon creation
		
		JComboBox Pokemon4 = new JComboBox();
		Pokemon4.addActionListener(panelListener);
		Pokemon4.setBounds(150, 230, 150, 50);
		add(Pokemon4);
		Pokemon4.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox Poke4Lvl = new JComboBox();
		Poke4Lvl.addActionListener(panelListener);
		Poke4Lvl.setBounds(150,260, 150, 50);
		add(Poke4Lvl);
		Poke4Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke4Lvl.addItem(i);
		}
		
		JComboBox Poke4Move1 = new JComboBox();
		Poke4Move1.addActionListener(panelListener);
		Poke4Move1.setBounds(150, 290, 150, 50);
		add(Poke4Move1);
	
		JComboBox Poke4Move2 = new JComboBox();
		Poke4Move2.addActionListener(panelListener);
		Poke4Move2.setBounds(150, 320, 150, 50);
		add(Poke4Move2);
		
		JComboBox Poke4Move3 = new JComboBox();
		Poke4Move3.addActionListener(panelListener);
		Poke4Move3.setBounds(150, 350, 150, 50);
		add(Poke4Move3);
		
		JComboBox Poke4Move4 = new JComboBox();
		Poke4Move4.addActionListener(panelListener);
		Poke4Move4.setBounds(150, 380, 150, 50);
		add(Poke4Move4);
		
		//begin player 1 fifth pokemon creation
		
		
		JComboBox Pokemon5 = new JComboBox();
		Pokemon5.addActionListener(panelListener);
		Pokemon5.setBounds(350, 230, 150, 50);
		add(Pokemon5);
		Pokemon5.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox Poke5Lvl = new JComboBox();
		Poke5Lvl.addActionListener(panelListener);
		Poke5Lvl.setBounds(350,260, 150, 50);
		add(Poke5Lvl);
		Poke5Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke5Lvl.addItem(i);
		}
		
		JComboBox Poke5Move1 = new JComboBox();
		Poke5Move1.addActionListener(panelListener);
		Poke5Move1.setBounds(350, 290, 150, 50);
		add(Poke5Move1);
	
		JComboBox Poke5Move2 = new JComboBox();
		Poke5Move2.addActionListener(panelListener);
		Poke5Move2.setBounds(350, 320, 150, 50);
		add(Poke5Move2);
		
		JComboBox Poke5Move3 = new JComboBox();
		Poke5Move3.addActionListener(panelListener);
		Poke5Move3.setBounds(350, 350, 150, 50);
		add(Poke5Move3);
		
		JComboBox Poke5Move4 = new JComboBox();
		Poke5Move4.addActionListener(panelListener);
		Poke5Move4.setBounds(350, 380, 150, 50);
		add(Poke5Move4);
		
		//begin player 1 sixth pokemon creation
		
		
		JComboBox Pokemon6 = new JComboBox();
		Pokemon6.addActionListener(panelListener);
		Pokemon6.setBounds(550, 230, 150, 50);
		add(Pokemon6);
		Pokemon6.setModel(new DefaultComboBoxModel(pokeList));
		
		JComboBox Poke6Lvl = new JComboBox();
		Poke6Lvl.addActionListener(panelListener);
		Poke6Lvl.setBounds(550,260, 150, 50);
		add(Poke6Lvl);
		Poke6Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke6Lvl.addItem(i);
		}
		
		JComboBox Poke6Move1 = new JComboBox();
		Poke6Move1.addActionListener(panelListener);
		Poke6Move1.setBounds(550, 290, 150, 50);
		add(Poke6Move1);
	
		JComboBox Poke6Move2 = new JComboBox();
		Poke6Move2.addActionListener(panelListener);
		Poke6Move2.setBounds(550, 320, 150, 50);
		add(Poke6Move2);
		
		JComboBox Poke6Move3 = new JComboBox();
		Poke6Move3.addActionListener(panelListener);
		Poke6Move3.setBounds(550, 350, 150, 50);
		add(Poke6Move3);
		
		JComboBox Poke6Move4 = new JComboBox();
		Poke6Move4.addActionListener(panelListener);
		Poke6Move4.setBounds(550, 380, 150, 50);
		add(Poke6Move4);
		
		
		
		JButton readyUp = new JButton("Ready Up");
		if (playerNumber < MAX_PLAYERS) {
			buttonListener.registerScreen("Ready Up", BS_PlayerChoose.class);
		} else {
			/* whatever happens after Player 2 */
			buttonListener.registerScreen("Ready Up", BS_JPanel.class);
		}
		readyUp.addActionListener(buttonListener);
		readyUp.setBounds(315, 440, 120, 30);
		add(readyUp);
		
		setPlayerName();
		
	}
	
	public void setPlayerName(){
		
		player.setName(JOptionPane.showInputDialog(null, "Player " + playerNumber++ + " Name:"));
	    
	}

	public static void setPokemon() {

		if(storePokemon1 != 0 && storePoke1Lvl != 0 /*&& storePoke1Move1 != 0 
			&& storePoke1Move2 != 0 && storePoke1Move3 != 0 && storePoke1Move4 != 0*/){
			System.out.println("OOH RAH");
		}
	}
}