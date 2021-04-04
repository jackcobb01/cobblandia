import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreationFrame extends JFrame{
	
	//FrameStack Object:
	FrameStack frameStack;
	
	//Class image file path:
	String creationFramePath = "C:\\Users\\jackr\\OneDrive\\Documents\\Java Projects\\The Cobblandia\\src\\LabelImages\\CreationFrameImages\\";

	//Class Constants:
	int skillCap = 100;
	int availablePoints = 50;
	int pointCap = 15;
	
	//Class Variables:
	int determinationPoints = 0;
	int strengthPoints = 0;
	int wisdomPoints = 0;
	int combatPoints = 0;
	int sorceryPoints = 0;
	int dexterityPoints = 0;
	int craftmanshipPoints = 0;
	int intelligencePoints = 0;
	int cunningPoints = 0;
	int pointsSpent = 0;
	
	JPanel panel;
	JLabel background;
	JLabel insertName;
	JTextField name;
	
	JLabel determination;
	JProgressBar determinationBar;
	JButton dtP1;
	JButton dtP5;
	JButton dtM1;
	JButton dtM5;
	
	JLabel strength;
	JProgressBar strengthBar;
	JButton stP1;
	JButton stP5;
	JButton stM1;
	JButton stM5;
	
	JLabel wisdom;
	JProgressBar wisdomBar;
	JButton wiP1;
	JButton wiP5;
	JButton wiM1;
	JButton wiM5;
	
	JLabel combat;
	JProgressBar combatBar;
	JButton coP1;
	JButton coP5;
	JButton coM1;
	JButton coM5;
	
	JLabel sorcery;
	JProgressBar sorceryBar;
	JButton soP1;
	JButton soP5;
	JButton soM1;
	JButton soM5;
	
	JLabel dexterity;
	JProgressBar dexterityBar;
	JButton dxP1;
	JButton dxP5;
	JButton dxM1;
	JButton dxM5;
	
	JLabel craftmanship;
	JProgressBar craftmanshipBar;
	JButton crP1;
	JButton crP5;
	JButton crM1;
	JButton crM5;
	
	JLabel intelligence;
	JProgressBar intelligenceBar;
	JButton inP1;
	JButton inP5;
	JButton inM1;
	JButton inM5;
	
	JLabel cunning;
	JProgressBar cunningBar;
	JButton cuP1;
	JButton cuP5;
	JButton cuM1;
	JButton cuM5;
	
	JLabel descriptionOne;
	JLabel descriptionTwo;
	JButton continueButton;
	JLabel continueLabel;
	
	//Class Colours:
	Color myBrown = new Color(106, 66, 45);
	Color myBeige = new Color(239, 209, 157);
	Color myDarkGreen = new Color(63, 125, 0);
	Color myDarkRed = new Color(142, 0 ,0);
	
	//Constructor:
	public CreationFrame(FrameStack frameStack) {
		
		//Establishment of Frame Stack Object:
		this.frameStack = frameStack;
		
		//Creation of Button Listener:
		ListenForButton lForButton = new ListenForButton();
		
		//Creation of Frame:
		this.setTitle("Cobblandia VI: Return of the Loo");
		this.setSize(894,770);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Creation of Panel:
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setSize(894,770);
		this.panel.setBackground(this.myBrown);
		this.add(this.panel);
		
		//Creation of Insert Name Label and Text Field:
		this.insertName = labelCreator(this.panel, "Insert Player Name:", 80, 67);
		this.name = new JTextField();
		this.name.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.name.setForeground(this.myBeige);
		this.name.setBorder(null);
		this.name.setBackground(this.myBrown);
		this.name.setBounds(440, 67, 280, 30);
		this.panel.add(this.name);
		
		//Creation of Determination Label, Bar and Buttons:
		this.determination = labelCreator(this.panel, "Determination:", 80, 107);
		this.determinationBar = barCreator(this.panel, this.skillCap, 0, 440, 107);
		this.dtM1 = buttonCreator(this.panel, -1, lForButton, 400, 107);
		this.dtM5 = buttonCreator(this.panel, -5, lForButton, 360, 107);
		this.dtP1 = buttonCreator(this.panel, 1, lForButton, 730, 107);
		this.dtP5 = buttonCreator(this.panel, 5, lForButton, 770, 107);
		
		//Creation of Strength Label, Bar and Buttons:
		this.strength = labelCreator(this.panel, "Strength:", 80, 147);
		this.strengthBar = barCreator(this.panel, this.skillCap, 0, 440, 147);
		this.stM1 = buttonCreator(this.panel, -1, lForButton, 400, 147);
		this.stM5 = buttonCreator(this.panel, -5, lForButton, 360, 147);
		this.stP1 = buttonCreator(this.panel, 1, lForButton, 730, 147);
		this.stP5 = buttonCreator(this.panel, 5, lForButton, 770, 147);
				
		//Creation of Wisdom Label, Bar and Buttons:
		this.wisdom = labelCreator(this.panel, "Wisdom:", 80, 187);
		this.wisdomBar = barCreator(this.panel, this.skillCap, 0, 440, 187);
		this.wiM1 = buttonCreator(this.panel, -1, lForButton, 400, 187);
		this.wiM5 = buttonCreator(this.panel, -5, lForButton, 360, 187);
		this.wiP1 = buttonCreator(this.panel, 1, lForButton, 730, 187);
		this.wiP5 = buttonCreator(this.panel, 5, lForButton, 770, 187);
				
		//Creation of Combat Label, Bar and Buttons:
		this.combat = labelCreator(this.panel, "Combat:", 80, 227);
		this.combatBar = barCreator(this.panel, this.skillCap, 0, 440, 227);
		this.coM1 = buttonCreator(this.panel, -1, lForButton, 400, 227);
		this.coM5 = buttonCreator(this.panel, -5, lForButton, 360, 227);
		this.coP1 = buttonCreator(this.panel, 1, lForButton, 730, 227);
		this.coP5 = buttonCreator(this.panel, 5, lForButton, 770, 227);
				
		//Creation of Sorcery Label, Bar and Buttons:
		this.sorcery = labelCreator(this.panel, "Sorcery:", 80, 267);
		this.sorceryBar = barCreator(this.panel, this.skillCap, 0, 440, 267);
		this.soM1 = buttonCreator(this.panel, -1, lForButton, 400, 267);
		this.soM5 = buttonCreator(this.panel, -5, lForButton, 360, 267);
		this.soP1 = buttonCreator(this.panel, 1, lForButton, 730, 267);
		this.soP5 = buttonCreator(this.panel, 5, lForButton, 770, 267);
		
		//Creation of Dexterity Label, Bar and Buttons:
		this.dexterity = labelCreator(this.panel, "Dexterity:", 80, 307);
		this.dexterityBar = barCreator(this.panel, this.skillCap, 0, 440, 307);
		this.dxM1 = buttonCreator(this.panel, -1, lForButton, 400, 307);
		this.dxM5 = buttonCreator(this.panel, -5, lForButton, 360, 307);
		this.dxP1 = buttonCreator(this.panel, 1, lForButton, 730, 307);
		this.dxP5 = buttonCreator(this.panel, 5, lForButton, 770, 307);
		
		//Creation of Craftmanship Label, Bar and Buttons:
		this.craftmanship = labelCreator(this.panel, "Craftmanship:", 80, 347);
		this.craftmanshipBar = barCreator(this.panel, this.skillCap, 0, 440, 347);
		this.crM1 = buttonCreator(this.panel, -1, lForButton, 400, 347);
		this.crM5 = buttonCreator(this.panel, -5, lForButton, 360, 347);
		this.crP1 = buttonCreator(this.panel, 1, lForButton, 730, 347);
		this.crP5 = buttonCreator(this.panel, 5, lForButton, 770, 347);
		
		//Creation of Intelligence Label, Bar and Buttons:
		this.intelligence = labelCreator(this.panel, "Intelligence:", 80, 387);
		this.intelligenceBar = barCreator(this.panel, this.skillCap, 0, 440, 387);
		this.inM1 = buttonCreator(this.panel, -1, lForButton, 400, 387);
		this.inM5 = buttonCreator(this.panel, -5, lForButton, 360, 387);
		this.inP1 = buttonCreator(this.panel, 1, lForButton, 730, 387);
		this.inP5 = buttonCreator(this.panel, 5, lForButton, 770, 387);
		
		//Creation of Cunning Label, Bar and Buttons:
		this.cunning = labelCreator(this.panel, "Cunning:", 80, 427);
		this.cunningBar = barCreator(this.panel, this.skillCap, 0, 440, 427);
		this.cuM1 = buttonCreator(this.panel, -1, lForButton, 400, 427);
		this.cuM5 = buttonCreator(this.panel, -5, lForButton, 360, 427);
		this.cuP1 = buttonCreator(this.panel, 1, lForButton, 730, 427);
		this.cuP5 = buttonCreator(this.panel, 5, lForButton, 770, 427);
		
		//Creation of Description Labels:
		this.descriptionOne = new JLabel("Create a player name and add to your starting stats.");
		this.descriptionOne.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.descriptionOne.setForeground(Color.DARK_GRAY);
		this.descriptionOne.setBounds(80, 467, 720, 30);
		this.panel.add(this.descriptionOne);
		this.descriptionTwo = new JLabel("You have " + Integer.toString(this.availablePoints - this.pointsSpent) + " points to spend!");
		this.descriptionTwo.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.descriptionTwo.setForeground(Color.DARK_GRAY);
		this.descriptionTwo.setBounds(80, 507, 720, 30);
		this.panel.add(this.descriptionTwo);
		
		//Creation of Background:
		this.background = new JLabel();
		this.background.setIcon(new ImageIcon(creationFramePath + "creationFrameBackground.png"));
		this.background.setBounds(1,1,882,590);
		this.panel.add(this.background);
		
		//Creation of Continue Button and Label:
		this.continueButton = new JButton();
		this.continueButton.setBorder(null);
		this.continueButton.setIcon(new ImageIcon(creationFramePath + "continue.png"));
		this.continueButton.setBounds(294,591,306,128);
		this.continueButton.addActionListener(lForButton);
		this.panel.add(this.continueButton);
		this.continueLabel = new JLabel();
		this.continueLabel.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.continueLabel.setForeground(this.myBeige);
		this.continueLabel.setBounds(80, 591, 226, 30); //294, 729
		this.panel.add(this.continueLabel);
		
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
	
	//General Button Creator Method:
	public JButton buttonCreator(JPanel panel, int typeOfButton, ListenForButton lForButton, int xLocation, int yLocation) {
		JButton button = new JButton();
		if (typeOfButton == 1) {
			button.setIcon(new ImageIcon(creationFramePath + "p1Image.png"));
		}
		else if (typeOfButton == 5) {
			button.setIcon(new ImageIcon(creationFramePath + "p5Image.png"));
		}
		else if (typeOfButton == -1) {
			button.setIcon(new ImageIcon(creationFramePath + "m1Image.png"));
		}
		else {
			button.setIcon(new ImageIcon(creationFramePath + "m5Image.png"));
		}
		button.setBounds(xLocation,yLocation,30,30);
		button.setBorder(null);
		button.addActionListener(lForButton);
		panel.add(button);
		return button;
	}
	
	//Add to Skills Method:
	public void changeSkills(Object skill, int change) {
		if (skill.equals(dtM1) || skill.equals(dtM5) || skill.equals(dtP1) || skill.equals(dtP5)) {
			if (0 <= this.determinationPoints + change && this.pointCap >= this.determinationPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.determinationPoints = this.determinationPoints + change;
				this.determinationBar.setValue(this.determinationPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(stM1) || skill.equals(stM5) || skill.equals(stP1) || skill.equals(stP5)) {
			if (0 <= this.strengthPoints + change && this.pointCap >= this.strengthPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.strengthPoints = this.strengthPoints + change;
				this.strengthBar.setValue(this.strengthPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(wiM1) || skill.equals(wiM5) || skill.equals(wiP1) || skill.equals(wiP5)) {
			if (0 <= this.wisdomPoints + change && this.pointCap >= this.wisdomPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.wisdomPoints = this.wisdomPoints + change;
				this.wisdomBar.setValue(this.wisdomPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(coM1) || skill.equals(coM5) || skill.equals(coP1) || skill.equals(coP5)) {
			if (0 <= this.combatPoints + change && this.pointCap >= this.combatPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.combatPoints = this.combatPoints + change;
				this.combatBar.setValue(this.combatPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(soM1) || skill.equals(soM5) || skill.equals(soP1) || skill.equals(soP5)) {
			if (0 <= this.sorceryPoints + change && this.pointCap >= this.sorceryPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.sorceryPoints = this.sorceryPoints + change;
				this.sorceryBar.setValue(this.sorceryPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(dxM1) || skill.equals(dxM5) || skill.equals(dxP1) || skill.equals(dxP5)) {
			if (0 <= this.dexterityPoints + change && this.pointCap >= this.dexterityPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.dexterityPoints = this.dexterityPoints + change;
				this.dexterityBar.setValue(this.dexterityPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(crM1) || skill.equals(crM5) || skill.equals(crP1) || skill.equals(crP5)) {
			if (0 <= this.craftmanshipPoints + change && this.pointCap >= this.craftmanshipPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.craftmanshipPoints = this.craftmanshipPoints + change;
				this.craftmanshipBar.setValue(this.craftmanshipPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(inM1) || skill.equals(inM5) || skill.equals(inP1) || skill.equals(inP5)) {
			if (0 <= this.intelligencePoints + change && this.pointCap >= this.intelligencePoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.intelligencePoints = this.intelligencePoints + change;
				this.intelligenceBar.setValue(this.intelligencePoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		else if (skill.equals(cuM1) || skill.equals(cuM5) || skill.equals(cuP1) || skill.equals(cuP5)) {
			if (0 <= this.cunningPoints + change && this.pointCap >= this.cunningPoints + change && this.pointsSpent + change <= this.availablePoints) {
				this.cunningPoints = this.cunningPoints + change;
				this.cunningBar.setValue(this.cunningPoints);
				this.pointsSpent = this.pointsSpent + change;
			}
		}
		this.descriptionTwo.setText("You have " + Integer.toString(this.availablePoints - this.pointsSpent) + " points to spend!");
	}
	
	//Button Listener Class:
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource() == continueButton) {
				if ((name.getText().equals(""))) {
					continueLabel.setText("You need a name!");
				}
				else if (availablePoints - pointsSpent != 0) {
					continueLabel.setText("Spend the points!");
				}
				else  {
					frameStack.createCharacter(new Player(0,0,0,0,0, 'k', name.getText(), 1, 0, 100, 50, determinationPoints, strengthPoints, wisdomPoints, combatPoints, sorceryPoints, dexterityPoints, craftmanshipPoints, intelligencePoints, cunningPoints));
				}
			}
			if (event.getSource() == dtM1 || event.getSource() == stM1 || event.getSource() == wiM1 || event.getSource() == coM1 || event.getSource() == soM1 || event.getSource() == dxM1 || event.getSource() == crM1 || event.getSource() == inM1 || event.getSource() == cuM1) {
				changeSkills(event.getSource(), -1);
			}
			if (event.getSource() == dtM5 || event.getSource() == stM5 || event.getSource() == wiM5 || event.getSource() == coM5 || event.getSource() == soM5 || event.getSource() == dxM5 || event.getSource() == crM5 || event.getSource() == inM5 || event.getSource() == cuM5) {
				changeSkills(event.getSource(), -5);
			}
			if (event.getSource() == dtP1 || event.getSource() == stP1 || event.getSource() == wiP1 || event.getSource() == coP1 || event.getSource() == soP1 || event.getSource() == dxP1 || event.getSource() == crP1 || event.getSource() == inP1 || event.getSource() == cuP1) {
				changeSkills(event.getSource(), 1);
			}
			if (event.getSource() == dtP5 || event.getSource() == stP5 || event.getSource() == wiP5 || event.getSource() == coP5 || event.getSource() == soP5 || event.getSource() == dxP5 || event.getSource() == crP5 || event.getSource() == inP5 || event.getSource() == cuP5) {
				changeSkills(event.getSource(), 5);
			}
			
		}
		
	}
	
}
