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
	
	/*public int typeEffectivenessCalculator(Type moveType, Type defendingPokemonType1, Type defendingPokemonType2){
		int effectiveness = 1;
		
		if (moveType == Normal){
			if (defendingPokemonType1 == Ghost || defendingPokemonType2 == Ghost){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
		}
		
		if (moveType == Fighting){
			if (defendingPokemonType1 == Ghost || defendingPokemonType2 == Ghost){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Bug || defendingPokemonType2 == Bug){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fairy || defendingPokemonType2 == Fairy){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Psychic || defendingPokemonType2 == Psychic){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Dark || defendingPokemonType2 == Dark){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Ice || defendingPokemonType2 == Ice){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Normal || defendingPokemonType2 == Normal){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Fairy){
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Dark || defendingPokemonType2 == Dark){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Fighting || defendingPokemonType2 == Fighting){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Fire){
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Bug || defendingPokemonType2 == Bug){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Ice || defendingPokemonType2 == Ice){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Water){
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Water || defendingPokemonType2 == Water){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Ground || defendingPokemonType2 == Ground){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Grass){
			if (defendingPokemonType1 == Bug || defendingPokemonType2 == Bug){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ground || defendingPokemonType2 == Ground){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Water || defendingPokemonType2 == Water){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Electric){
			if (defendingPokemonType1 == Ground || defendingPokemonType2 == Ground){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Electric || defendingPokemonType2 == Electric){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Water || defendingPokemonType2 == Water){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Flying){
			
			if (defendingPokemonType1 == Electric || defendingPokemonType2 == Electric){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Bug || defendingPokemonType2 == Bug){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Fighting || defendingPokemonType2 == Fighting){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Poison){
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Ghost || defendingPokemonType2 == Ghost){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ground || defendingPokemonType2 == Ground){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fairy || defendingPokemonType2 == Fairy){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Ground){
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Bug || defendingPokemonType2 == Bug){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Electric || defendingPokemonType2 == Electric){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Rock){
			if (defendingPokemonType1 == Fighting || defendingPokemonType2 == Fighting){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ground || defendingPokemonType2 == Ground){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Bug || defendingPokemonType2 == Bug){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Ice || defendingPokemonType2 == Ice){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Steel){
			if (defendingPokemonType1 == Electric || defendingPokemonType2 == Electric){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Water || defendingPokemonType2 == Water){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fairy || defendingPokemonType2 == Fairy){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Ice || defendingPokemonType2 == Ice){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Rock || defendingPokemonType2 == Rock){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Ice){
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ice || defendingPokemonType2 == Ice){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Water || defendingPokemonType2 == Water){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Ground || defendingPokemonType2 == Ground){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Dragon){
			if (defendingPokemonType1 == Fairy || defendingPokemonType2 == Fairy){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Dragon || defendingPokemonType2 == Dragon){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Bug){
			if (defendingPokemonType1 == Fairy || defendingPokemonType2 == Fairy){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fighting || defendingPokemonType2 == Fighting){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fire || defendingPokemonType2 == Fire){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Flying || defendingPokemonType2 == Flying){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ghost || defendingPokemonType2 == Ghost){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Dark || defendingPokemonType2 == Dark){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Grass || defendingPokemonType2 == Grass){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Psychic || defendingPokemonType2 == Psychic){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Psychic){
			if (defendingPokemonType1 == Dark || defendingPokemonType2 == Dark){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Psychic || defendingPokemonType2 == Psychic){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Steel || defendingPokemonType2 == Steel){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fighting || defendingPokemonType2 == Fighting){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Poison || defendingPokemonType2 == Poison){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Ghost){
			if (defendingPokemonType1 == Normal || defendingPokemonType2 == Normal){
				effectiveness = effectiveness * 0;
			}
			if (defendingPokemonType1 == Dark || defendingPokemonType2 == Dark){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ghost || defendingPokemonType2 == Ghost){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Psychic || defendingPokemonType2 == Psychic){
				effectiveness = effectiveness * 2;
			}
		}
		
		if (moveType == Dark){
			if (defendingPokemonType1 == Dark || defendingPokemonType2 == Dark){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fairy || defendingPokemonType2 == Fairy){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Fighting || defendingPokemonType2 == Fighting){
				effectiveness = effectiveness * .5;
			}
			if (defendingPokemonType1 == Ghost || defendingPokemonType2 == Ghost){
				effectiveness = effectiveness * 2;
			}
			if (defendingPokemonType1 == Psychic || defendingPokemonType2 == Psychic){
				effectiveness = effectiveness * 2;
			}
		}
		
		return effectiveness;
	}
	*/
}
