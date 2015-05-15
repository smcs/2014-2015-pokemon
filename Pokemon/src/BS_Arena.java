import javax.swing.JButton;
import javax.swing.JComboBox;


public class BS_Arena extends BS_JPanel{

	private BS_ButtonListener buttonListener;
	private ArenaPanelListener panelListener;
	private BattleSimulator bs;
	
	private boolean turn = false;
	
	public BS_Arena(Player p1, Player p2, BattleSimulator battleSimulator){
		
		setLayout(null);
		buttonListener = new BS_ButtonListener(battleSimulator);
		panelListener = new ArenaPanelListener(this);
		bs = battleSimulator;
		
		JButton p1Move1 = new JButton(p1.getPoke1().getMove1());
		p1Move1.setBounds(10, 200, 89, 29);
		buttonListener.registerButton(1);
		p1Move1.addActionListener(buttonListener);
		//p1Move1.removeActionListener(l);
		add(p1Move1);
		//p1Move1.disable();
		
		JButton p1Move2 = new JButton(p1.getPoke1().getMove2());
		p1Move2.setBounds(10, 250, 89, 29);
		buttonListener.registerButton(2);
		p1Move2.addActionListener(buttonListener);
		add(p1Move2);
		
		JButton p1Move3 = new JButton(p1.getPoke1().getMove3());
		p1Move3.setBounds(10, 300, 89, 29);
		buttonListener.registerButton(3);
		p1Move3.addActionListener(buttonListener);
		add(p1Move3);
		
		JButton p1Move4 = new JButton(p1.getPoke1().getMove4());
		p1Move4.setBounds(10, 350, 89, 29);
		buttonListener.registerButton(4);
		p1Move4.addActionListener(buttonListener);
		add(p1Move4);
		
		JComboBox p1PokeSwitch = new JComboBox();
		p1PokeSwitch.setBounds(10, 400, 120, 50);
		p1PokeSwitch.addActionListener(buttonListener);
		add(p1PokeSwitch);
		//p1PokeSwitch.addItem(item);
		
		JButton p2Move1 = new JButton("Move 1");
		p2Move1.setBounds(651, 200, 89, 29);
		buttonListener.registerButton(5);
		p2Move1.addActionListener(buttonListener);
		add(p2Move1);
		
		JButton p2Move2 = new JButton("Move 2");
		p2Move2.setBounds(651, 250, 89, 29);
		buttonListener.registerButton(6);
		p2Move2.addActionListener(buttonListener);
		add(p2Move2);
		
		JButton p2Move3 = new JButton("Move 3");
		p2Move3.setBounds(651, 300, 89, 29);
		buttonListener.registerButton(7);
		p2Move3.addActionListener(buttonListener);
		add(p2Move3);
		
		JButton p2Move4 = new JButton("Move 4");
		p2Move4.setBounds(651, 350, 89, 29);
		buttonListener.registerButton(8);
		p2Move4.addActionListener(buttonListener);
		add(p2Move4);
		
	}

	public static void doP1Move1() {
		
		
	}

	public static void doP1Move2() {
		// TODO Auto-generated method stub
		
	}

	public static void doP1Move3() {
		// TODO Auto-generated method stub
		
	}

	public static void doP1Move4() {
		// TODO Auto-generated method stub
		
	}

	public static void doP2Move1() {
		// TODO Auto-generated method stub
		
	}

	public static void doP2Move2() {
		// TODO Auto-generated method stub
		
	}

	public static void doP2Move3() {
		// TODO Auto-generated method stub
		
	}

	public static void doP2Move4() {
		// TODO Auto-generated method stub
		
	}
	
	
}
