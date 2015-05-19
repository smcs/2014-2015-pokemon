import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objectdraw.Text;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PokeFrame extends JFrame {
	
	private BS_JPanel homeScreen;
	private JPanel bsP1Choose, bsP2Choose;
	private CanvasController c1;
	private BattleSimulator battleSimulator;
	
	private PokeFrameButtonListener buttonListener;
	
	private static int width = 750;
	private static int height = 500;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					PokeFrame frame = new PokeFrame();
					frame.setVisible(true);
					frame.setSize(width, height);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void begin(){
		
	}

	/**
	 * Create the frame.
	 */
	public PokeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, width, height);
		homeScreen = new BS_JPanel();
		homeScreen.setBackground(new Color(205, 205, 205));
		homeScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(homeScreen);
		battleSimulator = new BattleSimulator();
		buttonListener = new PokeFrameButtonListener(homeScreen, battleSimulator);
		
		JButton battleSim = new JButton("Battle Simulator");
		buttonListener.registerButton(1);
		battleSim.addActionListener(buttonListener);
		battleSim.setBounds(120, 305, 120, 75);
		homeScreen.setLayout(null);
		homeScreen.add(battleSim);
		
		JButton campaign = new JButton("Campaign");
		//buttonListener.registerScreen("Campaign", campaignStart);
		campaign.addActionListener(buttonListener);
		campaign.setBounds(510, 305, 120, 75);
		
		homeScreen.add(campaign);

	}
	


}
