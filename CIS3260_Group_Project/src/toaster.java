import javax.swing.JOptionPane;

public class toaster {
	
	public static void toasterSwitch(boolean onOff)
	{
		
		if (onOff == true)
		{
		JOptionPane.showMessageDialog(null,"The toaster is on.");
		}
		if (onOff == false)
		{
		JOptionPane.showMessageDialog(null,"The toaster is off.");
		}
		
	}

}
