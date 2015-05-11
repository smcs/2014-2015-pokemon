import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class BS_PlayerChoose extends BS_JPanel {

	private static final int MAX_PLAYERS = 2;
	private ButtonListener buttonListener;
	private PanelListener panelListener;
	private Player p1, p2;
	private static int playerNumber = 1;
	//private int storePokemon1, storePoke1Lvl = 0;
	
	private JComboBox Pokemon1, Pokemon2, Pokemon3, Pokemon4, Pokemon5, Pokemon6;
	private JComboBox Poke1Lvl, Poke2Lvl, Poke3Lvl, Poke4Lvl, Poke5Lvl, Poke6Lvl;
	private JComboBox Poke1Move1, Poke2Move1, Poke3Move1, Poke4Move1, Poke5Move1, Poke6Move1;
	private JComboBox Poke1Move2, Poke2Move2, Poke3Move2, Poke4Move2, Poke5Move2, Poke6Move2;
	private JComboBox Poke1Move3, Poke2Move3, Poke3Move3, Poke4Move3, Poke5Move3, Poke6Move3;
	private JComboBox Poke1Move4, Poke2Move4, Poke3Move4, Poke4Move4, Poke5Move4, Poke6Move4;
	
	Pokemon pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6 = null;
	
	public BS_PlayerChoose() {
		
		if(playerNumber == 1){
		this.p1 = new Player(1);
		} else {
			this.p2 = new Player(2);
		}
		
		Vector<Poke> pokeList = Poke.PopulatePokeVector();
		Vector<Poke> moveList = Poke.PopulateMoveVector();
		
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
		Poke1Move1.setModel(new DefaultComboBoxModel(moveList));
	
		Poke1Move2 = new JComboBox();
		Poke1Move2.addActionListener(panelListener);
		Poke1Move2.setBounds(150, 110, 150, 50);
		add(Poke1Move2);
		Poke1Move2.setModel(new DefaultComboBoxModel(moveList));
		
		Poke1Move3 = new JComboBox();
		Poke1Move3.addActionListener(panelListener);
		Poke1Move3.setBounds(150, 140, 150, 50);
		add(Poke1Move3);
		Poke1Move3.setModel(new DefaultComboBoxModel(moveList));
		
		Poke1Move4 = new JComboBox();
		Poke1Move4.addActionListener(panelListener);
		Poke1Move4.setBounds(150, 170, 150, 50);
		add(Poke1Move4);
		Poke1Move4.setModel(new DefaultComboBoxModel(moveList));
		
		
		
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
		Poke2Move1.setModel(new DefaultComboBoxModel(moveList));
	
		Poke2Move2 = new JComboBox();
		Poke2Move2.addActionListener(panelListener);
		Poke2Move2.setBounds(350, 110, 150, 50);
		add(Poke2Move2);
		Poke2Move2.setModel(new DefaultComboBoxModel(moveList));
		
		Poke2Move3 = new JComboBox();
		Poke2Move3.addActionListener(panelListener);
		Poke2Move3.setBounds(350, 140, 150, 50);
		add(Poke2Move3);
		Poke2Move3.setModel(new DefaultComboBoxModel(moveList));
		
		Poke2Move4 = new JComboBox();
		Poke2Move4.addActionListener(panelListener);
		Poke2Move4.setBounds(350, 170, 150, 50);
		add(Poke2Move4);
		Poke2Move4.setModel(new DefaultComboBoxModel(moveList));
		
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
		Poke3Move1.setModel(new DefaultComboBoxModel(moveList));
	
		Poke3Move2 = new JComboBox();
		Poke3Move2.addActionListener(panelListener);
		Poke3Move2.setBounds(550, 110, 150, 50);
		add(Poke3Move2);
		Poke3Move2.setModel(new DefaultComboBoxModel(moveList));
		
		Poke3Move3 = new JComboBox();
		Poke3Move3.addActionListener(panelListener);
		Poke3Move3.setBounds(550, 140, 150, 50);
		add(Poke3Move3);
		Poke3Move3.setModel(new DefaultComboBoxModel(moveList));
		
		Poke3Move4 = new JComboBox();
		Poke3Move4.addActionListener(panelListener);
		Poke3Move4.setBounds(550, 170, 150, 50);
		add(Poke3Move4);
		Poke3Move4.setModel(new DefaultComboBoxModel(moveList));
		
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
		Poke4Move1.setModel(new DefaultComboBoxModel(moveList));
	
		Poke4Move2 = new JComboBox();
		Poke4Move2.addActionListener(panelListener);
		Poke4Move2.setBounds(150, 320, 150, 50);
		add(Poke4Move2);
		Poke4Move2.setModel(new DefaultComboBoxModel(moveList));
		
		Poke4Move3 = new JComboBox();
		Poke4Move3.addActionListener(panelListener);
		Poke4Move3.setBounds(150, 350, 150, 50);
		add(Poke4Move3);
		Poke4Move3.setModel(new DefaultComboBoxModel(moveList));
		
		Poke4Move4 = new JComboBox();
		Poke4Move4.addActionListener(panelListener);
		Poke4Move4.setBounds(150, 380, 150, 50);
		add(Poke4Move4);
		Poke4Move4.setModel(new DefaultComboBoxModel(moveList));
		
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
		Poke5Move1.setModel(new DefaultComboBoxModel(moveList));
	
		Poke5Move2 = new JComboBox();
		Poke5Move2.addActionListener(panelListener);
		Poke5Move2.setBounds(350, 320, 150, 50);
		add(Poke5Move2);
		Poke5Move2.setModel(new DefaultComboBoxModel(moveList));
		
		Poke5Move3 = new JComboBox();
		Poke5Move3.addActionListener(panelListener);
		Poke5Move3.setBounds(350, 350, 150, 50);
		add(Poke5Move3);
		Poke5Move3.setModel(new DefaultComboBoxModel(moveList));
		
		Poke5Move4 = new JComboBox();
		Poke5Move4.addActionListener(panelListener);
		Poke5Move4.setBounds(350, 380, 150, 50);
		add(Poke5Move4);
		Poke5Move4.setModel(new DefaultComboBoxModel(moveList));
		
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
		Poke6Move1.setModel(new DefaultComboBoxModel(moveList));
	
		Poke6Move2 = new JComboBox();
		Poke6Move2.addActionListener(panelListener);
		Poke6Move2.setBounds(550, 320, 150, 50);
		add(Poke6Move2);
		Poke6Move2.setModel(new DefaultComboBoxModel(moveList));
		
		Poke6Move3 = new JComboBox();
		Poke6Move3.addActionListener(panelListener);
		Poke6Move3.setBounds(550, 350, 150, 50);
		add(Poke6Move3);
		Poke6Move3.setModel(new DefaultComboBoxModel(moveList));
		
		Poke6Move4 = new JComboBox();
		Poke6Move4.addActionListener(panelListener);
		Poke6Move4.setBounds(550, 380, 150, 50);
		add(Poke6Move4);
		Poke6Move4.setModel(new DefaultComboBoxModel(moveList));
		
		if(playerNumber == 1){
		
		JButton readyUp1 = new JButton("Ready Up");
		buttonListener.registerScreen("Ready Up", BS_PlayerChoose.class);
		readyUp1.addActionListener(buttonListener);
		readyUp1.setBounds(315, 440, 120, 30);
		add(readyUp1);
		
		} else {
		
		JButton readyUp2 = new JButton("Ready Up");
		final BS_JPanel ugly = this;
		readyUp2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				BS_JPanel temp = new BS_Arena(p1, p2);
				((JFrame) SwingUtilities.getWindowAncestor(ugly)).setContentPane(temp);
				temp.revalidate();
				temp.repaint();
				temp.attachBattleSimulator(battleSimulator);
			}
		});
		readyUp2.setBounds(315, 440, 120, 30);
		add(readyUp2);
		
		}
		
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
	
	public Pokemon getPoke1(){
		return pokemon1;
	}
	public Pokemon getPoke2(){
		return pokemon2;
	}
	public Pokemon getPoke3(){
		return pokemon3;
	}
	public Pokemon getPoke4(){
		return pokemon4;
	}
	public Pokemon getPoke5(){
		return pokemon5;
	}
	public Pokemon getPoke6(){
		return pokemon6;
	}
	
	
	public void setPlayerName(){
		
		if(playerNumber == 1){
		p1.setName(JOptionPane.showInputDialog(null, "Player " + playerNumber++ + " Name:"));
		} else {
			p2.setName(JOptionPane.showInputDialog(null, "Player " + playerNumber++ + " Name:"));
		}
	}

	public void setPokemon() {
		if(pokemon1 == null){
		if(getPokemon1() != 0 && getPoke1Lvl() != -1 && getPoke1Move1() != 0 
			&& getPoke1Move2() != 0 && getPoke1Move3() != 0 && getPoke1Move4() != 0){
				System.out.println("Pokemon 1 Generated");
			pokemon1 = new Pokemon(getPokemon1(), "Pokemon 1", Ability.Levitate, Nature.Bold, Item.lifeOrb, 
					getPoke1Lvl(), 0, 0, false, false, 50, getPoke1Move1(), 
					getPoke1Move2(), getPoke1Move3(), getPoke1Move4(),
					20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
			if(playerNumber == 1){
			p1.addPoke(pokemon1);
			} else {
			p2.addPoke(pokemon1);
			}
		}
		}
		if(pokemon2 == null){
		if(getPokemon2() != 0 && getPoke2Lvl() != -1 && getPoke2Move1() != 0 
				&& getPoke2Move2() != 0 && getPoke2Move3() != 0 && getPoke2Move4() != 0){
					System.out.println("Pokemon 2 Generated");
				pokemon2 = new Pokemon(getPokemon2(), "Pokemon 2", Ability.Levitate, Nature.Bold, Item.lifeOrb, 
						getPoke2Lvl(), 0, 0, false, false, 50, getPoke2Move1(), 
						getPoke2Move2(), getPoke2Move3(), getPoke2Move4(),
						20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
				if(playerNumber == 1){
					p1.addPoke(pokemon2);
					} else {
					p2.addPoke(pokemon2);
					}
			}
		}
		if(pokemon3 == null){
		if(getPokemon3() != 0 && getPoke3Lvl() != -1 && getPoke3Move1() != 0 
				&& getPoke3Move2() != 0 && getPoke3Move3() != 0 && getPoke3Move4() != 0){
					System.out.println("Pokemon 3 Generated");
				pokemon3 = new Pokemon(getPokemon3(), "Pokemon3", Ability.Levitate, Nature.Bold, Item.lifeOrb, 
						getPoke3Lvl(), 0, 0, false, false, 50, getPoke3Move1(), 
						getPoke3Move2(), getPoke3Move3(), getPoke3Move4(),
						20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
				if(playerNumber == 1){
					p1.addPoke(pokemon3);
					} else {
					p2.addPoke(pokemon3);
					}
			}
		}
		if(pokemon4 == null){
		if(getPokemon4() != 0 && getPoke4Lvl() != -1 && getPoke4Move1() != 0 
				&& getPoke4Move2() != 0 && getPoke4Move3() != 0 && getPoke4Move4() != 0){
					System.out.println("Pokemon 4 Generated");
				pokemon4 = new Pokemon(getPokemon4(), "Pokemon 1", Ability.Levitate, Nature.Bold, Item.lifeOrb, 
						getPoke4Lvl(), 0, 0, false, false, 50, getPoke4Move1(), 
						getPoke4Move2(), getPoke4Move3(), getPoke4Move4(),
						20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
				if(playerNumber == 1){
					p1.addPoke(pokemon4);
					} else {
					p2.addPoke(pokemon4);
					}
			}
		}
		if(pokemon5 == null){
		if(getPokemon5() != 0 && getPoke5Lvl() != -1 && getPoke5Move1() != 0 
				&& getPoke5Move2() != 0 && getPoke5Move3() != 0 && getPoke5Move4() != 0){
					System.out.println("Pokemon 5 Generated");
				pokemon5 = new Pokemon(getPokemon5(), "Pokemon 5", Ability.Levitate, Nature.Bold, Item.lifeOrb, 
						getPoke5Lvl(), 0, 0, false, false, 50, getPoke5Move1(), 
						getPoke5Move2(), getPoke5Move3(), getPoke5Move4(),
						20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
				if(playerNumber == 1){
					p1.addPoke(pokemon5);
					} else {
					p2.addPoke(pokemon5);
					}
			}
		}
		if(pokemon6 == null){
		if(getPokemon6() != 0 && getPoke6Lvl() != -1 && getPoke6Move1() != 0 
				&& getPoke6Move2() != 0 && getPoke6Move3() != 0 && getPoke6Move4() != 0){
					System.out.println("Pokemon 6 Generated");
				pokemon6 = new Pokemon(getPokemon6(), "Pokemon 6", Ability.Levitate, Nature.Bold, Item.lifeOrb, 
						getPoke6Lvl(), 0, 0, false, false, 50, getPoke6Move1(), 
						getPoke6Move2(), getPoke6Move3(), getPoke6Move4(),
						20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20);
				if(playerNumber == 1){
					p1.addPoke(pokemon6);
					} else {
					p2.addPoke(pokemon6);
					}
			}
		}
		
	}

	public static void setPlayerNumber(int i) {
		playerNumber = i;
	}
	
}