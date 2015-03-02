
public class Pokemon {
	
	public Pokemon (int Species, String Name, String Ability, String Nature, String HeldItem, int Level, int Exp,
			Type Type1, Type Type2, int Status, boolean confused, boolean Gender, int CatchRate,
			Move Move1, Move Move2, Move Move3, Move Move4, 
			int Hiv, int Hev, 
			int Atkiv, int Atkev,
			int Defiv, int Defev,
			int SpAtkiv, int SpAtkev,
			int SpDefiv, int SpDefev,
			int Speediv, int Speedev)
	{
		if (Species == 25){
			Pickachu(Species, Name, Ability, Nature,  HeldItem, Level, Exp,
			Type1, null, Status, confused, Gender, 190,
			 Move1, Move2, Move3, Move4, 
			 35,  Hiv, Hev, 
			 55, Atkiv, Atkev,
			40, Defiv, Defev,
			50, SpAtkiv, SpAtkev,
			50, SpDefiv, SpDefev,
			90, Speediv, Speedev);
		}
	}
	public void Pickachu(int Species, String Name, String Ability, String Nature, String HeldItem, int Level, int Exp,
			Type Type1, Type Type2, int Status, boolean confused, boolean Gender, int CatchRate,
			Move Move1, Move Move2, Move Move3, Move Move4, 
			int HealthBase, int Hiv, int Hev, 
			int AtkBase, int Atkiv, int Atkev,
			int DefBase, int Defiv, int Defev,
			int SpAtkBase, int SpAtkiv, int SpAtkev,
			int SpDefBase, int SpDefiv, int SpDefev,
			int SpeedBase, int Speediv, int Speedev){}
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