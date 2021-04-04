
public class Universe {

	//Class Variables:
	World[] listOfWorlds = new World[8];
	
	//Constructor:
	public Universe() {
		
		for (int i = 0; i < 8; i++) {
			this.listOfWorlds[i] = new World();
		}
		
	}
	
}
