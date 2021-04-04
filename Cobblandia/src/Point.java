import java.util.ArrayList;

public class Point {
	
	//Class Variables:
	int xLocation;
	int yLocation;
	String typeOfTile;
	
	//Constructor:
	public Point (int x, int y, String type) {
		this.xLocation = x;
		this.yLocation = y;
		this.typeOfTile = type;
	}
	
	//Equality Method (excludes the type of tile);
	public boolean pointEquals (Point p) {
		return (this.xLocation == p.xLocation) && (this.yLocation == p.yLocation);
	}
	
	//Point in List Method:
	public boolean pointInList(ArrayList<Point> list) {
		boolean isIn = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).pointEquals(this)) {
				isIn = true;
			}
		}
		return isIn;
	}
	
}
