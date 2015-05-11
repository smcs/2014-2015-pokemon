import java.util.Vector;


public class Player {
	
	private String name;
	private Pokemon Pokemon1 = null;
	private Pokemon Pokemon2 = null;
	private Pokemon Pokemon3 = null;
	private Pokemon Pokemon4 = null;
	private Pokemon Pokemon5 = null;
	private Pokemon Pokemon6 = null;
	
	private int playerNum;
	
	private Vector<Pokemon> pokemon;
	
	public Player(int playerNumber){
		playerNum = playerNumber;
	}
	
		public void setName(String name) {
		this.name = name;
	}
		
		public void addPoke(Pokemon poke){
			pokemon.addElement(poke);
		}
		
		public Pokemon getPoke1(){
			return pokemon.get(0);
		}
		public Pokemon getPoke2(){
			return pokemon.get(1);
		}
		public Pokemon getPoke3(){
			return pokemon.get(2);
		}
		public Pokemon getPoke4(){
			return pokemon.get(3);
		}
		public Pokemon getPoke5(){
			return pokemon.get(4);
		}
		public Pokemon getPoke6(){
			return pokemon.get(5);
		}
		
}
