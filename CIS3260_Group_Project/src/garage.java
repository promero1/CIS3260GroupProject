//import joption pane
import javax.swing.JOptionPane;
//using garage as the 'doors' component per project instructions. 
public class garage {
	//open close method, if true opens door. If false, closes door.
	public static void openClose(boolean openClose)
	{
		if (openClose == true)
		{
		JOptionPane.showMessageDialog(null,"Opening garage door");
		}
		if (openClose == false)
		{
		JOptionPane.showMessageDialog(null,"Closing garage door");
		}
	}
}
