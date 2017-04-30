//import joption pane
import javax.swing.JOptionPane;

public class toaster {
	
	public static void toasterSwitch(boolean onOff)
	{
		
		if (onOff == true)
		{
		//Displays message to set the toaster level
		String level =(JOptionPane.showInputDialog(null, "What level would you like the toaster set?(low, medium, high)", "Home Systems Menu",JOptionPane.PLAIN_MESSAGE));
		level = level.toLowerCase();
		
		//if conditions, will display corresponding message depending on temperature input.
		if(level.contains("low"))
		{
			JOptionPane.showMessageDialog(null,"The toaster is ON! Set to low.");
	    }
		if(level.contains("medium"))
		{
			JOptionPane.showMessageDialog(null,"The toaster is ON! Set to medium.");
	    }
		if(level.contains("high"))
		{
			JOptionPane.showMessageDialog(null,"The toaster is ON! Set to high.");
	    }
		}
		//if boolean is false, turns toaster off
		if (onOff == false)
		{
		JOptionPane.showMessageDialog(null,"The toaster is off.");
		}
		
	}

}
