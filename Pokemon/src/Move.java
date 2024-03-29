public class Move {
	// If Attack or Defense is true, use physical stats. If false, use special
	// stats.
	
	private int power;
	private double accuracy;
	private int pp;
	private Type type;
	private String name;
	private int special = 0;
	
	public Move(int moveNumber/*
							 * String Name, Type MoveType, int BasePower,
							 * boolean Attack, boolean Defense, int PowerPoints,
							 * int Accuracy
							 */) {
		
		//tackle
		if (moveNumber == 0) {
			power = 35;
			accuracy = .95;
			pp = 35;
			type = Type.Normal;
			name = "Tackle";
			special = 0;
		}
		//scratch
		if (moveNumber == 1) {
			power = 40;
			accuracy = 1; 
			pp = 35;
			type = Type.Normal;
			name = "Scratch";
			special = 0;
		}
		//water gun
		if (moveNumber == 2) {
			power = 45;
			accuracy = 1;
			pp = 25;
			type = Type.Water;
			name = "Water Gun";
			special = 1;
		}
		//ember
		if (moveNumber == 3) {
			power = 45;
			accuracy = 1;
			pp = 25;
			type = Type.Fire;
			name = "Ember";
			special = 1;
		}
		//razor leaf
		if (moveNumber == 4) {
			power = 45;
			accuracy = 1;
			pp = 25;
			type = Type.Grass;
			name = "Razor Leaf";
			special = 1;
		}
		//leer
		if (moveNumber == 5) {
			power = 0;
			accuracy = 1;
			pp = 30;
			type = Type.Normal;
			name = "Leer";
		}
		//growl
		if (moveNumber == 6) {
			power = 0;
			accuracy = 1;
			pp = 40;
			type = Type.Normal;
			name = "Growl";
		}
		//sword dance
		if (moveNumber == 7) {
			power = 0;
			accuracy = 1;
			pp = 20;
			type = Type.Normal;
			name = "Sword Dance";
		}//harden
		if (moveNumber == 8) {
			power = 0;
			accuracy = 1;
			pp = 30;
			type = Type.Normal;
			name = "Harden";
		}//agility
		if (moveNumber == 9) {
			power = 0;
			accuracy = 1;
			pp = 30;
			type = Type.Psychic;
			name = "Agility";
		}
		
		if(special == 0){
			//power = power*
		} else if(special == 1){
			
		}

	}
	
	public int getPower(){
		return power;
	}
	public String getName(){
		return name;
	}

}
