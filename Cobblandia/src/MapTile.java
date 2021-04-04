import javax.swing.*;

public class MapTile extends JLabel {

	//Constructor:
	public MapTile(int xLocation, int yLocation) {
		
		this.setBounds(48 * xLocation + 1, 48 * yLocation + 1, 48, 48);
		
	}
	
	public void changeTileType(MapTile selectedTile, String tileType) {
		String mapTilePath = "C:\\Users\\jackr\\OneDrive\\Documents\\Java Projects\\The Cobblandia\\src\\LabelImages\\MapImages\\";
		String creatureTilePath = mapTilePath + "CreatureImages\\";
		if (tileType == "g") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "grassTile48.png"));
		}
		else if (tileType == "pf1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightForwardOneTile48.png"));
		}
		else if (tileType == "pf2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightForwardTwoTile48.png"));
		}
		else if (tileType == "pb1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightBackwardOneTile48.png"));
		}
		else if (tileType == "pb2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightBackwardTwoTile48.png"));
		}
		else if (tileType == "pl1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightLeftOneTile48.png"));
		}
		else if (tileType == "pl2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightLeftTwoTile48.png"));
		}
		else if (tileType == "pr1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightRightOneTile48.png"));
		}
		else if (tileType == "pr2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "knightRightTwoTile48.png"));
		}
		else if (tileType == "r1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rockOneTile48.png"));
		}
		else if (tileType == "r2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rockTwoTile48.png"));
		}
		else if (tileType == "r3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rockThreeTile48.png"));
		}
		else if (tileType == "r4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rockFourTile48.png"));
		}
		else if (tileType == "r21") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock2OneTile48.png"));
		}
		else if (tileType == "r22") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock2TwoTile48.png"));
		}
		else if (tileType == "r23") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock2ThreeTile48.png"));
		}
		else if (tileType == "r24") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock2FourTile48.png"));
		}
		else if (tileType == "r31") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock3OneTile48.png"));
		}
		else if (tileType == "r32") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock3TwoTile48.png"));
		}
		else if (tileType == "r33") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock3ThreeTile48.png"));
		}
		else if (tileType == "r34") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock3FourTile48.png"));
		}
		else if (tileType == "r41") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock4OneTile48.png"));
		}
		else if (tileType == "r42") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock4TwoTile48.png"));
		}
		else if (tileType == "r43") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock4ThreeTile48.png"));
		}
		else if (tileType == "r44") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "rock4FourTile48.png"));
		}
		else if (tileType == "sr1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRockOneTile48.png"));
		}
		else if (tileType == "sr2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRockTwoTile48.png"));
		}
		else if (tileType == "sr21") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRock2OneTile48.png"));
		}
		else if (tileType == "sr22") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRock2TwoTile48.png"));
		}
		else if (tileType == "sr31") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRock3OneTile48.png"));
		}
		else if (tileType == "sr32") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRock3TwoTile48.png"));
		}
		else if (tileType == "sr41") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRock4OneTile48.png"));
		}
		else if (tileType == "sr42") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallRock4TwoTile48.png"));
		}
		else if (tileType == "tr") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tinyRockTile48.png"));
		}
		else if (tileType == "tr2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tinyRock2Tile48.png"));
		}
		else if (tileType == "tr3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tinyRock3Tile48.png"));
		}
		else if (tileType == "tr4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tinyRock4Tile48.png"));
		}
		else if (tileType == "t1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "treeOneTile48.png"));
		}
		else if (tileType == "t2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "treeTwoTile48.png"));
		}
		else if (tileType == "t3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "treeThreeTile48.png"));
		}
		else if (tileType == "t4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "treeFourTile48.png"));
		}
		else if (tileType == "t21") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree2OneTile48.png"));
		}
		else if (tileType == "t22") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree2TwoTile48.png"));
		}
		else if (tileType == "t23") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree2ThreeTile48.png"));
		}
		else if (tileType == "t24") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree2FourTile48.png"));
		}
		else if (tileType == "t31") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree3OneTile48.png"));
		}
		else if (tileType == "t32") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree3TwoTile48.png"));
		}
		else if (tileType == "t33") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree3ThreeTile48.png"));
		}
		else if (tileType == "t34") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree3FourTile48.png"));
		}
		else if (tileType == "t41") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree4OneTile48.png"));
		}
		else if (tileType == "t42") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree4TwoTile48.png"));
		}
		else if (tileType == "t43") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree4ThreeTile48.png"));
		}
		else if (tileType == "t44") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "tree4FourTile48.png"));
		}
		else if (tileType == "st1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTreeOneTile48.png"));
		}
		else if (tileType == "st2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTreeTwoTile48.png"));
		}
		else if (tileType == "st21") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree2OneTile48.png"));
		}
		else if (tileType == "st22") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree2TwoTile48.png"));
		}
		else if (tileType == "st31") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree3OneTile48.png"));
		}
		else if (tileType == "st32") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree3TwoTile48.png"));
		}
		else if (tileType == "st41") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree4OneTile48.png"));
		}
		else if (tileType == "st42") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree4TwoTile48.png"));
		}
		else if (tileType == "st51") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree5OneTile48.png"));
		}
		else if (tileType == "st52") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "smallTree5TwoTile48.png"));
		}
		else if (tileType == "bu1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "bushTile48.png"));
		}
		else if (tileType == "bu2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "bush2Tile48.png"));
		}
		else if (tileType == "bu3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "bush3Tile48.png"));
		}
		else if (tileType == "bu4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "bush4Tile48.png"));
		}
		else if (tileType == "bu5") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "bush5Tile48.png"));
		}
		else if (tileType == "w") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterTile48.png"));
		}
		else if (tileType == "we1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterEdgeOneTile48.png"));
		}
		else if (tileType == "we2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterEdgeTwoTile48.png"));
		}
		else if (tileType == "we3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterEdgeThreeTile48.png"));
		}
		else if (tileType == "we4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterEdgeFourTile48.png"));
		}
		else if (tileType == "wc1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterCornerOneTile48.png"));
		}
		else if (tileType == "wc2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterCornerTwoTile48.png"));
		}
		else if (tileType == "wc3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterCornerThreeTile48.png"));
		}
		else if (tileType == "wc4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterCornerFourTile48.png"));
		}
		else if (tileType == "ws1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterStandaloneOneTile48.png"));
		}
		else if (tileType == "ws2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterStandaloneTwoTile48.png"));
		}
		else if (tileType == "ws3") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterStandaloneThreeTile48.png"));
		}
		else if (tileType == "ws4") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterStandaloneFourTile48.png"));
		}
		else if (tileType == "wl1") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterLineOneTile48.png"));
		}
		else if (tileType == "wl2") {
			selectedTile.setIcon(new ImageIcon(mapTilePath + "waterLineTwoTile48.png"));
		}
		else if (tileType == "c") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "creatureAITile48.png"));
		}
		else if (tileType == "egf1") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinForwardOneTile48.png"));
		}
		else if (tileType == "egf2") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinForwardTwoTile48.png"));
		}
		else if (tileType == "egb1") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinBackwardOneTile48.png"));
		}
		else if (tileType == "egb2") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinBackwardTwoTile48.png"));
		}
		else if (tileType == "egl1") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinLeftOneTile48.png"));
		}
		else if (tileType == "egl2") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinLeftTwoTile48.png"));
		}
		else if (tileType == "egr1") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinRightOneTile48.png"));
		}
		else if (tileType == "egr2") {
			selectedTile.setIcon(new ImageIcon(creatureTilePath + "goblinRightTwoTile48.png"));
		}
	}
	
}
