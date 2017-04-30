//import joption pane
import javax.swing.JOptionPane;

public class oven {

	//Method to turn the oven on/off and have option to set temperature
	public static void onOff(boolean onOff)
	{
		//if true, will prompt user to enter a temperature to set the oven to. If false, will turn oven off.
		if (onOff == true)
		{
			//initialize temperature variable. Set to 501 as it is not a valid temperature.Lopp will iterate through and prompt to enter a valid number.
		int temperature = 501;
		//will prompt user to enter a value for temperature. String data type used. 
		String userInput = (JOptionPane.showInputDialog(null, "What temperature would you like to be set?", "Oven Menu",JOptionPane.PLAIN_MESSAGE));
		//try/catch loop in case user enters something other than a number.
		try
		{
			//converts user input to temperature int variable. 
			temperature = Integer.parseInt(userInput);
		}
		//catch condition, if a number format exception is thrown, then the following will be displayed to have user input a number.
		catch (NumberFormatException ex) 
		{
			JOptionPane.showMessageDialog(null,"Not a valid input");
			userInput = (JOptionPane.showInputDialog(null, "What temperature would you like to be set?", "Oven Menu",JOptionPane.PLAIN_MESSAGE));
		}
		//if user inputs a number between 0-500
		if (temperature <= 500)
		{
		JOptionPane.showMessageDialog(null,"Turning oven on, setting temperature to: "+ temperature + " degrees!");
		}
		//prompts user to put a proper temperature in if not 0-500 , calls method again
		else
		{
			JOptionPane.showMessageDialog(null,"Please enter a proper temperature from 0-500");
			oven.onOff(onOff);
		}
		//if onOff = false, displays corresponding message.
		if (onOff == false)
		{
		JOptionPane.showMessageDialog(null,"Turning oven off");
		}
	}
}
}
