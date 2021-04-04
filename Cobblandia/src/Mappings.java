import java.util.ArrayList;

public class Mappings {

	//Class Variables:
	ArrayList<ArrayList<Point>> listMappings = new ArrayList<ArrayList<Point>>();
	int xFloor;
	int xCeiling;
	int yFloor;
	int yCeiling;
	
	//Constructor:
	public Mappings(Map theMap, Point startPosn, int distanceBoundary) {
		
		this.xFloor = startPosn.xLocation - distanceBoundary;
		if (this.xFloor < 0) {
			this.xFloor = 0;
		}
		this.xCeiling = startPosn.xLocation + distanceBoundary;
		if (this.xCeiling > 17) {
			this.xCeiling = 17;
		}
		this.yFloor = startPosn.yLocation - distanceBoundary;
		if (this.yFloor < 0) {
			this.yFloor = 0;
		}
		this.yCeiling = startPosn.yLocation + distanceBoundary;
		if (this.yCeiling > 17) {
			this.yCeiling = 17;
		}
		createMappings(theMap, startPosn, startPosn, new ArrayList<Point>(), this.xFloor, this.xCeiling, this.yFloor, this.yCeiling);	
	}
	/*
	//Initialization of Path List Method:
	public void createMappings(Map theMap, Point startPosn, Point currentPosn, ArrayList<Point> mapping, int xFloor, int xCeiling, int yFloor, int yCeiling) {
		//if (!(startPosn.pointEquals(currentPosn)) && !(currentPosn.typeOfTile.equals("g"))) {
		//	this.listMappings.add(mapping);		
		//}
		//else {
			mapping.add(currentPosn);
			if (currentPosn.xLocation == 0 || currentPosn.xLocation == xFloor) {
				this.listMappings.add(mapping);
			}
			else if (!(pointInList(mapping, new Point(currentPosn.xLocation - 1, currentPosn.yLocation, theMap.mapGrid[currentPosn.xLocation - 1][currentPosn.yLocation])))) {
				createMappings(theMap, startPosn, new Point(currentPosn.xLocation - 1, currentPosn.yLocation, theMap.mapGrid[currentPosn.xLocation - 1][currentPosn.yLocation]), mapping, xFloor, xCeiling, yFloor, yCeiling);
			}
			if (currentPosn.xLocation == 17 || currentPosn.xLocation == xCeiling) {
				this.listMappings.add(mapping);
			}
			else if (!(pointInList(mapping, new Point(currentPosn.xLocation + 1, currentPosn.yLocation, theMap.mapGrid[currentPosn.xLocation + 1][currentPosn.yLocation])))) {
				createMappings(theMap, startPosn, new Point(currentPosn.xLocation + 1, currentPosn.yLocation, theMap.mapGrid[currentPosn.xLocation + 1][currentPosn.yLocation]), mapping, xFloor, xCeiling, yFloor, yCeiling);
			}
			if (currentPosn.yLocation == 0 || currentPosn.yLocation == yFloor) {
				this.listMappings.add(mapping);
			}
			else if (!(pointInList(mapping, new Point(currentPosn.xLocation, currentPosn.yLocation - 1, theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation - 1])))) {
				createMappings(theMap, startPosn, new Point(currentPosn.xLocation, currentPosn.yLocation - 1, theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation - 1]), mapping, xFloor, xCeiling, yFloor, yCeiling);
			}
			if (currentPosn.yLocation == 17 || currentPosn.yLocation == yCeiling) {
				this.listMappings.add(mapping);
			}
			else if (!(pointInList(mapping, new Point(currentPosn.xLocation, currentPosn.yLocation + 1, theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation + 1])))) {
				createMappings(theMap, startPosn, new Point(currentPosn.xLocation, currentPosn.yLocation + 1, theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation + 1]), mapping, xFloor, xCeiling, yFloor, yCeiling);
			}
		//}
	}*/
	
