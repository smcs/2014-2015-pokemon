import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class Poke {

	private String name;
	private static Vector<Poke> pokeList;
	
	public Poke(String name){
		
		this.name = name;

	}
	
	public String toString(){
		
		return name;
	}
	
	public static Vector<Poke> PopulatePokeVector() {
		/* only load the pokelist if its currently empty */
		if (pokeList == null) {
			pokeList = new Vector<Poke>();
			
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader("PokemonList.txt"));
				while(reader.ready()) {
					
					String currentLine = reader.readLine();
					pokeList.add(new Poke (currentLine));
					
					
				}
				reader.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
			
			
		}
		return pokeList;
		
	}

}
