import javax.swing.JButton;
import javax.swing.JPanel;


public class BS_JPanel extends JPanel {
	
	protected BattleSimulator battleSimulator;
	
	public void attachBattleSimulator(BattleSimulator battleSimulator) {
		this.battleSimulator = battleSimulator;
	}
	
	private boolean turn = false;
	
	
	public BS_JPanel() {
		
		JButton p1Move1 = new JButton("Move 1");
		p1Move1.setBounds(315, 440, 120, 30);
		add(p1Move1);
		
	}
	
	
}
