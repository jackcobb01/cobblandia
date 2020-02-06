import javax.swing.JFrame;

public class FrameStack {
	
	//Class Variables:
	JFrame currentFrame;
	MapFrame game;
	
	//Constructor:
	public FrameStack() {
		currentFrame = new StartFrame(this);
	}
	
	//Start Game Function:
	public void startGame() {
		this.currentFrame.dispose();;
		this.game = new MapFrame(this);
	}
	
	//Frame Management Function:
	public void frameManagement(int action) {
		if (action == 0) {
			this.currentFrame.dispose();
			this.game.changeVisibility(true);
		}
		else if (action == 1) {
			this.currentFrame.dispose();
			this.game.changeVisibility(true);
		}
		
		else if (action == -1) {
			this.currentFrame = new PlayerFrame(this);
			this.game.changeVisibility(false);
		}
	}
	
}
