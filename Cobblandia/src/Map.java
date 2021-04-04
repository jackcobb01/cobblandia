import java.util.Random;

public class Map {

	//Class Variables:
	String[][] mapGrid = new String[18][18];
	int chanceOfWater;
	int chanceOf2x2Rocks;
	int chanceOf2x1Rocks;
	int chanceOf1x1Rocks;
	int chanceOf2x2Trees;
	int chanceOf1x2Trees;
	int chanceOfBushes;
	
	int creatureCount = 0;
	
	//Class Objects:
	Random randomObject = new Random();
	
	//Constructor:
	public Map(String typeOfMap, int xMapLocation, int yMapLocation) {
		
		if (typeOfMap.equals("lake")) {
			this.chanceOfWater = 10;
			this.chanceOf2x2Rocks = 300;
			this.chanceOf2x1Rocks = 200;
			this.chanceOf1x1Rocks = 133;
			this.chanceOf2x2Trees = 100;
			this.chanceOf1x2Trees = 67;
			this.chanceOfBushes = 33;
		}
		else if (typeOfMap.equals("forest")) {
			this.chanceOfWater = 289;
			this.chanceOf2x2Rocks = 300;
			this.chanceOf2x1Rocks = 200;
			this.chanceOf1x1Rocks = 133;
			this.chanceOf2x2Trees = 13;
			this.chanceOf1x2Trees = 8;
			this.chanceOfBushes = 8;
		}
		else if (typeOfMap.equals("outcrops")) {
			this.chanceOfWater = 289;
			this.chanceOf2x2Rocks = 13;
			this.chanceOf2x1Rocks = 8;
			this.chanceOf1x1Rocks = 8;
			this.chanceOf2x2Trees = 100;
			this.chanceOf1x2Trees = 67;
			this.chanceOfBushes = 33;
		}
		else {
			this.chanceOfWater = 289;
			this.chanceOf2x2Rocks = 300;
			this.chanceOf2x1Rocks = 200;
			this.chanceOf1x1Rocks = 133;
			this.chanceOf2x2Trees = 100;
			this.chanceOf1x2Trees = 67;
			this.chanceOfBushes = 33;
		}
		
		//Adds in Grass:
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 18; j++) {
				this.mapGrid[i][j] = "g";
			}
		}
		
		//Adds in Irremovable Grass for Player Start:
		if (xMapLocation == 0 && yMapLocation == 0) {
			this.mapGrid[0][0] = "gi";
		}
		
		//Adds in Water:
		for (int i = 2; i < 16; i++) {
			for (int j = 2; j < 16; j++) {
				if (this.mapGrid[i][j] == "g" && this.randomObject.nextInt(this.chanceOfWater) == 0) {
					waterMaker(this.mapGrid, i, j, 1, this.randomObject);
				}
			}
		}
		
		//Naturalization of Water Bodies:
		for (int i = 1; i < 17; i++) {
			for (int j = 1; j < 17; j++) {
				if (this.mapGrid[i][j] == "w") {
					//If edge piece:
					if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "we1";
					}
					else if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "we2";
					}
					else if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "we3";
					}
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "we4";
					}
					//If corner piece:
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "wc1";
					}
					else if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "wc2";
					}
					else if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "wc3";
					}
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "wc4";
					}
					//If standalone piece:
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "ws1";
					}
					else if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "ws2";
					}
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "ws3";
					}
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "ws4";
					}
					//If Line Piece:
					else if (this.mapGrid[i - 1][j].charAt(0) == 'w' && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j].charAt(0) == 'w' && this.mapGrid[i][j - 1] == "g") {
						this.mapGrid[i][j] = "wl1";
					}
					else if (this.mapGrid[i - 1][j] == "g" && this.mapGrid[i][j + 1].charAt(0) == 'w' && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j - 1].charAt(0) == 'w') {
						this.mapGrid[i][j] = "wl2";
					}
					
				}
			}
		}
		
		//Adds in 2x2 Rocks:
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				if (this.mapGrid[i][j] == "g" && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j + 1] == "g" && this.randomObject.nextInt(this.chanceOf2x2Rocks) == 0) {
					int typeOfRock = this.randomObject.nextInt(4);
					if (typeOfRock == 0) {
						this.mapGrid[i][j] = "r1";
						this.mapGrid[i + 1][j] = "r2";
						this.mapGrid[i][j + 1] = "r3";
						this.mapGrid[i + 1][j + 1] = "r4";
					}
					else if (typeOfRock == 1) {
						this.mapGrid[i][j] = "r21";
						this.mapGrid[i + 1][j] = "r22";
						this.mapGrid[i][j + 1] = "r23";
						this.mapGrid[i + 1][j + 1] = "r24";
					}
					else if (typeOfRock == 2) {
						this.mapGrid[i][j] = "r31";
						this.mapGrid[i + 1][j] = "r32";
						this.mapGrid[i][j + 1] = "r33";
						this.mapGrid[i + 1][j + 1] = "r34";
					}
					else {
						this.mapGrid[i][j] = "r41";
						this.mapGrid[i + 1][j] = "r42";
						this.mapGrid[i][j + 1] = "r43";
						this.mapGrid[i + 1][j + 1] = "r44";
					}
				}
			}
		}
		
		//Adds in 2x1 Rocks:
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 18; j++) {
				if (this.mapGrid[i][j] == "g" && this.mapGrid[i + 1][j] == "g" && this.randomObject.nextInt(this.chanceOf2x1Rocks) == 0) {
					int typeOfSmallRock = this.randomObject.nextInt(4);
					if (typeOfSmallRock == 0) {
						this.mapGrid[i][j] = "sr1";
						this.mapGrid[i + 1][j] = "sr2";
					}
					else if (typeOfSmallRock == 1) {
						this.mapGrid[i][j] = "sr21";
						this.mapGrid[i + 1][j] = "sr22";
					}
					else if (typeOfSmallRock == 2) {
						this.mapGrid[i][j] = "sr31";
						this.mapGrid[i + 1][j] = "sr32";
					}
					else {
						this.mapGrid[i][j] = "sr41";
						this.mapGrid[i + 1][j] = "sr42";
					}
				}
			}
		}
		
		//Adds in 1x1 Rocks:
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 18; j++) {
				if (this.mapGrid[i][j] == "g" && this.randomObject.nextInt(this.chanceOf1x1Rocks) == 0) {
					int typeOfTinyRock = this.randomObject.nextInt(4);
					if (typeOfTinyRock == 0) {
						this.mapGrid[i][j] = "tr";
					}
					else if (typeOfTinyRock == 1) {
						this.mapGrid[i][j] = "tr2";
					}
					else if (typeOfTinyRock == 2) {
						this.mapGrid[i][j] = "tr3";
					}
					else {
						this.mapGrid[i][j] = "tr4";
					}
				}
			}
		}
		
		//Adds in 2x2 Trees:
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				if (this.mapGrid[i][j] == "g" && this.mapGrid[i + 1][j] == "g" && this.mapGrid[i][j + 1] == "g" && this.mapGrid[i + 1][j + 1] == "g" && this.randomObject.nextInt(this.chanceOf2x2Trees) == 0) {
					int typeOfTree = this.randomObject.nextInt(4);
					if (typeOfTree == 0) {	
						this.mapGrid[i][j] = "t1";
						this.mapGrid[i + 1][j] = "t2";
						this.mapGrid[i][j + 1] = "t3";
						this.mapGrid[i + 1][j + 1] = "t4";
					}
					else if (typeOfTree == 1) {
						this.mapGrid[i][j] = "t21";
						this.mapGrid[i + 1][j] = "t22";
						this.mapGrid[i][j + 1] = "t23";
						this.mapGrid[i + 1][j + 1] = "t24";
					}
					else if (typeOfTree == 2) {
						this.mapGrid[i][j] = "t31";
						this.mapGrid[i + 1][j] = "t32";
						this.mapGrid[i][j + 1] = "t33";
						this.mapGrid[i + 1][j + 1] = "t34";
					}
					else {
						this.mapGrid[i][j] = "t41";
						this.mapGrid[i + 1][j] = "t42";
						this.mapGrid[i][j + 1] = "t43";
						this.mapGrid[i + 1][j + 1] = "t44";
					}
				}
			}
		}
		
		//Adds in 1x2 Trees:
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 17; j++) {
				if (this.mapGrid[i][j] == "g" && this.mapGrid[i][j + 1] == "g" && this.randomObject.nextInt(this.chanceOf1x2Trees) == 0) {
					int typeOfSmallTree = this.randomObject.nextInt(5);
					if (typeOfSmallTree == 0) {
						this.mapGrid[i][j] = "st1";
						this.mapGrid[i][j + 1] = "st2";
					}
					else if (typeOfSmallTree == 1) {
						this.mapGrid[i][j] = "st21";
						this.mapGrid[i][j + 1] = "st22";
					}
					else if (typeOfSmallTree == 2){
						this.mapGrid[i][j] = "st31";
						this.mapGrid[i][j + 1] = "st32";
					}
					else if (typeOfSmallTree == 3){
						this.mapGrid[i][j] = "st41";
						this.mapGrid[i][j + 1] = "st42";
					}
					else {
						this.mapGrid[i][j] = "st51";
						this.mapGrid[i][j + 1] = "st52";
					}
				}
			}
		}
				
		//Adds in Bushes
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 18; j++) {
				if (this.mapGrid[i][j] == "g" && this.randomObject.nextInt(this.chanceOfBushes) == 0) {
					int typeOfBush = this.randomObject.nextInt(5);
					if (typeOfBush == 0) {
						this.mapGrid[i][j] = "bu1";
					}
					else if (typeOfBush == 1) {
						this.mapGrid[i][j] = "bu2";
					}
					else if (typeOfBush == 2) {
						this.mapGrid[i][j] = "bu3";
					}
					else if (typeOfBush == 3) {
						this.mapGrid[i][j] = "bu4";
					}
					else {
						this.mapGrid[i][j] = "bu5";
					}
				}
			}
		}
			
		
	}
	
	//Water Randomizer Method:
	public static int waterMaker(String[][] mapGrid, int i, int j, int counter, Random randomObject) {
		mapGrid[i][j] = "w";
		if (1 < i && i < 16 && 1 < j && j < 16 && counter < 20 && randomObject.nextInt(0 + counter) == 0) {
			mapGrid[i + 1][j] = "w";
			return 1 + waterMaker(mapGrid, i + 1, j, counter + 1, randomObject) + waterMaker(mapGrid, i, j + 1, counter + 1, randomObject) + waterMaker(mapGrid, i - 1, j, counter + 1, randomObject) + waterMaker(mapGrid, i, j - 1, counter + 1, randomObject);
		}
		else {
			return 1;
		}
	}
	
}
