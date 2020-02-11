import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayerFrame extends JFrame{
	
	//FrameStack Object:
	FrameStack frameStack;

	//Class Variables:
	JPanel panel;
	JLabel columnOne;
	JLabel columnTwo;
	JProgressBar healthBar;
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
		this.setSize(734,576);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Creation of Panel:
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setSize(400,540);
		this.panel.setBackground(this.myBrown);
		this.add(this.panel);
		
		//Creation of Health Bar:
		this.healthBar = new JProgressBar();
		this.healthBar.setMaximum(gamePlayer.maximumHealth);
		this.healthBar.setValue(gamePlayer.currentHealth);
		this.healthBar.setFont(new Font("Bahnshrift",Font.BOLD,24));
		this.healthBar.setStringPainted(true);
		this.healthBar.setBackground(this.myDarkRed);
		this.healthBar.setForeground(this.myDarkGreen);
		this.healthBar.setBorder(null);
		this.healthBar.setBounds(11, 101, 280, 30);
		this.panel.add(this.healthBar);
		
		//Creation of Title Image:
		this.columnOne = new JLabel();
		this.columnOne.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\PlayerFrameImages\\playerFrameColumnOne.png"));
		this.columnOne.setBounds(1,1,366,468);
		this.panel.add(this.columnOne);
				
		//Creation of Title Image:
		this.columnTwo = new JLabel();
		this.columnTwo.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\PlayerFrameImages\\playerFrameColumnTwo.png"));
		this.columnTwo.setBounds(367,1,366,468);
		this.panel.add(this.columnTwo);
		
		//Creation of Exit Frame Button:
		this.exitButton = new JButton("Exit");
		this.exitButton.setFont(new Font("Calibri",Font.BOLD,24));
		this.exitButton.setBackground(Color.YELLOW);
		this.exitButton.setBounds(288,479,160,50);
		this.exitButton.setBorder(null);
		this.exitButton.addActionListener(lForButton);
		this.panel.add(this.exitButton);
		
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
