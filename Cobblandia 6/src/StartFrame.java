import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartFrame extends JFrame{

	//FrameStack Object:
	FrameStack frameStack;
	
	//Class Variables:
	JPanel panel;
	JLabel titleLabel;
	JLabel subtitleLabel;
	JLabel titleImage;
	JButton newGameButton;
	
	//Constructor:
	public StartFrame(FrameStack frameStack) {
		
		//Establishment of Frame Stack Object:
		this.frameStack = frameStack;
		
		//Creation of Button Listener:
		ListenForButton lForButton = new ListenForButton();
		
		//Creation of Frame:
		this.setTitle("Cobblandia VI: Return of the Loo");
		this.setSize(400,576);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Creation of Panel:
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setSize(400,576);
		this.panel.setBackground(Color.LIGHT_GRAY);
		this.add(this.panel);
		
		//Creation of Title Label:
		this.titleLabel = new JLabel("Welcome to Cobblandia VI");
		this.titleLabel.setFont(new Font("Calibri",Font.BOLD,30));
		this.titleLabel.setBounds(31,20,330,26);
		this.panel.add(this.titleLabel);
		
		//Creation of Subtitle Label:
		this.subtitleLabel = new JLabel("Return of the Loo");
		this.subtitleLabel.setFont(new Font("Calibri",Font.BOLD,24));
		this.subtitleLabel.setBounds(106,56,180,20);
		this.panel.add(this.subtitleLabel);
		
		//Creation of Title Image:
		this.titleImage = new JLabel();
		this.titleImage.setIcon(new ImageIcon("C:\\Users\\jackr\\Documents\\GitHub\\cobblandia\\Cobblandia 6\\src\\LabelImages\\TitleImages\\titleNumber.png"));
		this.titleImage.setBounds(16,96,360,360);
		this.panel.add(this.titleImage);
		
		//Creation of New Game Button:
		this.newGameButton = new JButton("New Game");
		this.newGameButton.setFont(new Font("Calibri",Font.BOLD,24));
		this.newGameButton.setBackground(Color.YELLOW);
		this.newGameButton.setBounds(116,476,160,50);
		this.newGameButton.setBorder(null);
		this.newGameButton.addActionListener(lForButton);
		this.panel.add(this.newGameButton);
		
	}
	
	//Button Listener Class:
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource() == newGameButton) {
				frameStack.startGame();
			}
			
		}
		
	}
	
}
