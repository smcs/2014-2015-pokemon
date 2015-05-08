import javax.swing.JButton;
import javax.swing.JComboBox;


public class BS_Arena extends BS_JPanel{

	private ButtonListener buttonListener;
	private ArenaPanelListener panelListener;
	
	private boolean turn = false;
	
	public BS_Arena(){
		
		setLayout(null);
		buttonListener = new ButtonListener(this, battleSimulator);
		panelListener = new ArenaPanelListener(this);
		
		JButton p1Move1 = new JButton("Move 1");
		p1Move1.setBounds(10, 200, 89, 29);
		p1Move1.addActionListener(buttonListener);
		add(p1Move1);
		//p1Move1.disable();
		
		JButton p1Move2 = new JButton("Move 2");
		p1Move2.setBounds(10, 250, 89, 29);
		p1Move2.addActionListener(buttonListener);
		add(p1Move2);
		
		JButton p1Move3 = new JButton("Move 3");
		p1Move3.setBounds(10, 300, 89, 29);
		p1Move3.addActionListener(buttonListener);
		add(p1Move3);
		
		JButton p1Move4 = new JButton("Move 4");
		p1Move4.setBounds(10, 350, 89, 29);
		p1Move4.addActionListener(buttonListener);
		add(p1Move4);
		
		JComboBox p1PokeSwitch = new JComboBox();
		p1PokeSwitch.setBounds(10, 450, 120, 50);
		p1PokeSwitch.addActionListener(buttonListener);
		add(p1PokeSwitch);
		
		JButton p2Move1 = new JButton("Move 1");
		p2Move1.setBounds(651, 200, 89, 29);
		p2Move1.addActionListener(buttonListener);
		add(p2Move1);
		
		JButton p2Move2 = new JButton("Move 2");
		p2Move2.setBounds(651, 250, 89, 29);
		p2Move2.addActionListener(buttonListener);
		add(p2Move2);
		
		JButton p2Move3 = new JButton("Move 3");
		p2Move3.setBounds(651, 300, 89, 29);
		p2Move3.addActionListener(buttonListener);
		add(p2Move3);
		
		JButton p2Move4 = new JButton("Move 4");
		p2Move4.setBounds(651, 350, 89, 29);
		p2Move4.addActionListener(buttonListener);
		add(p2Move4);
		
	}
	
	
}
