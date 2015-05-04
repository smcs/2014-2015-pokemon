
public class Pokemon {
	
	public Pokemon (int Species, String Name, Ability Ability, Nature Nature, Item HeldItem, int Level, int Exp,
			int Status, boolean confused, boolean Gender, int CatchRate,
			int Move1, int Move2, int Move3, int Move4, 
			int Hiv, int Hev, 
			int Atkiv, int Atkev,
			int Defiv, int Defev,
			int SpAtkiv, int SpAtkev,
			int SpDefiv, int SpDefev,
			int Speediv, int Speedev)
	{
		if (Species == 25){
			Pickachu(25, Name, Ability, Nature,  HeldItem, Level, Exp,
			Type.Electric, null, Status, confused, Gender, 190,
			Move1, Move2, Move3, Move4, 
			35,  Hiv, Hev, 0,
			55, Atkiv, Atkev, 0,
			40, Defiv, Defev, 0,
			50, SpAtkiv, SpAtkev, 0,
			50, SpDefiv, SpDefev, 0,
			90, Speediv, Speedev, 2,
			.4, 6);
		}
	}
	public void Pickachu(int Species, String Name, Ability Ability, Nature Nature, Item HeldItem, int Level, int Exp,
			Type Type1, Type Type2, int Status, boolean confused, boolean Gender, int CatchRate,
			Move Move1, Move Move2, Move Move3, Move Move4, 
			int HealthBase, int Hiv, int Hev, int Hgive, 
			int AtkBase, int Atkiv, int Atkev, int Atkgive,
			int DefBase, int Defiv, int Defev, int Defgive,
			int SpAtkBase, int SpAtkiv, int SpAtkev, int SpAtkgive,
			int SpDefBase, int SpDefiv, int SpDefev, int SpDefgive,
			int SpeedBase, int Speediv, int Speedev, int Speedgive,
			double height, double weight){}
}

/*int Species, String Name, String Ability, String Nature, String HeldItem, int Level, int Exp,
Type Type1, Type Type2, int Status, boolean confused, boolean Gender, int CatchRate,
Move Move1, Move Move2, Move Move3, Move Move4, 
int HealthBase, int Hiv, int Hev, 
int AtkBase, int Atkiv, int Atkev,
int DefBase, int Defiv, int Defev,
int SpAtkBase, int SpAtkiv, int SpAtkev,
int SpDefBase, int SpDefiv, int SpDefev,
int SpeedBase, int Speediv, int Speedev
*/