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
	private BattleSimulator battleSimulator;
	// private ButtonListener buttonListener;
	private PanelListener panelListener;
	private static boolean ran = false;
	private Player p;

	private JComboBox Pokemon1, Pokemon2, Pokemon3, Pokemon4, Pokemon5,
			Pokemon6;
	private JComboBox Poke1Lvl, Poke2Lvl, Poke3Lvl, Poke4Lvl, Poke5Lvl,
			Poke6Lvl;
	private JComboBox Poke1Move1, Poke2Move1, Poke3Move1, Poke4Move1,
			Poke5Move1, Poke6Move1;
	private JComboBox Poke1Move2, Poke2Move2, Poke3Move2, Poke4Move2,
			Poke5Move2, Poke6Move2;
	private JComboBox Poke1Move3, Poke2Move3, Poke3Move3, Poke4Move3,
			Poke5Move3, Poke6Move3;
	private JComboBox Poke1Move4, Poke2Move4, Poke3Move4, Poke4Move4,
			Poke5Move4, Poke6Move4;
	private JComboBox Poke1hpEV, Poke1atEV, Poke1dfEV, Poke1spatEV,
			Poke1spdfEV, Poke1spdEV;
	private JComboBox Poke2hpEV, Poke2atEV, Poke2dfEV, Poke2spatEV,
			Poke2spdfEV, Poke2spdEV;
	private JComboBox Poke3hpEV, Poke3atEV, Poke3dfEV, Poke3spatEV,
			Poke3spdfEV, Poke3spdEV;
	private JComboBox Poke4hpEV, Poke4atEV, Poke4dfEV, Poke4spatEV,
			Poke4spdfEV, Poke4spdEV;
	private JComboBox Poke5hpEV, Poke5atEV, Poke5dfEV, Poke5spatEV,
			Poke5spdfEV, Poke5spdEV;
	private JComboBox Poke6hpEV, Poke6atEV, Poke6dfEV, Poke6spatEV,
			Poke6spdfEV, Poke6spdEV;

	Pokemon pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6 = null;

	public BS_PlayerChoose(BattleSimulator bs) {

		battleSimulator = bs;

		if (ran == false) {
			p = battleSimulator.getPlayer(0);
		} else {
			p = battleSimulator.getPlayer(1);
		}

		setPlayer(p);

		Vector<Poke> pokeList = Poke.PopulatePokeVector();
		Vector<Poke> moveList = Poke.PopulateMoveVector();

		// buttonListener = new ButtonListener(this, battleSimulator);
		panelListener = new PanelListener(this);
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));

		// begin first pokemon creation

		Pokemon1 = new JComboBox();
		Pokemon1.addActionListener(panelListener);
		Pokemon1.setBounds(50, 20, 150, 50);
		add(Pokemon1);
		Pokemon1.setModel(new DefaultComboBoxModel(pokeList));
		// storePokemon1 = Pokemon1.getSelectedIndex();

		Poke1Lvl = new JComboBox();
		Poke1Lvl.addActionListener(panelListener);
		Poke1Lvl.setBounds(50, 50, 150, 50);
		add(Poke1Lvl);
		Poke1Lvl.addItem(null);
		for (int i = 1; i <= 100; i++) {
			Poke1Lvl.addItem(i);
		}
		// storePoke1Lvl = Poke1Lvl.getSelectedIndex();

		Poke1Move1 = new JComboBox();
		Poke1Move1.addActionListener(panelListener);
		Poke1Move1.setBounds(50, 80, 150, 50);
		add(Poke1Move1);
		Poke1Move1.setModel(new DefaultComboBoxModel(moveList));

		Poke1Move2 = new JComboBox();
		Poke1Move2.addActionListener(panelListener);
		Poke1Move2.setBounds(50, 110, 150, 50);
		add(Poke1Move2);
		Poke1Move2.setModel(new DefaultComboBoxModel(moveList));

		Poke1Move3 = new JComboBox();
		Poke1Move3.addActionListener(panelListener);
		Poke1Move3.setBounds(50, 140, 150, 50);
		add(Poke1Move3);
		Poke1Move3.setModel(new DefaultComboBoxModel(moveList));

		Poke1Move4 = new JComboBox();
		Poke1Move4.addActionListener(panelListener);
		Poke1Move4.setBounds(50, 170, 150, 50);
		add(Poke1Move4);
		Poke1Move4.setModel(new DefaultComboBoxModel(moveList));

		Poke1hpEV = new JComboBox();
		Poke1hpEV.addActionListener(panelListener);
		Poke1hpEV.setBounds(190, 20, 80, 50);
		add(Poke1hpEV);
		Poke1hpEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke1hpEV.addItem(i);
		}

		Poke1atEV = new JComboBox();
		Poke1atEV.addActionListener(panelListener);
		Poke1atEV.setBounds(190, 50, 80, 50);
		add(Poke1atEV);
		Poke1atEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke1atEV.addItem(i);
		}

		Poke1dfEV = new JComboBox();
		Poke1dfEV.addActionListener(panelListener);
		Poke1dfEV.setBounds(190, 80, 80, 50);
		add(Poke1dfEV);
		Poke1dfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke1dfEV.addItem(i);
		}

		Poke1spatEV = new JComboBox();
		Poke1spatEV.addActionListener(panelListener);
		Poke1spatEV.setBounds(190, 110, 80, 50);
		add(Poke1spatEV);
		Poke1spatEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke1spatEV.addItem(i);
		}

		Poke1spdfEV = new JComboBox();
		Poke1spdfEV.addActionListener(panelListener);
		Poke1spdfEV.setBounds(190, 140, 80, 50);
		add(Poke1spdfEV);
		Poke1spdfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke1spdfEV.addItem(i);
		}

		Poke1spdEV = new JComboBox();
		Poke1spdEV.addActionListener(panelListener);
		Poke1spdEV.setBounds(190, 170, 80, 50);
		add(Poke1spdEV);
		Poke1spdEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke1spdEV.addItem(i);
		}

		// begin second pokemon creation

		Pokemon2 = new JComboBox();
		Pokemon2.addActionListener(panelListener);
		Pokemon2.setBounds(275, 20, 150, 50);
		add(Pokemon2);
		Pokemon2.setModel(new DefaultComboBoxModel(pokeList));

		Poke2Lvl = new JComboBox();
		Poke2Lvl.addActionListener(panelListener);
		Poke2Lvl.setBounds(275, 50, 150, 50);
		add(Poke2Lvl);
		Poke2Lvl.addItem(null);
		for (int i = 1; i <= 100; i++) {
			Poke2Lvl.addItem(i);
		}

		Poke2Move1 = new JComboBox();
		Poke2Move1.addActionListener(panelListener);
		Poke2Move1.setBounds(275, 80, 150, 50);
		add(Poke2Move1);
		Poke2Move1.setModel(new DefaultComboBoxModel(moveList));

		Poke2Move2 = new JComboBox();
		Poke2Move2.addActionListener(panelListener);
		Poke2Move2.setBounds(275, 110, 150, 50);
		add(Poke2Move2);
		Poke2Move2.setModel(new DefaultComboBoxModel(moveList));

		Poke2Move3 = new JComboBox();
		Poke2Move3.addActionListener(panelListener);
		Poke2Move3.setBounds(275, 140, 150, 50);
		add(Poke2Move3);
		Poke2Move3.setModel(new DefaultComboBoxModel(moveList));

		Poke2Move4 = new JComboBox();
		Poke2Move4.addActionListener(panelListener);
		Poke2Move4.setBounds(275, 170, 150, 50);
		add(Poke2Move4);
		Poke2Move4.setModel(new DefaultComboBoxModel(moveList));

		Poke2hpEV = new JComboBox();
		Poke2hpEV.addActionListener(panelListener);
		Poke2hpEV.setBounds(190, 20, 80, 50);
		add(Poke2hpEV);
		Poke2hpEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke2hpEV.addItem(i);
		}

		Poke2atEV = new JComboBox();
		Poke2atEV.addActionListener(panelListener);
		Poke2atEV.setBounds(190, 50, 80, 50);
		add(Poke2atEV);
		Poke2atEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke2atEV.addItem(i);
		}

		Poke2dfEV = new JComboBox();
		Poke2dfEV.addActionListener(panelListener);
		Poke2dfEV.setBounds(190, 80, 80, 50);
		add(Poke2dfEV);
		Poke2dfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke2dfEV.addItem(i);
		}

		Poke2spatEV = new JComboBox();
		Poke2spatEV.addActionListener(panelListener);
		Poke2spatEV.setBounds(190, 110, 80, 50);
		add(Poke2spatEV);
		Poke2spatEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke2spatEV.addItem(i);
		}

		Poke2spdfEV = new JComboBox();
		Poke2spdfEV.addActionListener(panelListener);
		Poke2spdfEV.setBounds(190, 140, 80, 50);
		add(Poke2spdfEV);
		Poke2spdfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke2spdfEV.addItem(i);
		}

		Poke2spdEV = new JComboBox();
		Poke2spdEV.addActionListener(panelListener);
		Poke2spdEV.setBounds(190, 170, 80, 50);
		add(Poke2spdEV);
		Poke2spdEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke2spdEV.addItem(i);
		}

		// begin third pokemon creation

		Pokemon3 = new JComboBox();
		Pokemon3.addActionListener(panelListener);
		Pokemon3.setBounds(500, 20, 150, 50);
		add(Pokemon3);
		Pokemon3.setModel(new DefaultComboBoxModel(pokeList));

		Poke3Lvl = new JComboBox();
		Poke3Lvl.addActionListener(panelListener);
		Poke3Lvl.setBounds(500, 50, 150, 50);
		add(Poke3Lvl);
		Poke3Lvl.addItem(null);
		for (int i = 1; i <= 100; i++) {
			Poke3Lvl.addItem(i);
		}

		Poke3Move1 = new JComboBox();
		Poke3Move1.addActionListener(panelListener);
		Poke3Move1.setBounds(500, 80, 150, 50);
		add(Poke3Move1);
		Poke3Move1.setModel(new DefaultComboBoxModel(moveList));

		Poke3Move2 = new JComboBox();
		Poke3Move2.addActionListener(panelListener);
		Poke3Move2.setBounds(500, 110, 150, 50);
		add(Poke3Move2);
		Poke3Move2.setModel(new DefaultComboBoxModel(moveList));

		Poke3Move3 = new JComboBox();
		Poke3Move3.addActionListener(panelListener);
		Poke3Move3.setBounds(500, 140, 150, 50);
		add(Poke3Move3);
		Poke3Move3.setModel(new DefaultComboBoxModel(moveList));

		Poke3Move4 = new JComboBox();
		Poke3Move4.addActionListener(panelListener);
		Poke3Move4.setBounds(500, 170, 150, 50);
		add(Poke3Move4);
		Poke3Move4.setModel(new DefaultComboBoxModel(moveList));

		Poke3hpEV = new JComboBox();
		Poke3hpEV.addActionListener(panelListener);
		Poke3hpEV.setBounds(190, 20, 80, 50);
		add(Poke3hpEV);
		Poke3hpEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke3hpEV.addItem(i);
		}

		Poke3atEV = new JComboBox();
		Poke3atEV.addActionListener(panelListener);
		Poke3atEV.setBounds(190, 50, 80, 50);
		add(Poke3atEV);
		Poke3atEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke3atEV.addItem(i);
		}

		Poke3dfEV = new JComboBox();
		Poke3dfEV.addActionListener(panelListener);
		Poke3dfEV.setBounds(190, 80, 80, 50);
		add(Poke3dfEV);
		Poke3dfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke3dfEV.addItem(i);
		}

		Poke3spatEV = new JComboBox();
		Poke3spatEV.addActionListener(panelListener);
		Poke3spatEV.setBounds(190, 110, 80, 50);
		add(Poke3spatEV);
		Poke3spatEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke3spatEV.addItem(i);
		}

		Poke3spdfEV = new JComboBox();
		Poke3spdfEV.addActionListener(panelListener);
		Poke3spdfEV.setBounds(190, 140, 80, 50);
		add(Poke3spdfEV);
		Poke3spdfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke3spdfEV.addItem(i);
		}

		Poke3spdEV = new JComboBox();
		Poke3spdEV.addActionListener(panelListener);
		Poke3spdEV.setBounds(190, 170, 80, 50);
		add(Poke3spdEV);
		Poke3spdEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke3spdEV.addItem(i);
		}

		// begin fourth pokemon creation

		Pokemon4 = new JComboBox();
		Pokemon4.addActionListener(panelListener);
		Pokemon4.setBounds(50, 230, 150, 50);
		add(Pokemon4);
		Pokemon4.setModel(new DefaultComboBoxModel(pokeList));

		Poke4Lvl = new JComboBox();
		Poke4Lvl.addActionListener(panelListener);
		Poke4Lvl.setBounds(50, 260, 150, 50);
		add(Poke4Lvl);
		Poke4Lvl.addItem(null);
		for (int i = 1; i <= 100; i++) {
			Poke4Lvl.addItem(i);
		}

		Poke4Move1 = new JComboBox();
		Poke4Move1.addActionListener(panelListener);
		Poke4Move1.setBounds(50, 290, 150, 50);
		add(Poke4Move1);
		Poke4Move1.setModel(new DefaultComboBoxModel(moveList));

		Poke4Move2 = new JComboBox();
		Poke4Move2.addActionListener(panelListener);
		Poke4Move2.setBounds(50, 320, 150, 50);
		add(Poke4Move2);
		Poke4Move2.setModel(new DefaultComboBoxModel(moveList));

		Poke4Move3 = new JComboBox();
		Poke4Move3.addActionListener(panelListener);
		Poke4Move3.setBounds(50, 350, 150, 50);
		add(Poke4Move3);
		Poke4Move3.setModel(new DefaultComboBoxModel(moveList));

		Poke4Move4 = new JComboBox();
		Poke4Move4.addActionListener(panelListener);
		Poke4Move4.setBounds(50, 380, 150, 50);
		add(Poke4Move4);
		Poke4Move4.setModel(new DefaultComboBoxModel(moveList));

		Poke4hpEV = new JComboBox();
		Poke4hpEV.addActionListener(panelListener);
		Poke4hpEV.setBounds(190, 20, 80, 50);
		add(Poke4hpEV);
		Poke4hpEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke4hpEV.addItem(i);
		}

		Poke4atEV = new JComboBox();
		Poke4atEV.addActionListener(panelListener);
		Poke4atEV.setBounds(190, 50, 80, 50);
		add(Poke4atEV);
		Poke4atEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke4atEV.addItem(i);
		}

		Poke4dfEV = new JComboBox();
		Poke4dfEV.addActionListener(panelListener);
		Poke4dfEV.setBounds(190, 80, 80, 50);
		add(Poke4dfEV);
		Poke4dfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke4dfEV.addItem(i);
		}

		Poke4spatEV = new JComboBox();
		Poke4spatEV.addActionListener(panelListener);
		Poke4spatEV.setBounds(190, 110, 80, 50);
		add(Poke4spatEV);
		Poke4spatEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke4spatEV.addItem(i);
		}

		Poke4spdfEV = new JComboBox();
		Poke4spdfEV.addActionListener(panelListener);
		Poke4spdfEV.setBounds(190, 140, 80, 50);
		add(Poke4spdfEV);
		Poke4spdfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke4spdfEV.addItem(i);
		}

		Poke4spdEV = new JComboBox();
		Poke4spdEV.addActionListener(panelListener);
		Poke4spdEV.setBounds(190, 170, 80, 50);
		add(Poke4spdEV);
		Poke4spdEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke4spdEV.addItem(i);
		}

		// begin fifth pokemon creation

		Pokemon5 = new JComboBox();
		Pokemon5.addActionListener(panelListener);
		Pokemon5.setBounds(275, 230, 150, 50);
		add(Pokemon5);
		Pokemon5.setModel(new DefaultComboBoxModel(pokeList));

		Poke5Lvl = new JComboBox();
		Poke5Lvl.addActionListener(panelListener);
		Poke5Lvl.setBounds(275, 260, 150, 50);
		add(Poke5Lvl);
		Poke5Lvl.addItem(null);
		for (int i = 1; i <= 100; i++) {
			Poke5Lvl.addItem(i);
		}

		Poke5Move1 = new JComboBox();
		Poke5Move1.addActionListener(panelListener);
		Poke5Move1.setBounds(275, 290, 150, 50);
		add(Poke5Move1);
		Poke5Move1.setModel(new DefaultComboBoxModel(moveList));

		Poke5Move2 = new JComboBox();
		Poke5Move2.addActionListener(panelListener);
		Poke5Move2.setBounds(275, 320, 150, 50);
		add(Poke5Move2);
		Poke5Move2.setModel(new DefaultComboBoxModel(moveList));

		Poke5Move3 = new JComboBox();
		Poke5Move3.addActionListener(panelListener);
		Poke5Move3.setBounds(275, 350, 150, 50);
		add(Poke5Move3);
		Poke5Move3.setModel(new DefaultComboBoxModel(moveList));

		Poke5Move4 = new JComboBox();
		Poke5Move4.addActionListener(panelListener);
		Poke5Move4.setBounds(275, 380, 150, 50);
		add(Poke5Move4);
		Poke5Move4.setModel(new DefaultComboBoxModel(moveList));

		Poke5hpEV = new JComboBox();
		Poke5hpEV.addActionListener(panelListener);
		Poke5hpEV.setBounds(190, 20, 80, 50);
		add(Poke5hpEV);
		Poke5hpEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke5hpEV.addItem(i);
		}

		Poke5atEV = new JComboBox();
		Poke5atEV.addActionListener(panelListener);
		Poke5atEV.setBounds(190, 50, 80, 50);
		add(Poke5atEV);
		Poke5atEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke5atEV.addItem(i);
		}

		Poke5dfEV = new JComboBox();
		Poke5dfEV.addActionListener(panelListener);
		Poke5dfEV.setBounds(190, 80, 80, 50);
		add(Poke5dfEV);
		Poke5dfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke5dfEV.addItem(i);
		}

		Poke5spatEV = new JComboBox();
		Poke5spatEV.addActionListener(panelListener);
		Poke5spatEV.setBounds(190, 110, 80, 50);
		add(Poke5spatEV);
		Poke5spatEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke5spatEV.addItem(i);
		}

		Poke5spdfEV = new JComboBox();
		Poke5spdfEV.addActionListener(panelListener);
		Poke5spdfEV.setBounds(190, 140, 80, 50);
		add(Poke5spdfEV);
		Poke5spdfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke5spdfEV.addItem(i);
		}

		Poke5spdEV = new JComboBox();
		Poke5spdEV.addActionListener(panelListener);
		Poke5spdEV.setBounds(190, 170, 80, 50);
		add(Poke5spdEV);
		Poke5spdEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke5spdEV.addItem(i);
		}

		// begin sixth pokemon creation

		Pokemon6 = new JComboBox();
		Pokemon6.addActionListener(panelListener);
		Pokemon6.setBounds(500, 230, 150, 50);
		add(Pokemon6);
		Pokemon6.setModel(new DefaultComboBoxModel(pokeList));

		Poke6Lvl = new JComboBox();
		Poke6Lvl.addActionListener(panelListener);
		Poke6Lvl.setBounds(500, 260, 150, 50);
		add(Poke6Lvl);
		Poke6Lvl.addItem(null);
		for (int i = 1; i <= 100; i++) {
			Poke6Lvl.addItem(i);
		}

		Poke6Move1 = new JComboBox();
		Poke6Move1.addActionListener(panelListener);
		Poke6Move1.setBounds(500, 290, 150, 50);
		add(Poke6Move1);
		Poke6Move1.setModel(new DefaultComboBoxModel(moveList));

		Poke6Move2 = new JComboBox();
		Poke6Move2.addActionListener(panelListener);
		Poke6Move2.setBounds(500, 320, 150, 50);
		add(Poke6Move2);
		Poke6Move2.setModel(new DefaultComboBoxModel(moveList));

		Poke6Move3 = new JComboBox();
		Poke6Move3.addActionListener(panelListener);
		Poke6Move3.setBounds(500, 350, 150, 50);
		add(Poke6Move3);
		Poke6Move3.setModel(new DefaultComboBoxModel(moveList));

		Poke6Move4 = new JComboBox();
		Poke6Move4.addActionListener(panelListener);
		Poke6Move4.setBounds(500, 380, 150, 50);
		add(Poke6Move4);
		Poke6Move4.setModel(new DefaultComboBoxModel(moveList));

		Poke6hpEV = new JComboBox();
		Poke6hpEV.addActionListener(panelListener);
		Poke6hpEV.setBounds(190, 20, 80, 50);
		add(Poke6hpEV);
		Poke6hpEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke6hpEV.addItem(i);
		}

		Poke6atEV = new JComboBox();
		Poke6atEV.addActionListener(panelListener);
		Poke6atEV.setBounds(190, 50, 80, 50);
		add(Poke6atEV);
		Poke6atEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke6atEV.addItem(i);
		}

		Poke6dfEV = new JComboBox();
		Poke6dfEV.addActionListener(panelListener);
		Poke6dfEV.setBounds(190, 80, 80, 50);
		add(Poke6dfEV);
		Poke6dfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke6dfEV.addItem(i);
		}

		Poke6spatEV = new JComboBox();
		Poke6spatEV.addActionListener(panelListener);
		Poke6spatEV.setBounds(190, 110, 80, 50);
		add(Poke6spatEV);
		Poke6spatEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke6spatEV.addItem(i);
		}

		Poke6spdfEV = new JComboBox();
		Poke6spdfEV.addActionListener(panelListener);
		Poke6spdfEV.setBounds(190, 140, 80, 50);
		add(Poke6spdfEV);
		Poke6spdfEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke6spdfEV.addItem(i);
		}

		Poke6spdEV = new JComboBox();
		Poke6spdEV.addActionListener(panelListener);
		Poke6spdEV.setBounds(190, 170, 80, 50);
		add(Poke6spdEV);
		Poke6spdEV.addItem(null);
		for (int i = 0; i <= 252; i++) {
			Poke6spdEV.addItem(i);
		}

		/*
		 * JButton readyUp = new JButton("Ready Up");
		 * buttonListener.registerScreen("Ready Up", BS_PlayerChoose.class);
		 * readyUp.addActionListener(buttonListener); readyUp.setBounds(315,
		 * 440, 120, 30); add(readyUp);
		 */

		JButton readyUp = new JButton("Start");
		final BS_JPanel ugly = this;
		readyUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ran == false) {
					ran = true;
					BS_JPanel temp = new BS_PlayerChoose(battleSimulator);
					((JFrame) SwingUtilities.getWindowAncestor(ugly))
							.setContentPane(temp);
					temp.revalidate();
					temp.repaint();
					temp.attachBattleSimulator(battleSimulator);
				} else if (ran == true) {
					battleSimulator.pokeStats();
					BS_JPanel temp = new BS_Arena(battleSimulator.getPlayer(0),
							battleSimulator.getPlayer(1), ugly.battleSimulator);
					((JFrame) SwingUtilities.getWindowAncestor(ugly))
							.setContentPane(temp);
					temp.revalidate();
					temp.repaint();
					temp.attachBattleSimulator(battleSimulator);
				}
			}
		});
		readyUp.setBounds(315, 440, 120, 30);
		add(readyUp);

		// setPlayerName();

	}

	// pokemon 1 accessor methods
	public int getPokemon1() {
		return Pokemon1.getSelectedIndex();
	}

	public int getPoke1Lvl() {
		return Poke1Lvl.getSelectedIndex();
	}

	public int getPoke1Move1() {
		return Poke1Move1.getSelectedIndex();
	}

	public int getPoke1Move2() {
		return Poke1Move2.getSelectedIndex();
	}

	public int getPoke1Move3() {
		return Poke1Move3.getSelectedIndex();
	}

	public int getPoke1Move4() {
		return Poke1Move4.getSelectedIndex();
	}

	public int getPoke1hpEV() {
		return Poke1hpEV.getSelectedIndex();
	}

	public int getPoke1atEV() {
		return Poke1atEV.getSelectedIndex();
	}

	public int getPoke1dfEV() {
		return Poke1dfEV.getSelectedIndex();
	}

	public int getPoke1spatEV() {
		return Poke1spatEV.getSelectedIndex();
	}

	public int getPoke1spdfEV() {
		return Poke1spdfEV.getSelectedIndex();
	}

	public int getPoke1spdEV() {
		return Poke1spdEV.getSelectedIndex();
	}

	// pokemon 2 accessor methods
	public int getPokemon2() {
		return Pokemon2.getSelectedIndex();
	}

	public int getPoke2Lvl() {
		return Poke2Lvl.getSelectedIndex();
	}

	public int getPoke2Move1() {
		return Poke2Move1.getSelectedIndex();
	}

	public int getPoke2Move2() {
		return Poke2Move2.getSelectedIndex();
	}

	public int getPoke2Move3() {
		return Poke2Move3.getSelectedIndex();
	}

	public int getPoke2Move4() {
		return Poke2Move4.getSelectedIndex();
	}

	public int getPoke2hpEV() {
		return Poke2hpEV.getSelectedIndex();
	}

	public int getPoke2atEV() {
		return Poke2atEV.getSelectedIndex();
	}

	public int getPoke2dfEV() {
		return Poke2dfEV.getSelectedIndex();
	}

	public int getPoke2spatEV() {
		return Poke2spatEV.getSelectedIndex();
	}

	public int getPoke2spdfEV() {
		return Poke2spdfEV.getSelectedIndex();
	}

	public int getPoke2spdEV() {
		return Poke2spdEV.getSelectedIndex();
	}

	// pokemon 3 accessor methods
	public int getPokemon3() {
		return Pokemon3.getSelectedIndex();
	}

	public int getPoke3Lvl() {
		return Poke3Lvl.getSelectedIndex();
	}

	public int getPoke3Move1() {
		return Poke3Move1.getSelectedIndex();
	}

	public int getPoke3Move2() {
		return Poke3Move2.getSelectedIndex();
	}

	public int getPoke3Move3() {
		return Poke3Move3.getSelectedIndex();
	}

	public int getPoke3Move4() {
		return Poke3Move4.getSelectedIndex();
	}

	public int getPoke3hpEV() {
		return Poke3hpEV.getSelectedIndex();
	}

	public int getPoke3atEV() {
		return Poke3atEV.getSelectedIndex();
	}

	public int getPoke3dfEV() {
		return Poke3dfEV.getSelectedIndex();
	}

	public int getPoke3spatEV() {
		return Poke3spatEV.getSelectedIndex();
	}

	public int getPoke3spdfEV() {
		return Poke3spdfEV.getSelectedIndex();
	}

	public int getPoke3spdEV() {
		return Poke3spdEV.getSelectedIndex();
	}

	// pokemon 4 accessor methods
	public int getPokemon4() {
		return Pokemon4.getSelectedIndex();
	}

	public int getPoke4Lvl() {
		return Poke4Lvl.getSelectedIndex();
	}

	public int getPoke4Move1() {
		return Poke4Move1.getSelectedIndex();
	}

	public int getPoke4Move2() {
		return Poke4Move2.getSelectedIndex();
	}

	public int getPoke4Move3() {
		return Poke4Move3.getSelectedIndex();
	}

	public int getPoke4Move4() {
		return Poke4Move4.getSelectedIndex();
	}

	public int getPoke4hpEV() {
		return Poke4hpEV.getSelectedIndex();
	}

	public int getPoke4atEV() {
		return Poke4atEV.getSelectedIndex();
	}

	public int getPoke4dfEV() {
		return Poke4dfEV.getSelectedIndex();
	}

	public int getPoke4spatEV() {
		return Poke4spatEV.getSelectedIndex();
	}

	public int getPoke4spdfEV() {
		return Poke4spdfEV.getSelectedIndex();
	}

	public int getPoke4spdEV() {
		return Poke4spdEV.getSelectedIndex();
	}

	// pokemon 5 accessor methods
	public int getPokemon5() {
		return Pokemon5.getSelectedIndex();
	}

	public int getPoke5Lvl() {
		return Poke5Lvl.getSelectedIndex();
	}

	public int getPoke5Move1() {
		return Poke5Move1.getSelectedIndex();
	}

	public int getPoke5Move2() {
		return Poke5Move2.getSelectedIndex();
	}

	public int getPoke5Move3() {
		return Poke5Move3.getSelectedIndex();
	}

	public int getPoke5Move4() {
		return Poke5Move4.getSelectedIndex();
	}

	public int getPoke5hpEV() {
		return Poke5hpEV.getSelectedIndex();
	}

	public int getPoke5atEV() {
		return Poke5atEV.getSelectedIndex();
	}

	public int getPoke5dfEV() {
		return Poke5dfEV.getSelectedIndex();
	}

	public int getPoke5spatEV() {
		return Poke5spatEV.getSelectedIndex();
	}

	public int getPoke5spdfEV() {
		return Poke5spdfEV.getSelectedIndex();
	}

	public int getPoke5spdEV() {
		return Poke5spdEV.getSelectedIndex();
	}

	// pokemon 6 accessor methods
	public int getPokemon6() {
		return Pokemon6.getSelectedIndex();
	}

	public int getPoke6Lvl() {
		return Poke6Lvl.getSelectedIndex();
	}

	public int getPoke6Move1() {
		return Poke6Move1.getSelectedIndex();
	}

	public int getPoke6Move2() {
		return Poke6Move2.getSelectedIndex();
	}

	public int getPoke6Move3() {
		return Poke6Move3.getSelectedIndex();
	}

	public int getPoke6Move4() {
		return Poke6Move4.getSelectedIndex();
	}

	public int getPoke6hpEV() {
		return Poke6hpEV.getSelectedIndex();
	}

	public int getPoke6atEV() {
		return Poke6atEV.getSelectedIndex();
	}

	public int getPoke6dfEV() {
		return Poke6dfEV.getSelectedIndex();
	}

	public int getPoke6spatEV() {
		return Poke6spatEV.getSelectedIndex();
	}

	public int getPoke6spdfEV() {
		return Poke6spdfEV.getSelectedIndex();
	}

	public int getPoke6spdEV() {
		return Poke6spdEV.getSelectedIndex();
	}

	public Pokemon getPoke1() {
		return pokemon1;
	}

	public Pokemon getPoke2() {
		return pokemon2;
	}

	public Pokemon getPoke3() {
		return pokemon3;
	}

	public Pokemon getPoke4() {
		return pokemon4;
	}

	public Pokemon getPoke5() {
		return pokemon5;
	}

	public Pokemon getPoke6() {
		return pokemon6;
	}

	public void setPlayerName() {

		p.setName(JOptionPane.showInputDialog(null, "Player " + " Name:"));

	}

	public void setPokemon() {
		if (pokemon1 == null) {
			if (getPokemon1() != 0 && getPoke1Lvl() != -1
					&& getPoke1Move1() != 0 && getPoke1Move2() != 0
					&& getPoke1Move3() != 0 && getPoke1Move4() != 0
					&& getPoke1hpEV() != -1 && getPoke1atEV() != -1
					&& getPoke1dfEV() != -1 && getPoke1spatEV() != -1
					&& getPoke1spdfEV() != -1 && getPoke1spdEV() != -1) {
				System.out.println("Pokemon 1 Generated");
				pokemon1 = new Pokemon(getPokemon1(), "Pokemon 1",
						Ability.Levitate, Nature.Bold, Item.lifeOrb,
						getPoke1Lvl(), 0, 0, false, false, 50, getPoke1Move1(),
						getPoke1Move2(), getPoke1Move3(), getPoke1Move4(), 20,
						getPoke1hpEV() - 1, 20, getPoke1atEV() - 1, 20,
						getPoke1dfEV() - 1, 20, getPoke1spatEV() - 1, 20,
						getPoke1spdfEV() - 1, 20, getPoke1spdEV() - 1);
				p.addPoke(0, pokemon1);
			}
		}
		if (pokemon2 == null) {
			if (getPokemon2() != 0 && getPoke2Lvl() != -1
					&& getPoke2Move1() != 0 && getPoke2Move2() != 0
					&& getPoke2Move3() != 0 && getPoke2Move4() != 0
					&& getPoke2hpEV() != -1 && getPoke2atEV() != -1
					&& getPoke2dfEV() != -1 && getPoke2spatEV() != -1
					&& getPoke2spdfEV() != -1 && getPoke2spdEV() != -1) {
				System.out.println("Pokemon 2 Generated");
				pokemon2 = new Pokemon(getPokemon2(), "Pokemon 2",
						Ability.Levitate, Nature.Bold, Item.lifeOrb,
						getPoke2Lvl(), 0, 0, false, false, 50, getPoke2Move1(),
						getPoke2Move2(), getPoke2Move3(), getPoke2Move4(), 20,
						getPoke2hpEV() - 1, 20, getPoke2atEV() - 1, 20,
						getPoke2dfEV() - 1, 20, getPoke2spatEV() - 1, 20,
						getPoke2spdfEV() - 1, 20, getPoke2spdEV() - 1);
				p.addPoke(1, pokemon2);
			}
		}
		if (pokemon3 == null) {
			if (getPokemon3() != 0 && getPoke3Lvl() != -1
					&& getPoke3Move1() != 0 && getPoke3Move2() != 0
					&& getPoke3Move3() != 0 && getPoke3Move4() != 0
					&& getPoke3hpEV() != -1 && getPoke3atEV() != -1
					&& getPoke3dfEV() != -1 && getPoke3spatEV() != -1
					&& getPoke3spdfEV() != -1 && getPoke3spdEV() != -1) {
				System.out.println("Pokemon 3 Generated");
				pokemon3 = new Pokemon(getPokemon3(), "Pokemon3",
						Ability.Levitate, Nature.Bold, Item.lifeOrb,
						getPoke3Lvl(), 0, 0, false, false, 50, getPoke3Move1(),
						getPoke3Move2(), getPoke3Move3(), getPoke3Move4(), 20,
						getPoke3hpEV() - 1, 20, getPoke3atEV() - 1, 20,
						getPoke3dfEV() - 1, 20, getPoke3spatEV() - 1, 20,
						getPoke3spdfEV() - 1, 20, getPoke3spdEV() - 1);
				p.addPoke(2, pokemon3);
			}
		}
		if (pokemon4 == null) {
			if (getPokemon4() != 0 && getPoke4Lvl() != -1
					&& getPoke4Move1() != 0 && getPoke4Move2() != 0
					&& getPoke4Move3() != 0 && getPoke4Move4() != 0
					&& getPoke4hpEV() != -1 && getPoke4atEV() != -1
					&& getPoke4dfEV() != -1 && getPoke4spatEV() != -1
					&& getPoke4spdfEV() != -1 && getPoke4spdEV() != -1) {
				System.out.println("Pokemon 4 Generated");
				pokemon4 = new Pokemon(getPokemon4(), "Pokemon 1",
						Ability.Levitate, Nature.Bold, Item.lifeOrb,
						getPoke4Lvl(), 0, 0, false, false, 50, getPoke4Move1(),
						getPoke4Move2(), getPoke4Move3(), getPoke4Move4(), 20,
						getPoke4hpEV() - 1, 20, getPoke4atEV() - 1, 20,
						getPoke4dfEV() - 1, 20, getPoke4spatEV() - 1, 20,
						getPoke4spdfEV() - 1, 20, getPoke4spdEV() - 1);
				p.addPoke(3, pokemon4);
			}
		}
		if (pokemon5 == null) {
			if (getPokemon5() != 0 && getPoke5Lvl() != -1
					&& getPoke5Move1() != 0 && getPoke5Move2() != 0
					&& getPoke5Move3() != 0 && getPoke5Move4() != 0
					&& getPoke5hpEV() != -1 && getPoke5atEV() != -1
					&& getPoke5dfEV() != -1 && getPoke5spatEV() != -1
					&& getPoke5spdfEV() != -1 && getPoke5spdEV() != -1) {
				System.out.println("Pokemon 5 Generated");
				pokemon5 = new Pokemon(getPokemon5(), "Pokemon 5",
						Ability.Levitate, Nature.Bold, Item.lifeOrb,
						getPoke5Lvl(), 0, 0, false, false, 50, getPoke5Move1(),
						getPoke5Move2(), getPoke5Move3(), getPoke5Move4(), 20,
						getPoke5hpEV() - 1, 20, getPoke5atEV() - 1, 20,
						getPoke5dfEV() - 1, 20, getPoke5spatEV() - 1, 20,
						getPoke5spdfEV() - 1, 20, getPoke5spdEV() - 1);
				p.addPoke(4, pokemon5);
			}
		}
		if (pokemon6 == null) {
			if (getPokemon6() != 0 && getPoke6Lvl() != -1
					&& getPoke6Move1() != 0 && getPoke6Move2() != 0
					&& getPoke6Move3() != 0 && getPoke6Move4() != 0
					&& getPoke6hpEV() != -1 && getPoke6atEV() != -1
					&& getPoke6dfEV() != -1 && getPoke6spatEV() != -1
					&& getPoke6spdfEV() != -1 && getPoke6spdEV() != -1) {
				System.out.println("Pokemon 6 Generated");
				pokemon6 = new Pokemon(getPokemon6(), "Pokemon 6",
						Ability.Levitate, Nature.Bold, Item.lifeOrb,
						getPoke6Lvl(), 0, 0, false, false, 50, getPoke6Move1(),
						getPoke6Move2(), getPoke6Move3(), getPoke6Move4(), 20,
						getPoke6hpEV() - 1, 20, getPoke6atEV() - 1, 20,
						getPoke6dfEV() - 1, 20, getPoke6spatEV() - 1, 20,
						getPoke6spdfEV() - 1, 20, getPoke6spdEV() - 1);

				p.addPoke(5, pokemon6);

			}
		}

	}

	public void setPlayer(Player p) {
		this.p = p;
	}

}