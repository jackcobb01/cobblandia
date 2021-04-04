import java.util.Random;

public class World {

	//Class Variables:
	Map[][] worldGrid = new Map[24][24];
	int typeOfBiome;
	
	//Class Objects:
	Random randomObject = new Random();
	
	//Constructor:
	public World() {
		
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 24; j++) {
				this.typeOfBiome = this.randomObject.nextInt(24);
				if (this.typeOfBiome == 0) {
					this.worldGrid[i][j] = new Map("lake", i, j);
				}
				else if (this.typeOfBiome == 1) {
					this.worldGrid[i][j] = new Map("forest", i, j);
				}
				else if (this.typeOfBiome == 2) {
					this.worldGrid[i][j] = new Map("outcrops", i, j);
				}
				else {
					this.worldGrid[i][j] = new Map("normal", i, j);
				}
			}
		}
		
	}
	
}
