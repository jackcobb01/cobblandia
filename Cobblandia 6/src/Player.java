
public class Player {

	//Class Variables:
	int xTileLocation;
	int yTileLocation;
	int xMapLocation;
	int yMapLocation;
	int worldLocation;
	
	String playerName;
	int playerLevel;
	int playerCobbies;
	int maximumHealth;
	int currentHealth;
	
	int determination; //For determining health
	int dexterity; //For determining block/ dodge chance
	int strength; //For determining physical damage output
	int wisdom; //For determining magical damage output
	int cautiousness; //For determining usefulness of tools
	int cunning; //For determining lock picking success
	int intelligence; //For determining success in cooking and such
	
	int combat;
	int sorcery;
	int craftmanship;
	int thievery;
	int cooking;
	
	
	//Constructor:
	public Player(int xTileLocation, int yTileLocation, int xMapLocation, int yMapLocation, int worldLocation, String playerName, int playerLevel, int playerCobbies, int maximumHealth, int currentHealth) {
		
		//Creation of Player Location:
		this.xTileLocation = xTileLocation;
		this.yTileLocation = yTileLocation;
		this.xMapLocation = xMapLocation;
		this.yMapLocation = yMapLocation;
		this.worldLocation = worldLocation;
		
		this.playerName = playerName;
		this.playerLevel = playerLevel;
		this.playerCobbies = playerCobbies;
		this.maximumHealth = maximumHealth;
		this.currentHealth = currentHealth;
		
	}
	
}
