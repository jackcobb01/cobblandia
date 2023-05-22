import java.net.URL;
import javax.swing.*;

public class MapTile extends JLabel {

	//Constructor:
	public MapTile(int xLocation, int yLocation) {
		
		this.setBounds(48 * xLocation + 1, 48 * yLocation + 1, 48, 48);
		
	}
	
	public URL getMapTilePath(String imageName) {
		String imageURL = "/LabelImages/MapImages/" + imageName;
		return MapTile.class.getResource(imageURL);
	}
	
	public URL getCreatureTilePath(String imageName) {
		String imageURL = "/LabelImages/MapImages/CreatureImages/" + imageName;
		return MapTile.class.getResource(imageURL);
	}
	
	public void changeTileType(MapTile selectedTile, String tileType) {
		String mapTilePath = "C:\\Users\\jackr\\OneDrive\\Documents\\Java Projects\\The Cobblandia\\src\\LabelImages\\MapImages\\";
		String creatureTilePath = mapTilePath + "CreatureImages\\";
		if (tileType == "g") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("grassTile48.png")));
		}
		else if (tileType == "pf1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightForwardOneTile48.png")));
		}
		else if (tileType == "pf2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightForwardTwoTile48.png")));
		}
		else if (tileType == "pb1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightBackwardOneTile48.png")));
		}
		else if (tileType == "pb2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightBackwardTwoTile48.png")));
		}
		else if (tileType == "pl1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightLeftOneTile48.png")));
		}
		else if (tileType == "pl2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightLeftTwoTile48.png")));
		}
		else if (tileType == "pr1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightRightOneTile48.png")));
		}
		else if (tileType == "pr2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("knightRightTwoTile48.png")));
		}
		else if (tileType == "r1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rockOneTile48.png")));
		}
		else if (tileType == "r2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rockTwoTile48.png")));
		}
		else if (tileType == "r3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rockThreeTile48.png")));
		}
		else if (tileType == "r4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rockFourTile48.png")));
		}
		else if (tileType == "r21") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock2OneTile48.png")));
		}
		else if (tileType == "r22") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock2TwoTile48.png")));
		}
		else if (tileType == "r23") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock2ThreeTile48.png")));
		}
		else if (tileType == "r24") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock2FourTile48.png")));
		}
		else if (tileType == "r31") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock3OneTile48.png")));
		}
		else if (tileType == "r32") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock3TwoTile48.png")));
		}
		else if (tileType == "r33") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock3ThreeTile48.png")));
		}
		else if (tileType == "r34") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock3FourTile48.png")));
		}
		else if (tileType == "r41") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock4OneTile48.png")));
		}
		else if (tileType == "r42") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock4TwoTile48.png")));
		}
		else if (tileType == "r43") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock4ThreeTile48.png")));
		}
		else if (tileType == "r44") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("rock4FourTile48.png")));
		}
		else if (tileType == "sr1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRockOneTile48.png")));
		}
		else if (tileType == "sr2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRockTwoTile48.png")));
		}
		else if (tileType == "sr21") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRock2OneTile48.png")));
		}
		else if (tileType == "sr22") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRock2TwoTile48.png")));
		}
		else if (tileType == "sr31") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRock3OneTile48.png")));
		}
		else if (tileType == "sr32") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRock3TwoTile48.png")));
		}
		else if (tileType == "sr41") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRock4OneTile48.png")));
		}
		else if (tileType == "sr42") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallRock4TwoTile48.png")));
		}
		else if (tileType == "tr") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tinyRockTile48.png")));
		}
		else if (tileType == "tr2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tinyRock2Tile48.png")));
		}
		else if (tileType == "tr3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tinyRock3Tile48.png")));
		}
		else if (tileType == "tr4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tinyRock4Tile48.png")));
		}
		else if (tileType == "t1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("treeOneTile48.png")));
		}
		else if (tileType == "t2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("treeTwoTile48.png")));
		}
		else if (tileType == "t3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("treeThreeTile48.png")));
		}
		else if (tileType == "t4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("treeFourTile48.png")));
		}
		else if (tileType == "t21") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree2OneTile48.png")));
		}
		else if (tileType == "t22") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree2TwoTile48.png")));
		}
		else if (tileType == "t23") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree2ThreeTile48.png")));
		}
		else if (tileType == "t24") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree2FourTile48.png")));
		}
		else if (tileType == "t31") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree3OneTile48.png")));
		}
		else if (tileType == "t32") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree3TwoTile48.png")));
		}
		else if (tileType == "t33") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree3ThreeTile48.png")));
		}
		else if (tileType == "t34") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree3FourTile48.png")));
		}
		else if (tileType == "t41") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree4OneTile48.png")));
		}
		else if (tileType == "t42") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree4TwoTile48.png")));
		}
		else if (tileType == "t43") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree4ThreeTile48.png")));
		}
		else if (tileType == "t44") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("tree4FourTile48.png")));
		}
		else if (tileType == "st1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTreeOneTile48.png")));
		}
		else if (tileType == "st2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTreeTwoTile48.png")));
		}
		else if (tileType == "st21") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree2OneTile48.png")));
		}
		else if (tileType == "st22") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree2TwoTile48.png")));
		}
		else if (tileType == "st31") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree3OneTile48.png")));
		}
		else if (tileType == "st32") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree3TwoTile48.png")));
		}
		else if (tileType == "st41") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree4OneTile48.png")));
		}
		else if (tileType == "st42") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree4TwoTile48.png")));
		}
		else if (tileType == "st51") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree5OneTile48.png")));
		}
		else if (tileType == "st52") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("smallTree5TwoTile48.png")));
		}
		else if (tileType == "bu1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("bushTile48.png")));
		}
		else if (tileType == "bu2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("bush2Tile48.png")));
		}
		else if (tileType == "bu3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("bush3Tile48.png")));
		}
		else if (tileType == "bu4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("bush4Tile48.png")));
		}
		else if (tileType == "bu5") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("bush5Tile48.png")));
		}
		else if (tileType == "w") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterTile48.png")));
		}
		else if (tileType == "we1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterEdgeOneTile48.png")));
		}
		else if (tileType == "we2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterEdgeTwoTile48.png")));
		}
		else if (tileType == "we3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterEdgeThreeTile48.png")));
		}
		else if (tileType == "we4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterEdgeFourTile48.png")));
		}
		else if (tileType == "wc1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterCornerOneTile48.png")));
		}
		else if (tileType == "wc2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterCornerTwoTile48.png")));
		}
		else if (tileType == "wc3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterCornerThreeTile48.png")));
		}
		else if (tileType == "wc4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterCornerFourTile48.png")));
		}
		else if (tileType == "ws1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterStandaloneOneTile48.png")));
		}
		else if (tileType == "ws2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterStandaloneTwoTile48.png")));
		}
		else if (tileType == "ws3") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterStandaloneThreeTile48.png")));
		}
		else if (tileType == "ws4") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterStandaloneFourTile48.png")));
		}
		else if (tileType == "wl1") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterLineOneTile48.png")));
		}
		else if (tileType == "wl2") {
			selectedTile.setIcon(new ImageIcon(getMapTilePath("waterLineTwoTile48.png")));
		}
		else if (tileType == "c") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("creatureAITile48.png")));
		}
		else if (tileType == "egf1") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinForwardOneTile48.png")));
		}
		else if (tileType == "egf2") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinForwardTwoTile48.png")));
		}
		else if (tileType == "egb1") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinBackwardOneTile48.png")));
		}
		else if (tileType == "egb2") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinBackwardTwoTile48.png")));
		}
		else if (tileType == "egl1") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinLeftOneTile48.png")));
		}
		else if (tileType == "egl2") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinLeftTwoTile48.png")));
		}
		else if (tileType == "egr1") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinRightOneTile48.png")));
		}
		else if (tileType == "egr2") {
			selectedTile.setIcon(new ImageIcon(getCreatureTilePath("goblinRightTwoTile48.png")));
		}
	}
	
}
