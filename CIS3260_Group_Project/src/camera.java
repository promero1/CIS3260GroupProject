//import joption pane
import javax.swing.JOptionPane;

public class camera {
	// method to turn the camera on/off. If true (on), false (off). 
	public static void cameraSwitch(boolean onOff)
	{
		if (onOff == true)
		{
		JOptionPane.showMessageDialog(null,"The camera is on.");
		}
		if (onOff == false)
		{
		JOptionPane.showMessageDialog(null,"The camera is off.");
		}
	}
	//method to zoom the camera in
	public static void zoomIn() 
	{
		JOptionPane.showMessageDialog(null,"Camera is zoomed in");
	}
	//method to zoom camera out
	public static void zoomOut() 
	{
			JOptionPane.showMessageDialog(null,"Camera is zoomed out");
	}
}
