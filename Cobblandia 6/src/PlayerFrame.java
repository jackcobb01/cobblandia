import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayerFrame extends JFrame{
	
	//FrameStack Object:
	FrameStack frameStack;

	//Class Constants:
	int skillCap = 100;
	
	//Class Variables:
	JPanel panel;
	JLabel columnOne;
	JLabel columnTwo;
	
	JLabel playerPortrait;
	JLabel name;
	JLabel level;
	JLabel cobbies;
	JProgressBar healthBar;
	
	JLabel determination;
	JProgressBar determinationBar;
	JLabel strength;
	JProgressBar strengthBar;
	JLabel wisdom;
	JProgressBar wisdomBar;
	JLabel combat;
	JProgressBar combatBar;
	JLabel sorcery;
	JProgressBar sorceryBar;
	JLabel dexterity;
	JProgressBar dexterityBar;
	JLabel craftmanship;
	JProgressBar craftmanshipBar;
	JLabel intelligence;
	JProgressBar intelligenceBar;
	JLabel cunning;
	JProgressBar cunningBar;
	
	JButton exitButton;
	
	//Class Colours:
	Color myBrown = new Color(106, 66, 45);
	Color myBeige = new Color(239, 209, 157);
	Color myDarkGreen = new Color(63, 125, 0);
	Color myDarkRed = new Color(142, 0 ,0);
	
	//Constructor:
	public PlayerFrame(FrameStack frameStack, Player gamePlayer) {
		
		//Establishment of Frame Stack Object:
		this.frameStack = frameStack;
		
		//Creation of Button Listener:
		ListenForButton lForButton = new ListenForButton();
		
		//Creation of Frame:
		this.setTitle("Cobblandia VI: Return of the Loo");
		this.setSize(1032,647);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Creation of Panel:
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setSize(1032,647);
		this.panel.setBackground(this.myBrown);
		this.add(this.panel);
		
		//Creation of Player Portrait:
		this.playerPortrait = new JLabel();
		this.playerPortrait.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\PlayerFrameImages\\playerFrameKnightProfile.png"));
		this.playerPortrait.setBounds(44,66,280,190);
		this.panel.add(this.playerPortrait);
		
		//Creation of Player Name Label:
		this.name = labelCreator(this.panel, gamePlayer.playerName, 44, 266);
		
		//Creation of Player Level Label:
		this.level = labelCreator(this.panel, "Player Level: " + Integer.toString(gamePlayer.playerLevel), 44, 306);
		
		//Creation of Player Cobbies Label:
		this.cobbies = labelCreator(this.panel, "Cobbies: " + Integer.toString(gamePlayer.playerCobbies), 44, 346);
		
		//Creation of Health Bar:
		this.healthBar = new JProgressBar();
		this.healthBar.setMaximum(gamePlayer.maximumHealth);
		this.healthBar.setValue(gamePlayer.currentHealth);
		this.healthBar.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.healthBar.setStringPainted(true);
		this.healthBar.setBackground(this.myDarkRed);
		this.healthBar.setForeground(this.myDarkGreen);
		this.healthBar.setBorder(null);
		this.healthBar.setBounds(44, 386, 280, 30);
		this.panel.add(this.healthBar);
		
		//Creation of Determination Label and Bar:
		this.determination = labelCreator(this.panel, "Determination: ", 420, 66);
	    this.determinationBar = barCreator(this.panel, this.skillCap, gamePlayer.determination, 700, 66);
		
		//Creation of Strength Label and Bar::
		this.strength = labelCreator(this.panel, "Strength: ", 420, 106);
		this.strengthBar = barCreator(this.panel, this.skillCap, gamePlayer.strength, 700, 106);
		
		//Creation of Wisdom Label and Bar:
		this.wisdom = labelCreator(this.panel, "Widsom: ", 420, 146);
		this.wisdomBar = barCreator(this.panel, this.skillCap, gamePlayer.wisdom, 700, 146);
		
		//Creation of Combat Label and Bar:
		this.combat = labelCreator(this.panel, "Combat: ", 420, 186);
		this.combatBar = barCreator(this.panel, this.skillCap, gamePlayer.combat, 700, 186);
		
		//Creation of Sorcery Label and Bar:
		this.sorcery = labelCreator(this.panel, "Sorcery: ", 420, 226);
		this.sorceryBar = barCreator(this.panel, this.skillCap, gamePlayer.sorcery, 700, 226);
		
		//Creation of Dexterity Label and Bar:
		this.dexterity = labelCreator(this.panel, "Dexterity: ", 420, 266);
		this.dexterityBar = barCreator(this.panel, this.skillCap, gamePlayer.dexterity, 700, 266);
		
		//Creation of Craftmanship Label and Bar:
		this.craftmanship = labelCreator(this.panel, "Craftmanship: ", 420, 306);
		this.craftmanshipBar = barCreator(this.panel, this.skillCap, gamePlayer.craftmanship, 700, 306);
		
		//Creation of Intelligence Label and Bar:
		this.intelligence = labelCreator(this.panel, "Intelligence: ", 420, 346);
		this.intelligenceBar = barCreator(this.panel, this.skillCap, gamePlayer.intelligence, 700, 346);
		
		//Creation of Cunning Label and Bar:
		this.cunning = labelCreator(this.panel, "Cunning: ", 420, 386);
		this.cunningBar = barCreator(this.panel, this.skillCap, gamePlayer.cunning, 700, 386);
		
		//Creation of Background Columns:
		this.columnOne = new JLabel();
		this.columnOne.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\PlayerFrameImages\\playerFrameColumnOne.png"));
		this.columnOne.setBounds(1,1,366,468);
		this.panel.add(this.columnOne);
		this.columnTwo = new JLabel();
		this.columnTwo.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\PlayerFrameImages\\playerFrameWideColumn.png"));
		this.columnTwo.setBounds(367,1,664,468);
		this.panel.add(this.columnTwo);
		
		//Creation of Exit Frame Button:
		this.exitButton = new JButton();
		this.exitButton.setBorder(null);
		this.exitButton.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\PlayerFrameImages\\playerFrameExit.png"));
		this.exitButton.setBounds(363,478,306,128);
		this.exitButton.addActionListener(lForButton);
		this.panel.add(this.exitButton);
		
	}
	
	//General Label Creator Method:
	public JLabel labelCreator(JPanel panel, String title, int xLocation, int yLocation) {
		JLabel lbl = new JLabel(title);
		lbl.setFont(new Font("Bahnshrift",Font.BOLD,24));
		lbl.setForeground(Color.DARK_GRAY);
		lbl.setBounds(xLocation, yLocation, 280, 30);
		panel.add(lbl);
		return lbl;
	}
	
	//Statistic Bar Creator Method:
	public JProgressBar barCreator(JPanel panel, int maximum, int current, int xLocation, int yLocation) {
		JProgressBar bar = new JProgressBar();
		bar.setMaximum(maximum);
		bar.setValue(current);
		bar.setFont(new Font("Bahnshrift",Font.BOLD,24));
		bar.setStringPainted(true);
		bar.setBackground(Color.lightGray);
		bar.setForeground(Color.DARK_GRAY);
		bar.setBorder(null);
		bar.setBounds(xLocation, yLocation, 280, 30);
		panel.add(bar);
		return bar;
	}
	
	//Button Listener Class:
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource() == exitButton) {
				frameStack.frameManagement(1);
			}
			
		}
		
	}
	
}
