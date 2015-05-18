import java.util.Vector;


public class Player {
	
	private String name;
	
	private int playerNum;
	
	private Vector<Pokemon> pokemon;
	
	public Player(int playerNumber){
		playerNum = playerNumber;
		
		pokemon = new Vector<Pokemon>();
		
		for (int i = 0; i < 6; i++) {
			pokemon.add(null);
		}		
	}
	
		public void setName(String name) {
		this.name = name;
	}
		
		public void addPoke(int index, Pokemon poke){
			pokemon.set(index, poke);
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
