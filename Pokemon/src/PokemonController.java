import objectdraw.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PokemonController extends WindowController implements MouseListener{

	int width = 750;
	int height = 500;

	String P1Name, P2Name;
	
	public void begin() {

		setSize(width, height);
		canvas.clear();
	
		((Component) canvas).setBackground(new Color(205, 205, 205));
		
		JButton battleSim = new JButton("Battle Simulator");
		battleSim.setBounds(50, 300, 300, 80);
		//FramedRect battleSim = new FramedRect(50, 300, 300, 80, canvas);
		//Text battleSimText = new Text("Battle Simulator", 80, 320, canvas);
		//battleSimText.setFontSize(32);
		
		JButton campaign = new JButton("Campaign");
		campaign.setBounds(400, 300, 300, 80);
		//FramedRect campaign = new FramedRect(width - 350, 300, 300, 80, canvas);
		//Text campaignText = new Text("Campaign", 470, 320, canvas);
		//campaignText.setFontSize(32);
		
	}
	/*
	public void onMouseClick(Location point){
		
		if(point.getX() > 50  && point.getX() < 350 && 
				point.getY() > 300 && point.getY() < 380){
			setP1Name();
			setP2Name();
			drawBSmain();
			BattleSimulator bs = new BattleSimulator();
			//this will be where pokemon selection will happen
				//within that if loop will be where move selection will happen
					//then pokemon will be created here
		}
		
	} */
	
	public void setPlayerName(){
		
		P1Name =  JOptionPane.showInputDialog(null, "Player 1 Name:");
	    
	}
	public void setP2Name(){
		
		P2Name =  JOptionPane.showInputDialog(null, "Player 2 Name:");
	    
	}

	private void drawBSmain() {
		
		canvas.clear();
		Text pokeSelection = new Text("Select Your Pokemon!", 300, 30, canvas);
		pokeSelection.setFontSize(40);
		JComboBox cb1 = new JComboBox();
		//pokeSelection.setBold();
		//set up screen so both players can select their pokemon
			//click in certain box/button will select certain pokemon
			//once both are selected, move on to move selection
				//when complete, move on to battle stage
		
		
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
