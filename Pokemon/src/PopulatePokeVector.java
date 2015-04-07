import java.io.*;
import java.util.Vector;

public class PopulatePokeVector {
	
	public Vector<Poke> pokeList;
	

	public Vector<Poke> PopulatePokeVector() throws IOException {
		
		pokeList = new Vector<Poke>();
		
		BufferedReader reader = new BufferedReader(new FileReader("PokemonList.txt"));
		
		while(reader.ready()) {
			
			String currentLine = reader.readLine();
			pokeList.add(new Poke (currentLine));
			
		}
	
		reader.close();
		return pokeList;
		
	}
}
