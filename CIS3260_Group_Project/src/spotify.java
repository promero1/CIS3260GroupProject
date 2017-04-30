//import joption pane
import javax.swing.JOptionPane;

public class spotify {

	public static void main(String[] args) 
	{

	}
	
	public static void spotifySong()
	{
		String song =(JOptionPane.showInputDialog(null, "What song would you like to play?", "Spotify Menu",JOptionPane.PLAIN_MESSAGE));
		
		JOptionPane.showMessageDialog(null, song + " is now playing!");
	}
}