	public void createMappings(Map theMap, Point startPosn, Point currentPosn, ArrayList<Point> mapping, int xFloor, int xCeiling, int yFloor, int yCeiling) {
		
		mapping.add(currentPosn);
		this.listMappings.add(mapping);
		if (currentPosn.xLocation > xFloor && (theMap.mapGrid[currentPosn.xLocation - 1][currentPosn.yLocation].equals("g") || theMap.mapGrid[currentPosn.xLocation - 1][currentPosn.yLocation].charAt(0) == 'p') && !(pointInList(mapping, new Point(currentPosn.xLocation - 1, currentPosn.yLocation, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation - 1, currentPosn.yLocation, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		if (currentPosn.xLocation < xCeiling && (theMap.mapGrid[currentPosn.xLocation + 1][currentPosn.yLocation].equals("g") || theMap.mapGrid[currentPosn.xLocation + 1][currentPosn.yLocation].charAt(0) == 'p') && !(pointInList(mapping, new Point(currentPosn.xLocation + 1, currentPosn.yLocation, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation + 1, currentPosn.yLocation, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		if (currentPosn.yLocation > yFloor && (theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation - 1].equals("g") || theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation - 1].charAt(0) == 'p') && !(pointInList(mapping, new Point(currentPosn.xLocation, currentPosn.yLocation - 1, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation, currentPosn.yLocation - 1, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		if (currentPosn.yLocation < yCeiling && (theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation + 1].equals("g") || theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation + 1].charAt(0) == 'p') && !(pointInList(mapping, new Point(currentPosn.xLocation, currentPosn.yLocation + 1, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation, currentPosn.yLocation + 1, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		
		/*
		mapping.add(currentPosn);
		this.listMappings.add(mapping);
		if (currentPosn.xLocation > xFloor && theMap.mapGrid[currentPosn.xLocation - 1][currentPosn.yLocation].equals("g") && !(pointInList(mapping, new Point(currentPosn.xLocation - 1, currentPosn.yLocation, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation - 1, currentPosn.yLocation, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		if (currentPosn.xLocation < xCeiling && theMap.mapGrid[currentPosn.xLocation + 1][currentPosn.yLocation].equals("g") && !(pointInList(mapping, new Point(currentPosn.xLocation + 1, currentPosn.yLocation, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation + 1, currentPosn.yLocation, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		if (currentPosn.yLocation > yFloor && theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation - 1].equals("g") && !(pointInList(mapping, new Point(currentPosn.xLocation, currentPosn.yLocation - 1, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation, currentPosn.yLocation - 1, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		if (currentPosn.yLocation < yCeiling && theMap.mapGrid[currentPosn.xLocation][currentPosn.yLocation + 1].equals("g") && !(pointInList(mapping, new Point(currentPosn.xLocation, currentPosn.yLocation + 1, "g")))) {
			createMappings(theMap, startPosn, new Point(currentPosn.xLocation, currentPosn.yLocation + 1, "g"), copyPath(mapping), xFloor, xCeiling, yFloor, yCeiling);
		}
		*/
	}
	
	//Duplicate ArrayList Method:
	public ArrayList<Point> copyPath(ArrayList<Point> oldList) {
		ArrayList<Point> newList = new ArrayList<Point>();
		for (int i = 0; i < oldList.size(); i++) {
			newList.add(oldList.get(i));
		}
		return newList;
	}
	
	//Point in List Method:
	public static boolean pointInList(ArrayList<Point> list, Point p) {
		boolean isIn = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).pointEquals(p)) {
				isIn = true;
			}
		}
		return isIn;
	}
	
	//Creature Has an Available Path to Player Method:
	public boolean hasAvailablePath(Player thePlayer) {
		boolean hasAvailablePath = false;
		for (int i = 0; i < this.listMappings.size(); i++) {
			if ((this.listMappings.get(i).get(this.listMappings.get(i).size() - 1).pointEquals(new Point(thePlayer.xTileLocation, thePlayer.yTileLocation, "p")))) {
				hasAvailablePath = true;
			}
		}
		return hasAvailablePath;
	}
	
	//Optimal Path for Creature to Take Method:
	public ArrayList<Point> optimalPath(Player thePlayer, int indexForReturn, int currentPathSize) {
		boolean firstPathTaken = false;
		for (int i = 0; i < this.listMappings.size(); i++) {
			if (firstPathTaken == false && this.listMappings.get(i).get(this.listMappings.get(i).size() - 1).pointEquals(new Point(thePlayer.xTileLocation, thePlayer.yTileLocation, "p"))) {
				indexForReturn = i;
				currentPathSize = this.listMappings.get(i).size();
			}
			else if (this.listMappings.get(i).get(this.listMappings.get(i).size() - 1).pointEquals(new Point(thePlayer.xTileLocation, thePlayer.yTileLocation, "p")) && this.listMappings.get(i).size() < currentPathSize) {
				indexForReturn = i;
				currentPathSize = this.listMappings.get(i).size();
			}
		}
		return this.listMappings.get(indexForReturn);
	}
	
}
