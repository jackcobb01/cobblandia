
public class Player {

	//Class Variables:
	int xTileLocation;
	int yTileLocation;
	int xMapLocation;
	int yMapLocation;
	int worldLocation;
	
	char characterType; //k for knight
	String playerName;
	int playerLevel;
	int playerCobbies;
	int maximumHealth;
	int currentHealth;
	
	int determination; //For determining health
	int strength; //For determining stamina
	int wisdom; //For determining mana
	int combat; //For determining physical damage output
	int sorcery; //For determining magical damage output
	int dexterity; //For determining block/ dodge chance
	int craftmanship; //For determining usefulness of tools and crafting
	int intelligence; //For determining success in cooking and such
	int cunning; //For determining lock picking success
	
	//Constructor:
	public Player(int xTileLocation, int yTileLocation, int xMapLocation, int yMapLocation, int worldLocation, char characterType, String playerName, int playerLevel, int playerCobbies, int maximumHealth, int currentHealth,
			      int determination, int strength, int wisdom, int combat, int sorcery, int dexterity, int craftmanship, int intelligence, int cunning) {
		
		//Creation of Player Location:
		this.xTileLocation = xTileLocation;
		this.yTileLocation = yTileLocation;
		this.xMapLocation = xMapLocation;
		this.yMapLocation = yMapLocation;
		this.worldLocation = worldLocation;
		
		//Creation of Player Values:
		this.characterType = characterType;
		this.playerName = playerName;
		this.playerLevel = playerLevel;
		this.playerCobbies = playerCobbies;
		this.maximumHealth = maximumHealth;
		this.currentHealth = currentHealth;
		
		//Creation of Player Statistics:
		this.determination = determination;
		this.strength = strength;
		this.wisdom = wisdom;
		this.combat = combat;
		this.sorcery = sorcery;
		this.dexterity = dexterity;
		this.craftmanship = craftmanship;
		this.intelligence = intelligence;
		this.cunning = cunning;
	}
	
}
