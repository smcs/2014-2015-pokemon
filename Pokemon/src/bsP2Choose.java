import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Rectangle;


public class bsP2Choose extends JPanel{

	String P2Name;
	
	public bsP2Choose() {
		setLayout(null);
		setBounds(new Rectangle(0, 0, 750, 500));
		setBackground(new Color(205, 205, 205));
		
		
		JComboBox P2pokemon = new JComboBox();
		P2pokemon.setBounds(275, 200, 200, 50);
		add(P2pokemon);
		
		JComboBox P2pokemonLevel = new JComboBox();
		P2pokemonLevel.setBounds(275, 250, 200, 50);
		add(P2pokemonLevel);
		
		setP2Name();
		
	}

	private void setP2Name() {

		P2Name =  JOptionPane.showInputDialog(null, "Player 2 Name:");
		
	}
	
}
