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
		//Text BattleSim = new Text("Battle Simulator", 40, 300, canvas);
		
		
		
		FramedRect campaign = new FramedRect(width - 350, 300, 300, 80, canvas);
		
	}
	
}
