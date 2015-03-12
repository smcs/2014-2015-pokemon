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
	
	private JPanel contentPane;

	String P1Name, P2Name;
	
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
					frame.setBackground(new Color(205, 205, 205));
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton battleSim = new JButton("Battle Simulator");
		battleSim.setBounds(50, 300, 300, 80);
		battleSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setP1Name();
				setP2Name();
				drawBSmain();
			}
		});
		contentPane.add(battleSim, BorderLayout.WEST);

		JButton campaign = new JButton("Campaign");
		campaign.setBounds(400, 300, 300, 80);
		campaign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				drawCmain();
			}
		});
		contentPane.add(campaign, BorderLayout.EAST);

	}
	
	public void setP1Name(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
	public void setP2Name(){
		
		P2Name =  JOptionPane.showInputDialog(null, "Player 2 Name:");
	    
	}
	
	private void drawBSmain() {
		
		//Text pokeSelection = new Text("Select Your Pokemon!", 300, 30);
		
	}
	
	private void drawCmain(){
		
		
		
	}

}
