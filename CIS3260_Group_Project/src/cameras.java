import javax.swing.JOptionPane;

public class cameras {
	
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
	
	public static void zoomIn() 
	{
		JOptionPane.showMessageDialog(null,"Camera is zoomed in");
	}
	
	public static void zoomOut() 
	{
			JOptionPane.showMessageDialog(null,"Camera is zoomed out");
	}
}
