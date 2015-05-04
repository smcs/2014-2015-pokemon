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
	//private int storePokemon1, storePoke1Lvl = 0;
	
	private JComboBox Pokemon1, Pokemon2, Pokemon3, Pokemon4, Pokemon5, Pokemon6;
	private JComboBox Poke1Lvl, Poke2Lvl, Poke3Lvl, Poke4Lvl, Poke5Lvl, Poke6Lvl;
	private JComboBox Poke1Move1, Poke2Move1, Poke3Move1, Poke4Move1, Poke5Move1, Poke6Move1;
	private JComboBox Poke1Move2, Poke2Move2, Poke3Move2, Poke4Move2, Poke5Move2, Poke6Move2;
	private JComboBox Poke1Move3, Poke2Move3, Poke3Move3, Poke4Move3, Poke5Move3, Poke6Move3;
	private JComboBox Poke1Move4, Poke2Move4, Poke3Move4, Poke4Move4, Poke5Move4, Poke6Move4;
	
	
	public BS_PlayerChoose() {
		
		this.player = new Player();
		
		Vector<Poke> pokeList = Poke.PopulatePokeVector();
		
		buttonListener = new ButtonListener(this, battleSimulator);
		panelListener = new PanelListener(this);
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		//begin player 1 first pokemon creation
		
		Pokemon1 = new JComboBox();
		Pokemon1.addActionListener(panelListener);
		Pokemon1.setBounds(150, 20, 150, 50);
		add(Pokemon1);
		Pokemon1.setModel(new DefaultComboBoxModel(pokeList));
		//storePokemon1 = Pokemon1.getSelectedIndex();
		
		Poke1Lvl = new JComboBox();
		Poke1Lvl.addActionListener(panelListener);
		Poke1Lvl.setBounds(150, 50, 150, 50);
		add(Poke1Lvl);
		Poke1Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke1Lvl.addItem(i);
		}
		//storePoke1Lvl = Poke1Lvl.getSelectedIndex();
		
		Poke1Move1 = new JComboBox();
		Poke1Move1.addActionListener(panelListener);
		Poke1Move1.setBounds(150, 80, 150, 50);
		add(Poke1Move1);
		int storePoke1Move1 = Poke1Move1.getSelectedIndex();
	
		Poke1Move2 = new JComboBox();
		Poke1Move2.addActionListener(panelListener);
		Poke1Move2.setBounds(150, 110, 150, 50);
		add(Poke1Move2);
		int storePoke1Move2 = Poke1Move2.getSelectedIndex();
		
		Poke1Move3 = new JComboBox();
		Poke1Move3.addActionListener(panelListener);
		Poke1Move3.setBounds(150, 140, 150, 50);
		add(Poke1Move3);
		int storePoke1Move3 = Poke1Move3.getSelectedIndex();
		
		Poke1Move4 = new JComboBox();
		Poke1Move4.addActionListener(panelListener);
		Poke1Move4.setBounds(150, 170, 150, 50);
		add(Poke1Move4);
		int storePoke1Move4 = Poke1Move4.getSelectedIndex();
		
		
		
		//begin player 1 second pokemon creation
		
		Pokemon2 = new JComboBox();
		Pokemon2.addActionListener(panelListener);
		Pokemon2.setBounds(350, 20, 150, 50);
		add(Pokemon2);
		Pokemon2.setModel(new DefaultComboBoxModel(pokeList));
		
		Poke2Lvl = new JComboBox();
		Poke2Lvl.addActionListener(panelListener);
		Poke2Lvl.setBounds(350, 50, 150, 50);
		add(Poke2Lvl);
		Poke2Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke2Lvl.addItem(i);
		}
		
		Poke2Move1 = new JComboBox();
		Poke2Move1.addActionListener(panelListener);
		Poke2Move1.setBounds(350, 80, 150, 50);
		add(Poke2Move1);
	
		Poke2Move2 = new JComboBox();
		Poke2Move2.addActionListener(panelListener);
		Poke2Move2.setBounds(350, 110, 150, 50);
		add(Poke2Move2);
		
		Poke2Move3 = new JComboBox();
		Poke2Move3.addActionListener(panelListener);
		Poke2Move3.setBounds(350, 140, 150, 50);
		add(Poke2Move3);
		
		Poke2Move4 = new JComboBox();
		Poke2Move4.addActionListener(panelListener);
		Poke2Move4.setBounds(350, 170, 150, 50);
		add(Poke2Move4);
		
		//begin player 1 third pokemon creation
		
		Pokemon3 = new JComboBox();
		Pokemon3.addActionListener(panelListener);
		Pokemon3.setBounds(550, 20, 150, 50);
		add(Pokemon3);
		Pokemon3.setModel(new DefaultComboBoxModel(pokeList));
		
		Poke3Lvl = new JComboBox();
		Poke3Lvl.addActionListener(panelListener);
		Poke3Lvl.setBounds(550, 50, 150, 50);
		add(Poke3Lvl);
		Poke3Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke3Lvl.addItem(i);
		}
		
		Poke3Move1 = new JComboBox();
		Poke3Move1.addActionListener(panelListener);
		Poke3Move1.setBounds(550, 80, 150, 50);
		add(Poke3Move1);
	
		Poke3Move2 = new JComboBox();
		Poke3Move2.addActionListener(panelListener);
		Poke3Move2.setBounds(550, 110, 150, 50);
		add(Poke3Move2);
		
		Poke3Move3 = new JComboBox();
		Poke3Move3.addActionListener(panelListener);
		Poke3Move3.setBounds(550, 140, 150, 50);
		add(Poke3Move3);
		
		Poke3Move4 = new JComboBox();
		Poke3Move4.addActionListener(panelListener);
		Poke3Move4.setBounds(550, 170, 150, 50);
		add(Poke3Move4);
		
		//begin player 1 fourth pokemon creation
		
		Pokemon4 = new JComboBox();
		Pokemon4.addActionListener(panelListener);
		Pokemon4.setBounds(150, 230, 150, 50);
		add(Pokemon4);
		Pokemon4.setModel(new DefaultComboBoxModel(pokeList));
		
		Poke4Lvl = new JComboBox();
		Poke4Lvl.addActionListener(panelListener);
		Poke4Lvl.setBounds(150,260, 150, 50);
		add(Poke4Lvl);
		Poke4Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke4Lvl.addItem(i);
		}
		
		Poke4Move1 = new JComboBox();
		Poke4Move1.addActionListener(panelListener);
		Poke4Move1.setBounds(150, 290, 150, 50);
		add(Poke4Move1);
	
		Poke4Move2 = new JComboBox();
		Poke4Move2.addActionListener(panelListener);
		Poke4Move2.setBounds(150, 320, 150, 50);
		add(Poke4Move2);
		
		Poke4Move3 = new JComboBox();
		Poke4Move3.addActionListener(panelListener);
		Poke4Move3.setBounds(150, 350, 150, 50);
		add(Poke4Move3);
		
		Poke4Move4 = new JComboBox();
		Poke4Move4.addActionListener(panelListener);
		Poke4Move4.setBounds(150, 380, 150, 50);
		add(Poke4Move4);
		
		//begin player 1 fifth pokemon creation
		
		
		Pokemon5 = new JComboBox();
		Pokemon5.addActionListener(panelListener);
		Pokemon5.setBounds(350, 230, 150, 50);
		add(Pokemon5);
		Pokemon5.setModel(new DefaultComboBoxModel(pokeList));
		
		Poke5Lvl = new JComboBox();
		Poke5Lvl.addActionListener(panelListener);
		Poke5Lvl.setBounds(350,260, 150, 50);
		add(Poke5Lvl);
		Poke5Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke5Lvl.addItem(i);
		}
		
		Poke5Move1 = new JComboBox();
		Poke5Move1.addActionListener(panelListener);
		Poke5Move1.setBounds(350, 290, 150, 50);
		add(Poke5Move1);
	
		Poke5Move2 = new JComboBox();
		Poke5Move2.addActionListener(panelListener);
		Poke5Move2.setBounds(350, 320, 150, 50);
		add(Poke5Move2);
		
		Poke5Move3 = new JComboBox();
		Poke5Move3.addActionListener(panelListener);
		Poke5Move3.setBounds(350, 350, 150, 50);
		add(Poke5Move3);
		
		Poke5Move4 = new JComboBox();
		Poke5Move4.addActionListener(panelListener);
		Poke5Move4.setBounds(350, 380, 150, 50);
		add(Poke5Move4);
		
		//begin player 1 sixth pokemon creation
		
		
		Pokemon6 = new JComboBox();
		Pokemon6.addActionListener(panelListener);
		Pokemon6.setBounds(550, 230, 150, 50);
		add(Pokemon6);
		Pokemon6.setModel(new DefaultComboBoxModel(pokeList));
		
		Poke6Lvl = new JComboBox();
		Poke6Lvl.addActionListener(panelListener);
		Poke6Lvl.setBounds(550,260, 150, 50);
		add(Poke6Lvl);
		Poke6Lvl.addItem(null);
		for(int i = 1; i <= 100; i++){
			Poke6Lvl.addItem(i);
		}
		
		Poke6Move1 = new JComboBox();
		Poke6Move1.addActionListener(panelListener);
		Poke6Move1.setBounds(550, 290, 150, 50);
		add(Poke6Move1);
	
		Poke6Move2 = new JComboBox();
		Poke6Move2.addActionListener(panelListener);
		Poke6Move2.setBounds(550, 320, 150, 50);
		add(Poke6Move2);
		
		Poke6Move3 = new JComboBox();
		Poke6Move3.addActionListener(panelListener);
		Poke6Move3.setBounds(550, 350, 150, 50);
		add(Poke6Move3);
		
		Poke6Move4 = new JComboBox();
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
	
	public int getPokemon1(){
		return Pokemon1.getSelectedIndex();
	}
	public int getPoke1Lvl(){
		return Poke1Lvl.getSelectedIndex();
	}
	public int getPoke1Move1(){
		return Poke1Move1.getSelectedIndex();
	}
	public int getPoke1Move2(){
		return Poke1Move2.getSelectedIndex();
	}
	public int getPoke1Move3(){
		return Poke1Move3.getSelectedIndex();
	}
	public int getPoke1Move4(){
		return Poke1Move4.getSelectedIndex();
	}
	public int getPokemon2(){
		return Pokemon2.getSelectedIndex();
	}
	public int getPoke2Lvl(){
		return Poke2Lvl.getSelectedIndex();
	}
	public int getPoke2Move1(){
		return Poke2Move1.getSelectedIndex();
	}
	public int getPoke2Move2(){
		return Poke2Move2.getSelectedIndex();
	}
	public int getPoke2Move3(){
		return Poke2Move3.getSelectedIndex();
	}
	public int getPoke2Move4(){
		return Poke2Move4.getSelectedIndex();
	}
	public int getPokemon3(){
		return Pokemon3.getSelectedIndex();
	}
	public int getPoke3Lvl(){
		return Poke3Lvl.getSelectedIndex();
	}
	public int getPoke3Move1(){
		return Poke3Move1.getSelectedIndex();
	}
	public int getPoke3Move2(){
		return Poke3Move2.getSelectedIndex();
	}
	public int getPoke3Move3(){
		return Poke3Move3.getSelectedIndex();
	}
	public int getPoke3Move4(){
		return Poke3Move4.getSelectedIndex();
	}
	public int getPokemon4(){
		return Pokemon4.getSelectedIndex();
	}
	public int getPoke4Lvl(){
		return Poke4Lvl.getSelectedIndex();
	}
	public int getPoke4Move1(){
		return Poke4Move1.getSelectedIndex();
	}
	public int getPoke4Move2(){
		return Poke4Move2.getSelectedIndex();
	}
	public int getPoke4Move3(){
		return Poke4Move3.getSelectedIndex();
	}
	public int getPoke4Move4(){
		return Poke4Move4.getSelectedIndex();
	}
	public int getPokemon5(){
		return Pokemon5.getSelectedIndex();
	}
	public int getPoke5Lvl(){
		return Poke5Lvl.getSelectedIndex();
	}
	public int getPoke5Move1(){
		return Poke5Move1.getSelectedIndex();
	}
	public int getPoke5Move2(){
		return Poke5Move2.getSelectedIndex();
	}
	public int getPoke5Move3(){
		return Poke5Move3.getSelectedIndex();
	}
	public int getPoke5Move4(){
		return Poke5Move4.getSelectedIndex();
	}
	public int getPokemon6(){
		return Pokemon6.getSelectedIndex();
	}
	public int getPoke6Lvl(){
		return Poke6Lvl.getSelectedIndex();
	}
	public int getPoke6Move1(){
		return Poke6Move1.getSelectedIndex();
	}
	public int getPoke6Move2(){
		return Poke6Move2.getSelectedIndex();
	}
	public int getPoke6Move3(){
		return Poke6Move3.getSelectedIndex();
	}
	public int getPoke6Move4(){
		return Poke6Move4.getSelectedIndex();
	}
	
	public void setPlayerName(){
		
		player.setName(JOptionPane.showInputDialog(null, "Player " + playerNumber++ + " Name:"));
	    
	}

	public void setPokemon() {

		if(getPokemon1() != -1 && getPoke1Lvl() != -1 /*&& storePoke1Move1 != -1 
			&& storePoke1Move2 != -1 && storePoke1Move3 != -1 && storePoke1Move4 != -1*/){
				//System.out.println("OOH RAH");
			Pokemon pokemon1 = new Pokemon(getPokemon1(), "Pokemon 1", null, null, null, 
					getPoke1Lvl(), 0, null, false, false, 50, getPoke1Move1(), 
					getPoke1Move2(), getPoke1Move3(), getPoke1Move4(),
					20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
		}
		if(getPokemon2() != -1 && getPoke2Lvl() != -1 /*&& storePoke2Move1 != -1 
			&& storePoke2Move2 != -1 && storePoke2Move3 != -1 && storePoke2Move4 != -1*/){
				System.out.println("OOH RAH");
			}
		if(getPokemon3() != -1 && getPoke3Lvl() != -1 /*&& storePoke3Move1 != -1 
			&& storePoke3Move2 != -1 && storePoke3Move3 != -1 && storePoke3Move4 != -1*/){
				System.out.println("OOH RAH");
			}
		if(getPokemon4() != -1 && getPoke4Lvl() != -1 /*&& storePoke4Move1 != -1 
			&& storePoke4Move2 != -1 && storePoke4Move3 != -1 && storePoke4Move4 != -1*/){
				System.out.println("OOH RAH");
			}
		if(getPokemon5() != -1 && getPoke5Lvl() != -1 /*&& storePoke5Move1 != -1 
			&& storePoke5Move2 != -1 && storePoke5Move3 != -1 && storePoke5Move4 != -1*/){
				System.out.println("OOH RAH");
			}
		if(getPokemon6() != -1 && getPoke6Lvl() != -1 /*&& storePoke6Move1 != -1 
			&& storePoke6Move2 != -1 && storePoke6Move3 != -1 && storePoke6Move4 != -1*/){
				System.out.println("OOH RAH");
			}
	}
}