
public class Creature {
	
	//Class Variables:
	int xTileLocation;
	int yTileLocation;
	int xMapLocation;
	int yMapLocation;
	int worldLocation;
	
	public Creature (Universe gameUniverse, int xTileLocation, int yTileLocation, int xMapLocation, int yMapLocation, int worldLocation) {
		
		//Creation of Creature Location:
		this.xTileLocation = xTileLocation;
		this.yTileLocation = yTileLocation;
		this.xMapLocation = xMapLocation;
		this.yMapLocation = yMapLocation;
		
		//Initialization of Creature on Map:
		gameUniverse.listOfWorlds[worldLocation].worldGrid[xMapLocation][yMapLocation].mapGrid[xTileLocation][yTileLocation] = "egf1";
		
	}
	
}
