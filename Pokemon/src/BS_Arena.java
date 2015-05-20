import javax.swing.JButton;
import javax.swing.JComboBox;
import objectdraw.*;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class BS_Arena extends BS_JPanel {

	private BS_ButtonListener buttonListener;
	private ArenaPanelListener panelListener;
	private BattleSimulator bs;
	// private DrawingCanvas canvas;

	private JProgressBar healthBar1, healthBar2;

	private int p1health, p2health;

	private boolean turn = false;

	private Player p1, p2;

	public BS_Arena(Player P1, Player P2, BattleSimulator battleSimulator) {

		bs.setRan();
		
		p1 = P1;
		p2 = P2;

		setLayout(null);
		buttonListener = new BS_ButtonListener(battleSimulator, this);
		panelListener = new ArenaPanelListener(this);
		bs = battleSimulator;

		p1health = bs.getP1Health();
		p2health = bs.getP2Health();
		System.out.println(p1health + " and " + p2health);

		// FramedRect border1 = new FramedRect(10, 10, 40, 110, canvas);
		// FramedRect border2 = new FramedRect(700, 10, 740, 110, canvas);

		JButton p1Move1 = new JButton(p1.getPoke1().getMove1().getName());
		System.out.println(p1.getPoke1().getMove1());
		p1Move1.setBounds(10, 200, 89, 29);
		p1Move1.addActionListener(buttonListener);
		buttonListener.registerButton(1);
		// p1Move1.removeActionListener(l);
		add(p1Move1);
		// p1Move1.disable();

		JButton p1Move2 = new JButton(p1.getPoke1().getMove2().getName());
		p1Move2.setBounds(10, 250, 89, 29);
		p1Move2.addActionListener(buttonListener);
		buttonListener.registerButton(2);
		add(p1Move2);

		JButton p1Move3 = new JButton(p1.getPoke1().getMove3().getName());
		p1Move3.setBounds(10, 300, 89, 29);
		p1Move3.addActionListener(buttonListener);
		buttonListener.registerButton(3);
		add(p1Move3);

		JButton p1Move4 = new JButton(p1.getPoke1().getMove4().getName());
		p1Move4.setBounds(10, 350, 89, 29);
		p1Move4.addActionListener(buttonListener);
		buttonListener.registerButton(4);
		add(p1Move4);

		JComboBox p1PokeSwitch = new JComboBox();
		p1PokeSwitch.setBounds(10, 400, 120, 50);
		p1PokeSwitch.addActionListener(buttonListener);
		add(p1PokeSwitch);
		// p1PokeSwitch.addItem(item);

		JButton p2Move1 = new JButton(p2.getPoke1().getMove1().getName());
		p2Move1.setBounds(651, 200, 89, 29);
		p2Move1.addActionListener(buttonListener);
		buttonListener.registerButton(5);
		add(p2Move1);

		JButton p2Move2 = new JButton(p2.getPoke1().getMove2().getName());
		p2Move2.setBounds(651, 250, 89, 29);
		p2Move2.addActionListener(buttonListener);
		buttonListener.registerButton(6);
		add(p2Move2);

		JButton p2Move3 = new JButton(p2.getPoke1().getMove3().getName());
		p2Move3.setBounds(651, 300, 89, 29);
		p2Move3.addActionListener(buttonListener);
		buttonListener.registerButton(7);
		add(p2Move3);

		JButton p2Move4 = new JButton(p2.getPoke1().getMove4().getName());
		p2Move4.setBounds(651, 350, 89, 29);
		p2Move4.addActionListener(buttonListener);
		buttonListener.registerButton(8);
		add(p2Move4);

		healthBar1 = new JProgressBar();
		healthBar1.setOrientation(SwingConstants.VERTICAL);
		healthBar1.setBounds(5, 6, 50, 182);
		add(healthBar1);
		healthBar1.setValue(p1health);
		// healthBar1.setValue(p1health - 50);

		healthBar2 = new JProgressBar();
		healthBar2.setOrientation(SwingConstants.VERTICAL);
		healthBar2.setBounds(695, 6, 50, 182);
		add(healthBar2);
		healthBar2.setValue(p2health);

	}

	public String getP1Move1() {
		return p1.getPoke1().getMove1().getName();
	}

	public String getP1Move2() {
		return p1.getPoke1().getMove2().getName();
	}

	public String getP1Move3() {
		return p1.getPoke1().getMove3().getName();
	}

	public String getP1Move4() {
		return p1.getPoke1().getMove4().getName();
	}

	public String getP2Move1() {
		return p2.getPoke1().getMove1().getName();
	}

	public String getP2Move2() {
		return p2.getPoke1().getMove2().getName();
	}

	public String getP2Move3() {
		return p2.getPoke1().getMove3().getName();
	}

	public String getP2Move4() {
		return p2.getPoke1().getMove4().getName();
	}

	public void doP1Move1() {

		// System.out.println("P1Move1");
		p2health = p2health - (p1.getPoke1().getMove1().getPower());
		if (p2health > 0) {
			setP2Health();
		} else {
			endGame(1);
		}

	}

	public void doP1Move2() {

		p2health = p2health - (p1.getPoke1().getMove2().getPower());
		if (p2health > 0) {
			setP2Health();
		} else {
			endGame(1);
		}

	}

	public void doP1Move3() {

		p2health = p2health - (p1.getPoke1().getMove3().getPower());
		if (p2health > 0) {
			setP2Health();
		} else {
			endGame(1);
		}

	}

	public void doP1Move4() {

		p2health = p2health - (p1.getPoke1().getMove4().getPower());
		if (p2health > 0) {
			setP2Health();
		} else {
			endGame(1);
		}

	}

	public void doP2Move1() {

		p1health = p1health - (p2.getPoke1().getMove1().getPower());
		if (p1health > 0) {
			setP1Health();
		} else {
			endGame(2);
		}

	}

	public void doP2Move2() {

		p1health = p1health - (p2.getPoke1().getMove2().getPower());
		if (p1health > 0) {
			setP1Health();
		} else {
			endGame(2);
		}

	}

	public void doP2Move3() {

		p1health = p1health - (p2.getPoke1().getMove3().getPower());
		if (p1health > 0) {
			setP1Health();
		} else {
			endGame(2);
		}

	}

	public void doP2Move4() {

		p1health = p1health - (p2.getPoke1().getMove4().getPower());
		if (p1health > 0) {
			setP1Health();
		} else {
			endGame(2);
		}

	}

	public void setP1Health() {
		healthBar1.setValue(p1health);
	}

	public void setP2Health() {
		healthBar2.setValue(p2health);
	}

	private void endGame(int winner) {

		System.out.println("Congratulations Player " + winner + ".  You Win!");

	}

}
