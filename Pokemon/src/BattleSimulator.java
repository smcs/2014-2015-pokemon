import objectdraw.*;

public class BattleSimulator {

	public BattleSimulator(){
		
		
		
	}
	
	public void createP1Pokemon(){
		//Pokemon P1poke = new Pokemon(blah blah);
	}
	public void createP2Pokemon(){
		//Pokemon P2poke = new Pokemon(blah blah);
	}
	
	/*public double damageCalculator(int Level, int Attack, int Defense, int BasePower, Type moveType, Type defendingPokemonType1, Type defendingPokemonType2, Type attackingPokemonType1, Type attackingPokemonType2){
		double effectiveness = typeEffectivenessCalculator(moveType, defendingPokemonType1, defendingPokemonType2);
		double STAB = stabCalculator(moveType, attackingPokemonType1, attackingPokemonType2);
		double Critical = critCalculator();
		
		double Damage = (((((2 * Level) + 10)/250) * (Attack/Defense) * BasePower) + 2) 
		* STAB * effectiveness * Critical * Weather * heldItem * Ability * Other * random(.85,1);
	
		return Damage;
	}
	Notes: Level is level of attacking Pokemon
	*/
	
	public double critCalculator(){
		double random = Math.random();
		double Critical = 1;
		boolean didItCrit = false;
		
		if(random <= .0625){
			didItCrit = true;
		}
		
		if (didItCrit == true){
			Critical = 1.5;
		}
		
	 	return Critical;
	 }
	
	
	public double stabCalculator(Type moveType, Type attackingPokemonType1, Type attackingPokemonType2){
	   double STAB = 1; 
	 	if (moveType == attackingPokemonType1 || moveType == attackingPokemonType2){
	 		STAB = 1.5;
	 	}
	 	 return STAB;
	  }
	 
	
	public double typeEffectivenessCalculator(Type moveType, Type defendingPokemonType1, Type defendingPokemonType2) {
		
		double effectiveness = 1;
		
		if (moveType == Type.Normal){
			if (defendingPokemonType1 == Type.Ghost || defendingPokemonType2 == Type.Ghost){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
		}
		
		if (moveType == Type.Fighting){
			if (defendingPokemonType1 == Type.Ghost || defendingPokemonType2 == Type.Ghost){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Bug || defendingPokemonType2 == Type.Bug){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fairy || defendingPokemonType2 == Type.Fairy){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Psychic || defendingPokemonType2 == Type.Psychic){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Dark || defendingPokemonType2 == Type.Dark){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Ice || defendingPokemonType2 == Type.Ice){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Normal || defendingPokemonType2 == Type.Normal){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Fairy){
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Dark || defendingPokemonType2 == Type.Dark){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Fighting || defendingPokemonType2 == Type.Fighting){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Fire){
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Bug || defendingPokemonType2 == Type.Bug){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Ice || defendingPokemonType2 == Type.Ice){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Water){
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Water || defendingPokemonType2 == Type.Water){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Ground || defendingPokemonType2 == Type.Ground){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Grass){
			if (defendingPokemonType1 == Type.Bug || defendingPokemonType2 == Type.Bug){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ground || defendingPokemonType2 == Type.Ground){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Water || defendingPokemonType2 == Type.Water){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Electric){
			if (defendingPokemonType1 == Type.Ground || defendingPokemonType2 == Type.Ground){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Electric || defendingPokemonType2 == Type.Electric){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Water || defendingPokemonType2 == Type.Water){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Flying){
			
			if (defendingPokemonType1 == Type.Electric || defendingPokemonType2 == Type.Electric){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Bug || defendingPokemonType2 == Type.Bug){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Fighting || defendingPokemonType2 == Type.Fighting){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Poison){
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Ghost || defendingPokemonType2 == Type.Ghost){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ground || defendingPokemonType2 == Type.Ground){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fairy || defendingPokemonType2 == Type.Fairy){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Ground){
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Bug || defendingPokemonType2 == Type.Bug){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Electric || defendingPokemonType2 == Type.Electric){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Rock){
			if (defendingPokemonType1 == Type.Fighting || defendingPokemonType2 == Type.Fighting){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ground || defendingPokemonType2 == Type.Ground){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Bug || defendingPokemonType2 == Type.Bug){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Ice || defendingPokemonType2 == Type.Ice){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Steel){
			if (defendingPokemonType1 == Type.Electric || defendingPokemonType2 == Type.Electric){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Water || defendingPokemonType2 == Type.Water){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fairy || defendingPokemonType2 == Type.Fairy){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Ice || defendingPokemonType2 == Type.Ice){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Rock || defendingPokemonType2 == Type.Rock){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Ice){
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ice || defendingPokemonType2 == Type.Ice){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Water || defendingPokemonType2 == Type.Water){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Ground || defendingPokemonType2 == Type.Ground){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Dragon){
			if (defendingPokemonType1 == Type.Fairy || defendingPokemonType2 == Type.Fairy){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Dragon || defendingPokemonType2 == Type.Dragon){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Bug){
			if (defendingPokemonType1 == Type.Fairy || defendingPokemonType2 == Type.Fairy){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fighting || defendingPokemonType2 == Type.Fighting){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fire || defendingPokemonType2 == Type.Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Flying || defendingPokemonType2 == Type.Flying){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ghost || defendingPokemonType2 == Type.Ghost){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Dark || defendingPokemonType2 == Type.Dark){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Grass || defendingPokemonType2 == Type.Grass){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Psychic || defendingPokemonType2 == Type.Psychic){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Psychic){
			if (defendingPokemonType1 == Type.Dark || defendingPokemonType2 == Type.Dark){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Psychic || defendingPokemonType2 == Type.Psychic){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Steel || defendingPokemonType2 == Type.Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fighting || defendingPokemonType2 == Type.Fighting){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Poison || defendingPokemonType2 == Type.Poison){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Ghost){
			if (defendingPokemonType1 == Type.Normal || defendingPokemonType2 == Type.Normal){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Type.Dark || defendingPokemonType2 == Type.Dark){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ghost || defendingPokemonType2 == Type.Ghost){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Psychic || defendingPokemonType2 == Type.Psychic){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Type.Dark){
			if (defendingPokemonType1 == Type.Dark || defendingPokemonType2 == Type.Dark){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fairy || defendingPokemonType2 == Type.Fairy){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Fighting || defendingPokemonType2 == Type.Fighting){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Type.Ghost || defendingPokemonType2 == Type.Ghost){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Type.Psychic || defendingPokemonType2 == Type.Psychic){
				effectiveness = effectiveness * 2;
			}
		}
		
		return effectiveness;
	}
	
}
