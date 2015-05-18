import javax.swing.JButton;
import javax.swing.JComboBox;
import objectdraw.*;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;


public class BS_Arena extends BS_JPanel{

	private BS_ButtonListener buttonListener;
	private ArenaPanelListener panelListener;
	private BattleSimulator bs;
	//private DrawingCanvas canvas;
	
	private JProgressBar healthBar1, healthBar2;
	
	private int p1health, p2health;
	
	private boolean turn = false;
	
	private Player p1, p2;
	
	public BS_Arena(Player P1, Player P2, BattleSimulator battleSimulator){
		
		p1 = P1;
		p2 = P2;
		
		setLayout(null);
		buttonListener = new BS_ButtonListener(battleSimulator);
		panelListener = new ArenaPanelListener(this);
		bs = battleSimulator;
		
		p1health = 100;
		p2health = 100;
		
		//FramedRect border1 = new FramedRect(10, 10, 40, 110, canvas);
		//FramedRect border2 = new FramedRect(700, 10, 740, 110, canvas);
		
		
		JButton p1Move1 = new JButton(p1.getPoke1().getMove1().getName());
		System.out.println(p1.getPoke1().getMove1());
		p1Move1.setBounds(10, 200, 89, 29);
		buttonListener.registerButton(1);
		p1Move1.addActionListener(buttonListener);
		//p1Move1.removeActionListener(l);
		add(p1Move1);
		//p1Move1.disable();
		
		JButton p1Move2 = new JButton(p1.getPoke1().getMove2().getName());
		p1Move2.setBounds(10, 250, 89, 29);
		buttonListener.registerButton(2);
		p1Move2.addActionListener(buttonListener);
		add(p1Move2);
		
		JButton p1Move3 = new JButton(p1.getPoke1().getMove3().getName());
		p1Move3.setBounds(10, 300, 89, 29);
		buttonListener.registerButton(3);
		p1Move3.addActionListener(buttonListener);
		add(p1Move3);
		
		JButton p1Move4 = new JButton(p1.getPoke1().getMove4().getName());
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
		
		healthBar1 = new JProgressBar();
		healthBar1.setOrientation(SwingConstants.VERTICAL);
		healthBar1.setBounds(5, 6, 50, 182);
		add(healthBar1);
		healthBar1.setValue(p1health);
		
		healthBar2 = new JProgressBar();
		healthBar2.setOrientation(SwingConstants.VERTICAL);
		healthBar2.setBounds(695, 6, 50, 182);
		add(healthBar2);
		healthBar2.setValue(p2health);
		
		
		
	}

	public void doP1Move1() {
		
		
		if(p2health > 0){
			p2health = p2health - (p1.getPoke1().getMove1().getPower());
		}
		
	}

	public void doP1Move2() {
		
		
	}

	public void doP1Move3() {
		
		
	}

	public void doP1Move4() {
		
		
	}

	public void doP2Move1() {
		
		
	}

	public void doP2Move2() {
		
		
	}

	public void doP2Move3() {
		
		
	}

	public void doP2Move4() {
		
		
	}

	public void setP1Health() {
		healthBar1.setValue(p1health);
	}
	
	public void setP2Health(){
		healthBar2.setValue(p2health);
	}
}
