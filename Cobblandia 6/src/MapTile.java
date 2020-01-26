import javax.swing.*;

public class MapTile extends JLabel {

	//Constructor:
	public MapTile(int xLocation, int yLocation) {
		
		this.setBounds(48 * xLocation + 1, 48 * yLocation + 1, 48, 48);
		
	}
	
	public static void changeTileType(MapTile selectedTile, String tileType) {
		
		if (tileType == "g") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\grassTile48.png"));
		}
		else if (tileType == "pf1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightForwardOneTile48.png"));
		}
		else if (tileType == "pf2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightForwardTwoTile48.png"));
		}
		else if (tileType == "pb1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightBackwardOneTile48.png"));
		}
		else if (tileType == "pb2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightBackwardTwoTile48.png"));
		}
		else if (tileType == "pl1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightLeftOneTile48.png"));
		}
		else if (tileType == "pl2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightLeftTwoTile48.png"));
		}
		else if (tileType == "pr1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightRightOneTile48.png"));
		}
		else if (tileType == "pr2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\knightRightTwoTile48.png"));
		}
		else if (tileType == "r1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rockOneTile48.png"));
		}
		else if (tileType == "r2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rockTwoTile48.png"));
		}
		else if (tileType == "r3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rockThreeTile48.png"));
		}
		else if (tileType == "r4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rockFourTile48.png"));
		}
		else if (tileType == "r21") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock2OneTile48.png"));
		}
		else if (tileType == "r22") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock2TwoTile48.png"));
		}
		else if (tileType == "r23") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock2ThreeTile48.png"));
		}
		else if (tileType == "r24") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock2FourTile48.png"));
		}
		else if (tileType == "r31") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock3OneTile48.png"));
		}
		else if (tileType == "r32") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock3TwoTile48.png"));
		}
		else if (tileType == "r33") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock3ThreeTile48.png"));
		}
		else if (tileType == "r34") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock3FourTile48.png"));
		}
		else if (tileType == "r41") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock4OneTile48.png"));
		}
		else if (tileType == "r42") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock4TwoTile48.png"));
		}
		else if (tileType == "r43") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock4ThreeTile48.png"));
		}
		else if (tileType == "r44") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\rock4FourTile48.png"));
		}
		else if (tileType == "sr1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRockOneTile48.png"));
		}
		else if (tileType == "sr2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRockTwoTile48.png"));
		}
		else if (tileType == "sr21") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRock2OneTile48.png"));
		}
		else if (tileType == "sr22") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRock2TwoTile48.png"));
		}
		else if (tileType == "sr31") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRock3OneTile48.png"));
		}
		else if (tileType == "sr32") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRock3TwoTile48.png"));
		}
		else if (tileType == "sr41") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRock4OneTile48.png"));
		}
		else if (tileType == "sr42") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallRock4TwoTile48.png"));
		}
		else if (tileType == "tr") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tinyRockTile48.png"));
		}
		else if (tileType == "tr2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tinyRock2Tile48.png"));
		}
		else if (tileType == "tr3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tinyRock3Tile48.png"));
		}
		else if (tileType == "tr4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tinyRock4Tile48.png"));
		}
		else if (tileType == "t1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\treeOneTile48.png"));
		}
		else if (tileType == "t2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\treeTwoTile48.png"));
		}
		else if (tileType == "t3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\treeThreeTile48.png"));
		}
		else if (tileType == "t4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\treeFourTile48.png"));
		}
		else if (tileType == "t21") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree2OneTile48.png"));
		}
		else if (tileType == "t22") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree2TwoTile48.png"));
		}
		else if (tileType == "t23") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree2ThreeTile48.png"));
		}
		else if (tileType == "t24") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree2FourTile48.png"));
		}
		else if (tileType == "t31") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree3OneTile48.png"));
		}
		else if (tileType == "t32") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree3TwoTile48.png"));
		}
		else if (tileType == "t33") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree3ThreeTile48.png"));
		}
		else if (tileType == "t34") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree3FourTile48.png"));
		}
		else if (tileType == "t41") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree4OneTile48.png"));
		}
		else if (tileType == "t42") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree4TwoTile48.png"));
		}
		else if (tileType == "t43") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree4ThreeTile48.png"));
		}
		else if (tileType == "t44") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\tree4FourTile48.png"));
		}
		else if (tileType == "st1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTreeOneTile48.png"));
		}
		else if (tileType == "st2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTreeTwoTile48.png"));
		}
		else if (tileType == "st21") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree2OneTile48.png"));
		}
		else if (tileType == "st22") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree2TwoTile48.png"));
		}
		else if (tileType == "st31") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree3OneTile48.png"));
		}
		else if (tileType == "st32") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree3TwoTile48.png"));
		}
		else if (tileType == "st41") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree4OneTile48.png"));
		}
		else if (tileType == "st42") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree4TwoTile48.png"));
		}
		else if (tileType == "st51") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree5OneTile48.png"));
		}
		else if (tileType == "st52") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\smallTree5TwoTile48.png"));
		}
		else if (tileType == "bu1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\bushTile48.png"));
		}
		else if (tileType == "bu2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\bush2Tile48.png"));
		}
		else if (tileType == "bu3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\bush3Tile48.png"));
		}
		else if (tileType == "bu4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\bush4Tile48.png"));
		}
		else if (tileType == "bu5") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\bush5Tile48.png"));
		}
		else if (tileType == "w") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterTile48.png"));
		}
		else if (tileType == "we1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterEdgeOneTile48.png"));
		}
		else if (tileType == "we2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterEdgeTwoTile48.png"));
		}
		else if (tileType == "we3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterEdgeThreeTile48.png"));
		}
		else if (tileType == "we4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterEdgeFourTile48.png"));
		}
		else if (tileType == "wc1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterCornerOneTile48.png"));
		}
		else if (tileType == "wc2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterCornerTwoTile48.png"));
		}
		else if (tileType == "wc3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterCornerThreeTile48.png"));
		}
		else if (tileType == "wc4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterCornerFourTile48.png"));
		}
		else if (tileType == "ws1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterStandaloneOneTile48.png"));
		}
		else if (tileType == "ws2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterStandaloneTwoTile48.png"));
		}
		else if (tileType == "ws3") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterStandaloneThreeTile48.png"));
		}
		else if (tileType == "ws4") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterStandaloneFourTile48.png"));
		}
		else if (tileType == "wl1") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterLineOneTile48.png"));
		}
		else if (tileType == "wl2") {
			selectedTile.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\Java Projects\\Cobblandia 6\\src\\LabelImages\\MapImages\\waterLineTwoTile48.png"));
		}
		
	}
	
}
