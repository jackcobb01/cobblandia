import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MapFrame {
	
	//Class Variables:
	JFrame frame;
	JPanel panel;
	Universe gameUniverse;
	Player gamePlayer;
	
	JLabel sideBarTitle;
	JLabel sideBarName;
	JProgressBar healthBar;
	JLabel sideBarLevel;
	JLabel sideBarCobbies;
	JLabel sideBarLocation;
	JButton sideBarPlayer;
	JButton sideBarInventory;
	JButton sideBarJournal;
	JButton sideBarHelp;
	
	//Class Colours:
	Color myBrown = new Color(106, 66, 45);
	Color myBeige = new Color(239, 209, 157);
	Color myDarkGreen = new Color(63, 125, 0);
	Color myDarkRed = new Color(142, 0 ,0);
	
	//Initialization of Map Grid:
	MapTile[][] mapTileGrid = new MapTile[18][18];
	
	//Constructor:
	public MapFrame() {
		
		//Creation of Universe:
		this.gameUniverse = new Universe();
				
		//Creation of Player:
		this.gamePlayer = new Player(0,0,0,0,0, "Jack Cobb", 1, 0, 100, 50);
		this.gameUniverse.listOfWorlds[this.gamePlayer.worldLocation].worldGrid[this.gamePlayer.xMapLocation][this.gamePlayer.yMapLocation].mapGrid[this.gamePlayer.xTileLocation][this.gamePlayer.yTileLocation] = "p";		
		
		//Creation of Key Listener:
		ListenForKeys lForKeys = new ListenForKeys();
		
		//Creation of Button Listener:
		ListenForButton lForButton = new ListenForButton();
		
		//Creation of Frame:
		this.frame = new JFrame("Cobblandia VI: Return of the Loo");
		this.frame.setSize(1172,895);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		this.frame.setVisible(true);
		this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.frame.addKeyListener(lForKeys);
				
		//Creation of Panel:
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setSize(1172,895);
		this.panel.setBackground(this.myBrown);
		this.frame.add(this.panel);
		
		//Addition of MapTiles to Panel:
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 18; j++) {
				this.mapTileGrid[i][j] = new MapTile(i,j);
				this.panel.add(this.mapTileGrid[i][j]);
			}
		}
		
		//Creation of Side Bar Title:
		this.sideBarTitle = new JLabel();
		this.sideBarTitle.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\SideBarImages\\sideBarTitle.png"));
		this.sideBarTitle.setBounds(866, 1, 305, 140);
		this.panel.add(this.sideBarTitle);
		
		//Creation of Side Bar Name Label:
		this.sideBarName = new JLabel(this.gamePlayer.playerName);
		this.sideBarName.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.sideBarName.setForeground(this.myBeige);
		this.sideBarName.setBounds(876, 151, 280, 30);
		this.panel.add(this.sideBarName);
		
		//Creation of Health Bar:
		this.healthBar = new JProgressBar();
		this.healthBar.setMaximum(this.gamePlayer.maximumHealth);
		this.healthBar.setValue(this.gamePlayer.maximumHealth);
		this.healthBar.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.healthBar.setStringPainted(true);
		this.healthBar.setBackground(this.myDarkRed);
		this.healthBar.setForeground(this.myDarkGreen);
		this.healthBar.setBorder(null);
		this.healthBar.setBounds(876, 191, 280, 30);
		this.panel.add(this.healthBar);
		
		//Creation of Side Bar Level Label:
		this.sideBarLevel = new JLabel("Level: " + Integer.toString(this.gamePlayer.playerLevel));
		this.sideBarLevel.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.sideBarLevel.setForeground(this.myBeige);
		this.sideBarLevel.setBounds(876, 231, 280, 30);
		this.panel.add(this.sideBarLevel);
		
		//Creation of Side Bar Cobbies Label:
		this.sideBarCobbies = new JLabel("Cobbies: " + Integer.toString(this.gamePlayer.playerCobbies));
		this.sideBarCobbies.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.sideBarCobbies.setForeground(this.myBeige);
		this.sideBarCobbies.setBounds(876, 271, 280, 30);
		this.panel.add(this.sideBarCobbies);
		
		//Creation of Side Bar Location Label:
		this.sideBarLocation = new JLabel("Map Location: " + Integer.toString(this.gamePlayer.xMapLocation) + " | " + Integer.toString(this.gamePlayer.yMapLocation));
		this.sideBarLocation.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.sideBarLocation.setForeground(this.myBeige);
		this.sideBarLocation.setBounds(876, 311, 280, 30);
		this.panel.add(this.sideBarLocation);
		
		
		//Creation of Side Bar Player Button:
		this.sideBarPlayer = new JButton();
		this.sideBarPlayer.setBorder(null);
		this.sideBarPlayer.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\SideBarImages\\sideBarPlayer.png"));
		this.sideBarPlayer.setBounds(866, 351, 305, 128);
		this.sideBarPlayer.addActionListener(lForButton);
		this.sideBarPlayer.setFocusable(false);
		this.panel.add(this.sideBarPlayer);

		//Creation of Side Bar Inventory Button:
		this.sideBarInventory = new JButton();
		this.sideBarInventory.setBorder(null);
		this.sideBarInventory.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\SideBarImages\\sideBarInventory.png"));
		this.sideBarInventory.setBounds(866, 489, 305, 128);
		this.sideBarInventory.addActionListener(lForButton);
		this.sideBarInventory.setFocusable(false);
		this.panel.add(this.sideBarInventory);
		
		//Creation of Side Bar Journal Button:
		this.sideBarJournal = new JButton();
		this.sideBarJournal.setBorder(null);
		this.sideBarJournal.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\SideBarImages\\sideBarJournal.png"));
		this.sideBarJournal.setBounds(866, 627, 305, 128);
		this.sideBarJournal.addActionListener(lForButton);
		this.sideBarJournal.setFocusable(false);
		this.panel.add(this.sideBarJournal);
		
		//Creation of Side Bar Help Button:
		this.sideBarHelp = new JButton();
		this.sideBarHelp.setBorder(null);
		this.sideBarHelp.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\SideBarImages\\sideBarHelp.png"));
		this.sideBarHelp.setBounds(866, 765, 305, 101);
		this.sideBarHelp.addActionListener(lForButton);
		this.sideBarHelp.setFocusable(false);
		this.panel.add(this.sideBarHelp);
		
		//Initial Projection of Map:
		mapProjectionWhole(this.mapTileGrid, this.gameUniverse, this.gamePlayer, "pf2");
		
	}
	
	//Player Movement Method:
	public static void playerMovement(MapTile[][] mapTileGrid, Universe gameUniverse, Player gamePlayer, char movementType, JLabel sideBarLocation) {
		
		if (movementType == 'w') {
			//Movement if player is one the edge of the map:
			if (gamePlayer.yTileLocation == 0 && gamePlayer.yMapLocation != 0) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation - 1].mapGrid[gamePlayer.xTileLocation][17].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation - 1].mapGrid[gamePlayer.xTileLocation][17].equals("gi")) {
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					gamePlayer.yTileLocation = 17;
					gamePlayer.yMapLocation = gamePlayer.yMapLocation - 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapProjectionWhole(mapTileGrid, gameUniverse, gamePlayer, "pb1");
					sideBarLocation.setText("Map Location: " + Integer.toString(gamePlayer.xMapLocation) + " | " + Integer.toString(gamePlayer.yMapLocation));
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pb1");
				}
			}
			//Movement if player is not on the edge of the map:
			else if (gamePlayer.yTileLocation != 0) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation - 1].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation - 1].equals("gi")) {
					String selectedTile = "";
					if (gamePlayer.yTileLocation % 2 == 0) {
						selectedTile = "pb1";
					}
					else {
						selectedTile = "pb2";
					}
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "g");
					gamePlayer.yTileLocation = gamePlayer.yTileLocation - 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, selectedTile);
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pb1");
				}
			}
		}
		else if (movementType == 'a') {
			//Movement if player is one the edge of the map:
			if (gamePlayer.xTileLocation == 0 && gamePlayer.xMapLocation != 0) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation - 1][gamePlayer.yMapLocation].mapGrid[17][gamePlayer.yTileLocation].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation - 1][gamePlayer.yMapLocation].mapGrid[17][gamePlayer.yTileLocation].equals("gi")) {
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					gamePlayer.xTileLocation = 17;
					gamePlayer.xMapLocation = gamePlayer.xMapLocation - 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapProjectionWhole(mapTileGrid, gameUniverse, gamePlayer, "pl2");
					sideBarLocation.setText("Map Location: " + Integer.toString(gamePlayer.xMapLocation) + " | " + Integer.toString(gamePlayer.yMapLocation));
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pl2");
				}
			}
			//Movement if player is not on the edge of the map:
			else if (gamePlayer.xTileLocation != 0) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation - 1][gamePlayer.yTileLocation].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation - 1][gamePlayer.yTileLocation].equals("gi")) {
					String selectedTile = "";
					if (gamePlayer.xTileLocation % 2 == 0) {
						selectedTile = "pl1";
					}
					else {
						selectedTile = "pl2";
					}				gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "g");
					gamePlayer.xTileLocation = gamePlayer.xTileLocation - 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, selectedTile);
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pl2");
				}
			}
		}
		else if (movementType == 's') {
			//Movement if player is one the edge of the map:
			if (gamePlayer.yTileLocation == 17 && gamePlayer.yMapLocation != 17) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation + 1].mapGrid[gamePlayer.xTileLocation][0].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation + 1].mapGrid[gamePlayer.xTileLocation][0].equals("gi")) {
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					gamePlayer.yTileLocation = 0;
					gamePlayer.yMapLocation = gamePlayer.yMapLocation + 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapProjectionWhole(mapTileGrid, gameUniverse, gamePlayer, "pf2");
					sideBarLocation.setText("Map Location: " + Integer.toString(gamePlayer.xMapLocation) + " | " + Integer.toString(gamePlayer.yMapLocation));
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pf2");
				}
			}
			//Movement if player is not on the edge of the map:
			else if (gamePlayer.yTileLocation != 17) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation + 1].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation + 1].equals("gi")) {
					String selectedTile = "";
					if (gamePlayer.yTileLocation % 2 == 0) {
						selectedTile = "pf1";
					}
					else {
						selectedTile = "pf2";
					}				gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "g");
					gamePlayer.yTileLocation = gamePlayer.yTileLocation + 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, selectedTile);
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pf2");
				}
			}
		}
		else {
			//Movement if player is one the edge of the map:
			if (gamePlayer.xTileLocation == 17 && gamePlayer.xMapLocation != 17) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation + 1][gamePlayer.yMapLocation].mapGrid[0][gamePlayer.yTileLocation].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation + 1][gamePlayer.yMapLocation].mapGrid[0][gamePlayer.yTileLocation].equals("gi")) {
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					gamePlayer.xTileLocation = 0;
					gamePlayer.xMapLocation = gamePlayer.xMapLocation + 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapProjectionWhole(mapTileGrid, gameUniverse, gamePlayer, "pr2");
					sideBarLocation.setText("Map Location: " + Integer.toString(gamePlayer.xMapLocation) + " | " + Integer.toString(gamePlayer.yMapLocation));
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pr2");
				}
			}
			//Movement if player is not on the edge of the map:
			else if (gamePlayer.xTileLocation != 17) {
				if (gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation + 1][gamePlayer.yTileLocation].equals("g") || gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation + 1][gamePlayer.yTileLocation].equals("gi")) {
					String selectedTile = "";
					if (gamePlayer.xTileLocation % 2 == 0) {
						selectedTile = "pr1";
					}
					else {
						selectedTile = "pr2";
					}				gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "g";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "g");
					gamePlayer.xTileLocation = gamePlayer.xTileLocation + 1;
					gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation].mapGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation] = "p";
					mapTilePlayerMovement(mapTileGrid, gamePlayer, selectedTile);
				}
				else {
					mapTilePlayerMovement(mapTileGrid, gamePlayer, "pr2");
				}
			}
		}
		
	}
	
	//Player Movement Map Tile Change Method:
	
	public static void mapTilePlayerMovement(MapTile[][] mapTileGrid, Player gamePlayer, String tileType) {
		
		mapTileGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation].changeTileType(mapTileGrid[gamePlayer.xTileLocation][gamePlayer.yTileLocation], tileType);
		
	}
	
	//Whole Map Projection Method:
	public static void mapProjectionWhole(MapTile[][] mapTileGrid, Universe gameUniverse, Player gamePlayer, String playerTileType) {
		
		Map mapToBeProjected = gameUniverse.listOfWorlds[gamePlayer.worldLocation].worldGrid[gamePlayer.xMapLocation][gamePlayer.yMapLocation];
		
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 18; j++) {
				//If the individual tile is a player tile:
				if (mapToBeProjected.mapGrid[i][j] == "p") {
					mapTileGrid[i][j].changeTileType(mapTileGrid[i][j], playerTileType);
				}
				//If the individual tile is any other map tile element:
				else {
					mapTileGrid[i][j].changeTileType(mapTileGrid[i][j], mapToBeProjected.mapGrid[i][j]);
				}
			}
		}
		
	}
	
	//Key Listener Class:
	private class ListenForKeys implements KeyListener {

		@Override
		public void keyPressed(KeyEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getKeyChar() == 'w') {
				playerMovement(mapTileGrid, gameUniverse, gamePlayer, 'w', sideBarLocation);
			}
			if (event.getKeyChar() == 'a') {
				playerMovement(mapTileGrid, gameUniverse, gamePlayer, 'a', sideBarLocation);
			}
			if (event.getKeyChar() == 's') {
				playerMovement(mapTileGrid, gameUniverse, gamePlayer, 's', sideBarLocation);
			}
			if (event.getKeyChar() == 'd') {
				playerMovement(mapTileGrid, gameUniverse, gamePlayer, 'd', sideBarLocation);
			}
			
		}

		@Override
		public void keyReleased(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	//Button Listener Class:
	private class ListenForButton implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource() == sideBarPlayer) {
				System.out.println("player");
			}
			if (event.getSource() == sideBarInventory) {
				System.out.println("inventory");
			}
			if (event.getSource() == sideBarJournal) {
				System.out.println("journal");
			}
			if (event.getSource() == sideBarHelp) {
				System.out.println("help");
			}
			
		}
		
	}
	
}
