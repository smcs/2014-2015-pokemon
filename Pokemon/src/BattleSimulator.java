import java.util.Vector;

import objectdraw.*;

public class BattleSimulator {
	
	int weatherStatus = 0;
	// 0 = clear, 1 = rain, 2 = sun, 3 = sandstorm, 4 = hail
	int weatherCounter = 0;

	int P1AttackBoost = 0;
	int P1DefenseBoost = 0;
	int P1SpAttackBoost = 0;
	int P1SpDefenseBoost = 0;
	int P1SpeedBoost = 0;
	int P1CritBoost = 0;
	int P1EvasionBoost = 0;
	int P1AccuracyBoost = 0;
	
	int P2AttackBoost = 0;
	int P2DefenseBoost = 0;
	int P2SpAttackBoost = 0;
	int P2SpDefenseBoost = 0;
	int P2SpeedBoost = 0;
	int P2CritBoost = 0;
	int P2EvasionBoost = 0;
	int P2AccuracyBoost = 0;
	
	private Vector<Player> players = new Vector<Player>();
	
	public BattleSimulator(){
		
		
		
	}
	
	public addPlayer(Player p) {
		players.add(p);
	}
	
	public void createP1Pokemon(){
		//Pokemon P1poke = new Pokemon(blah blah);
	}
	public void createP2Pokemon(){
		//Pokemon P2poke = new Pokemon(blah blah);
	}
	
	public double statCalculator(int Base, int IV, int EV, int Level){
		double Stat;
		Stat = ((IV + (2*Base) + (EV/4)) * (Level/100)) + 5;
		Math.floor(Stat);
		return Stat;
	}
	
	public double hpCalculator(int Base, int IV, int EV, int Level){
		double HP;
		HP = ((IV + (2*Base) + (EV/4) + 100) * (Level/100)) + 10;
		Math.floor(HP);
		return HP;
	}
	
	// statType: 0 == Attack, 1 == Defense, 2 == Sp.Attack, 3 == Sp.Defense, 4 == Speed
	public double natureCalculator(int Stat, Nature Nature, int statType){
		
	}
	
	public boolean accuracyCalculator(int Accuracy, int accuracyBoost, int evasionBoost){
		boolean hit = false;
		int hitBoost = accuracyBoost - evasionBoost;
		double hitMod = 1;
		if(hitBoost <= -6){
			hitMod = 3/9;
		}
		if(hitBoost == -5){
			hitMod = 3/8;
		}
		if(hitBoost == -4){
			hitMod = 3/7;
		}
		if(hitBoost == -3){
			hitMod = 3/6;
		}
		if(hitBoost == -2){
			hitMod = 3/5;
		}
		if(hitBoost == -1){
			hitMod = 3/4;
		}
		if(hitBoost == 1){
			hitMod = 4/3;
		}
		if(hitBoost == 2){
			hitMod = 5/3;
		}
		if(hitBoost == 3){
			hitMod = 6/3;
		}
		if(hitBoost == 4){
			hitMod = 7/3;
		}
		if(hitBoost == 5){
			hitMod = 8/3;
		}
		if(hitBoost >= 6){
			hitMod = 9/3;
		}
		
		if(Math.random() <= (Accuracy * hitMod)){
			hit = true;
		}
		
		return hit;
	} 
	
	public double damageCalculator(int Level, int Attack, int Defense, int BasePower, Type moveType, 
	 Type defendingPokemonType1, Type defendingPokemonType2, Type attackingPokemonType1, Type attackingPokemonType2, 
	 Item attackingPokemonItem, Item defendingPokemonItem, Ability attackingPokemonAbility, Ability defendingPokemonAbility,
	 int attackBoost, int defenseBoost, int critBoost){
		
		double effectiveness = typeEffectivenessCalculator (moveType, defendingPokemonType1, defendingPokemonType2);
		double STAB = stabCalculator (moveType, attackingPokemonType1, attackingPokemonType2);
		double attackBooster = boostCalculator(attackBoost);
		double defenseBooster = boostCalculator(defenseBoost);
		double Critical = critCalculator(critBoost);
		double heldItem = itemCalculator (attackingPokemonItem, defendingPokemonItem);
		double abilityMod = abilityCalculator (attackingPokemonAbility, defendingPokemonAbility, moveType);
		double Weather = weatherCalculator(moveType);
		double Other = 1;
		
		double Damage = (((((2 * Level) + 10)/250) * ((Attack*attackBooster)/(Defense * defenseBooster)) * BasePower) + 2) 
		* STAB * effectiveness * Critical * Weather * heldItem * abilityMod * Other * (1 - (Math.random()) / (100/15));
		
		Math.floor(Damage);
		
		return Damage;
	}
	//Notes: Level is level of attacking Pokemon
	
	public double boostCalculator(int Boost){
		double Booster = 1;
		if(Boost <= -6){
			Booster = 1/4;
		}
		if(Boost == -5){
			Booster = 1/3.5;
		}
		if(Boost == -4){
			Booster = 1/3;
		}
		if(Boost == -3){
			Booster = 1/2.5;
		}
		if(Boost == -2){
			Booster = 1/2;
		}
		if(Boost == -1){
			Booster = 1/1.5;
		}
		if(Boost == 1){
			Booster = 1.5;
		}
		if(Boost == 2){
			Booster = 2;
		}
		if(Boost == 3){
			Booster = 2.5;
		}
		if(Boost == 4){
			Booster = 3;
		}
		if(Boost == 5){
			Booster = 3.5;
		}
		if(Boost >= 6){
			Booster = 4;
		}
		return Booster;
	}
	
	public double weatherCalculator(Type moveType){
		double Weather = 1;
		
		if(weatherStatus == 1 && moveType == Type.Water){
			Weather = 1.5;
		}
		
		if(weatherStatus == 1 && moveType == Type.Fire){
			Weather = .5;
		}
		
		if(weatherStatus == 2 && moveType == Type.Fire){
			Weather = 1.5;
		}
		
		if(weatherStatus == 2 && moveType == Type.Water){
			Weather = .5;
		}
		
		return Weather;
	}
	
	public double abilityCalculator(Ability attackingPokemonAbility, Ability defendingPokemonAbility, Type moveType){
		double abilityMod = 1;
		
		if (defendingPokemonAbility == Ability.Levitate && moveType == Type.Ground){
			abilityMod = 0;
		}
		
		return abilityMod;
	}
	
	public double itemCalculator(Item attackingPokemonItem, Item defendingPokemonItem){
		double heldItem = 1;
		
		if (attackingPokemonItem == Item.lifeOrb){
			heldItem = 1.3;
		}
		
		return heldItem;
	}
	
	public double critCalculator(int critBoost){
		double random = Math.random();
		double Critical = 1;
		boolean didItCrit = false;
		
		if(random <= .0625 && critBoost == 0){
			didItCrit = true;
		}
		if(random <= .125 && critBoost == 1){
			didItCrit = true;
		}
		if(random <= .5 && critBoost == 2){
			didItCrit = true;
		}
		if(critBoost >= 3){
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
