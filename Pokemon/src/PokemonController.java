import objectdraw.*;
import java.awt.*;

public class PokemonController extends WindowController{

	int width = 750;
	int height = 500;
	
	public void begin() {

		setSize(width, height);
		canvas.clear();
		
		FilledRect background = new FilledRect(0, 0, width, height, canvas);
		background.setColor(new Color(205, 205, 205));
		
		FramedRect battleSim = new FramedRect(50, 300, 300, 80, canvas);
		Text battleSimText = new Text("Battle Simulator", 80, 320, canvas);
		battleSimText.setFontSize(32);
		
		FramedRect campaign = new FramedRect(width - 350, 300, 300, 80, canvas);
		Text campaignText = new Text("Campaign", 470, 320, canvas);
		campaignText.setFontSize(32);
		
	}
	
}
