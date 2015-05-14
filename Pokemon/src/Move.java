public class Move {
	// If Attack or Defense is true, use physical stats. If false, use special
	// stats.
	
	private int power;
	private double accuracy;
	private int pp;
	private Type type;
	
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
		}
		//scratch
		if (moveNumber == 1) {
			power = 40;
			accuracy = 1; 
			pp = 35;
			type = Type.Normal;
		}
		//water gun
		if (moveNumber == 2) {
			power = 45;
			accuracy = 1;
			pp = 25;
			type = Type.Water;
		}
		//ember
		if (moveNumber == 3) {
			power = 45;
			accuracy = 1;
			pp = 25;
			type = Type.Fire;
		}
		//razor leaf
		if (moveNumber == 4) {
			power = 45;
			accuracy = 1;
			pp = 25;
			type = Type.Grass;
		}
		//leer
		if (moveNumber == 5) {
			power = 0;
			accuracy = 1;
			pp = 30;
			type = Type.Normal;
		}
		//growl
		if (moveNumber == 6) {
			power = 0;
			accuracy = 1;
			pp = 40;
			type = Type.Normal;
		}
		//sword dance
		if (moveNumber == 7) {
			power = 0;
			accuracy = 1;
			pp = 20;
			type = Type.Normal;
		}//harden
		if (moveNumber == 8) {
			power = 0;
			accuracy = 1;
			pp = 30;
			type = Type.Normal;
		}//agility
		if (moveNumber == 9) {
			power = 0;
			accuracy = 1;
			pp = 30;
			type = Type.Psychic;
		}

	}

}
