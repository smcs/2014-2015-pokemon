import objectdraw.*;
import javax.swing.*;
import java.awt.*;

public class PokemonController extends WindowController{

	int width = 750;
	int height = 500;

	String P1Name, P2Name;
	
	public void begin() {

		setSize(width, height);
		canvas.clear();
	
		((Component) canvas).setBackground(new Color(205, 205, 205));
		
		FramedRect battleSim = new FramedRect(50, 300, 300, 80, canvas);
		Text battleSimText = new Text("Battle Simulator", 80, 320, canvas);
		battleSimText.setFontSize(32);
		
		FramedRect campaign = new FramedRect(width - 350, 300, 300, 80, canvas);
		Text campaignText = new Text("Campaign", 470, 320, canvas);
		campaignText.setFontSize(32);
		
	}
	
	public void onMouseClick(Location point){
		
		if(point.getX() > 50  && point.getX() < 350 && 
				point.getY() > 300 && point.getY() < 380){
			setP1Name();
			setP2Name();
			drawBSmain();
			BattleSimulator bs = new BattleSimulator();
		}
		
	}
	
	public void setP1Name(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
	public void setP2Name(){
		
		P2Name =  JOptionPane.showInputDialog(null, "Player 2 Name:");
	    
	}

	private void drawBSmain() {
		
		canvas.clear();
		
		
	}
	
}
