//import joption pane
import javax.swing.JOptionPane;

public class lights {

	// method to turn lights on/off
	public static void lightSwitch(boolean onOff) 
	{
		if (onOff == true)
		{
		JOptionPane.showMessageDialog(null,"The lights are on.");
		}
		if (onOff == false)
		{
		JOptionPane.showMessageDialog(null,"The lights are off.");
		}
	}
		
}